package Game.Scenes.GameScene.Entites.Player;

import Game.Scenes.GameScene.Entites.Bullet.Bullet;
import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.Entites.Player.DamageTypes.HitBox;
import Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades.*;
import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.UI.ProgressBar.ProgressBar;
import System.Logging.Logger;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

import static System.Setup.Setup.getSceneManager;
import static System.Util.Utils.collision;
import static java.lang.Math.*;

public class Player extends Entity {
    public float SPD,ATK,DEF,ATK_SPEED,MAX_HEALTH,EXP,LVL,KB,HEALTH_REGEN;
    private float visibleXP;
    private float health;
    private boolean movingLeft;
    private float attackTimer;
    public String name;
    private String textureName;
    private ProgressBar progressBar;
    private Upgrade[] upgrades = {};
    private String attackType;
    private int visibleHitTimer = 0;

    public Player(float xa, float ya) {
        super(xa, ya);
        name = "";
        textureName = "basicCharacter";
        attackType = "melee";
        EXP=0;
        LVL=1;
        SPD = 3;
        ATK = 20;
        DEF = 0;
        ATK_SPEED = 10;
        MAX_HEALTH = 100;
        KB=20;
        HEALTH_REGEN = 100;
        health = MAX_HEALTH;
        attackTimer = 0;
        setFriction(0.6f);

        addUpgrade(new AttackUpgrade());
        addUpgrade(new DefenceUpgrade());
        addUpgrade(new SpeedUpgrade());
        addUpgrade(new HealthUpgrade());
        addUpgrade(new KnockbackUpgrade());
        addUpgrade(new RegenUpgrade());
        setUpgrades();
    }

    //basic

    public void onStartup(){
        setRender(new PlayerRender());
        setW(64);
        setH(64);
    }
    void updateRenderImage(float dir,boolean mouse){

        if(!mouse) {
            if (movingLeft) {
                setRenderImage("player."+textureName+".idleLeft");
            } else {
                setRenderImage("player."+textureName+".idleRight");
            }
        }else{
            if(cos(dir)>0){
                movingLeft=false;
                StringBuilder sb = new StringBuilder("player.");
                setRenderImage(sb.append(textureName).append(".rightWalk").toString());
            }else if(cos(dir)<0){
                movingLeft=true;
                StringBuilder sb = new StringBuilder("player.");
                setRenderImage(sb.append(textureName).append(".leftWalk").toString());
            }
        }
    }

    //events

    public void whileClick(int button){
        PApplet applet = Setup.getApplet();
        if(button==applet.LEFT){
            leftClick(applet);
        }
        if(button==applet.RIGHT){
            rightClick(applet);
        }
    }
    public void everyFrame(){
        updateTimers();
        updateRenderImage(0,false);
        healthRegen();
    }
    void updateTimers(){
        attackTimer-=1;
        visibleHitTimer-=1;
    }
    void healthRegen(){
        if(Setup.getApplet().frameCount%HEALTH_REGEN==0&&health<MAX_HEALTH){
            health+=1;
            updateHealthBar();
            Logger.log("player regenerated 1 health point and is now at "+health+"HP","game");
        }
    }
    void leftClick(PApplet applet){
        float x = 250;
        float y = 250;
        float dir = PApplet.atan2(applet.mouseY-y,applet.mouseX-x);
        float mag = SPD;
        setX((float) (getX()+cos(dir)*mag));
        setY((float) (getY()+sin(dir)*mag));
        updateRenderImage(dir,true);
    }
    void rightClick(PApplet applet){
        float x = 250;
        float y = 250;
        float dir = PApplet.atan2(applet.mouseY-y,applet.mouseX-x);
        float mag = -SPD;
        setX((float) (getX()+cos(dir)*mag));
        setY((float) (getY()+sin(dir)*mag));
        updateRenderImage(dir,true);
    }

    public void setUpgrades(){}
    public void whileKey(char key){
        Scene currentScene = getSceneManager().getCurrentScene();
        PApplet applet = Setup.getApplet();
        float x = 250;
        float y = 250;
        float dir = PApplet.atan2(applet.mouseY-y,applet.mouseX-x);
        float mag = 10f;
        if(key==' ') {
            if(attackType=="ranged") {
                ranged(dir, mag, currentScene);
            }
            if(attackType=="melee") {
                melee(dir, mag, currentScene);
            }
        }
    }

    //attack stuff

    public void ranged(float dir,float mag,Scene currentScene){
        if (attackTimer <= 0){
            Entity bullet = new Bullet(getX() + getW() / 2, getY() + getH() / 2);
            bullet.setXvel((float) (cos(dir) * mag));
            bullet.setYvel((float) (sin(dir) * mag));
            currentScene.addEntity(bullet);
            attackTimer = ATK_SPEED;
        }
    }
    public void melee(float dir,float mag,Scene currentScene){
        if (attackTimer <= 0){
            HitBox hitBox = new HitBox((float) (getX()+cos(dir)*30), (float) (getY()+sin(dir)*30));
            hitBox.setW(64);
            hitBox.setH(64);
            hitBox.setDamage(ATK);
            currentScene.addEntity(hitBox);
            attackTimer = ATK_SPEED;
        }
    }
    public void hit(float atk, Enemy e) {
        health-=atk-(atk*(DEF/100));
        updateHealthBar();
        Logger.log("player took a hit and is now at "+health+"HP","game");
        visibleHitTimer=5;
        if(health<=0){
            kill();
            health=0;
        }
        knockBackSelf(e.KB,e);
    }
    void knockBackSelf(float val, Entity e){
        float x = e.getX();
        float y = e.getY();
        float dir = PApplet.atan2(getY()-y,getX()-x);
        setXvel((float) ((cos(dir)*val)));
        setYvel((float) ((sin(dir)*val)));
    }
    public void updateHealthBar(){
        GameScene scene = (GameScene) getSceneManager().getSceneByName("gameScene");
        scene.progressBar.setLerp(round(health)/MAX_HEALTH);
    }
    public void addEXP(float expAdd) {
        EXP+=expAdd;
        visibleXP+=expAdd;
        int nextLevel = (int) ceil(((LVL*LVL)*2));
        if(visibleXP>=nextLevel){
            levelUp();
        }
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.expBar.setLerp(round(visibleXP/nextLevel*10)/10f);
    }
    public void levelUp(){
        LVL+=1;
        visibleXP=0;
        Setup.getSceneManager().changeScene("upgradeScene");
    }

    //getters and setters

    public void setRenderImage(String s){
        PlayerRender r = (PlayerRender) getRender();
        r.texturePath = s;
    }
    public String getAttackType() {
        return attackType;
    }
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
    public String getTextureName() {
        return textureName;
    }
    public void setTextureName(String textureName) {
        this.textureName = textureName;
    }

    public Upgrade[] getUpgrades() {
        return upgrades;
    }
    public void addUpgrade(Upgrade u) {
        upgrades = (Upgrade[]) PApplet.append(upgrades,u);
    }
    public Upgrade getRandomUpgrade() {
        Upgrade rnd = upgrades[(int) Setup.getApplet().random(0,upgrades.length)];
        return rnd;
    }

    public int getVisibleHitTimer() {
        return visibleHitTimer;
    }
}
