package Game.Scenes.GameScene.Entites.Enemy.BaseEnemy;

import Game.Scenes.GameScene.Entites.Player.DamageEntity.DamageEntity;
import Game.Scenes.GameScene.Entites.Enemy.Spawning.EnemySpawning;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PApplet;

import static System.Util.Utils.collision;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Enemy extends Entity {
    public float SPD,ATK,DEF,HIT_SPEED,MAX_HEALTH,EXP_VALUE;
    float health;
    float hitTimer;
    private String texturePath;
    public Enemy(float xa, float ya) {
        super(xa, ya);
        hitTimer = 0;
        health = 100;
        SPD = 2;
        ATK = 1;
        DEF = 100;
        HIT_SPEED = 20;
        MAX_HEALTH = 100;
        EXP_VALUE = 1;
        setXvel(0);
        setYvel(0);
        setW(32);
        setH(32);
        setFriction(0.6f);
        EnemySpawning.enemyCount++;
    }

    public void onStartup(){
        setRender(new EnemyRender());
    }
    public void everyFrame(){
        movement();
        checkBullet();
        checkHit();
    }
    void checkBullet(){
        GameScene currentScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        Player player = (Player) currentScene.player;
        for (Entity e : currentScene.entities) {
            if(DamageEntity.class.isAssignableFrom(e.getClass())){
                if(collision(getX(),getY(),getW(),getH(),e.getX(),e.getY(),e.getW(),e.getH())) {
                    e.kill();
                    health -= ((DamageEntity) e).getDamage();
                    float x = currentScene.player.getX();
                    float y = currentScene.player.getY();
                    float dir = PApplet.atan2(getY()-y,getX()-x);
                    setXvel((float) ((cos(dir)*player.KB)));
                    setYvel((float) ((sin(dir)*player.KB)));
                }
            }
        }
        if(health<=0){
            player.addEXP(EXP_VALUE);
            EnemySpawning.enemiesKilled++;
            EnemySpawning.enemyCount--;
            kill();
        }

    }
    public void movement(){
        PApplet applet = Setup.getApplet();
        GameScene currentScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        float x = currentScene.player.getX();
        float y = currentScene.player.getY();
        float dir = PApplet.atan2(y-getY(),x-getX());
        setX((float) (getX()+(cos(dir)*SPD)));
        setY((float) (getY()+(sin(dir)*SPD)));
    }
    void checkHit(){
        GameScene currentScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        Player player = (Player) currentScene.player;
        if(hitTimer<=0) {
            if (collision(currentScene.player, this)) {
                hitTimer=HIT_SPEED;
                player.hit(ATK);
            }
        }
        hitTimer--;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
    }
}
