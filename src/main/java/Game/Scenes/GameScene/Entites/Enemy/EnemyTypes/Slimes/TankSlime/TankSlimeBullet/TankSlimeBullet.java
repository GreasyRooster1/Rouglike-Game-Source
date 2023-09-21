package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.TankSlime.TankSlimeBullet;

import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Setup.Setup;
import processing.core.PApplet;

import static System.Util.Utils.collision;
import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

public class TankSlimeBullet extends Enemy {
    public TankSlimeBullet(float xa, float ya) {
        super(xa, ya);
        Player player = ((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player;
        float dir = PApplet.atan2(player.getY()-getY(),player.getX()-getX());
        float mag = 3f;
        setW(16);
        setH(16);
        setYvel(sin(dir)*mag);
        setXvel(cos(dir)*mag);
        setFriction(1);
        setRender(new TankSlimeBulletRender());
    }
    public void everyFrame(){
        Player player = ((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player;
        if(PApplet.dist(getX(),getY(),player.getX(),player.getY())>1000){
            kill();
        }
        if(collision(this,player)){
            player.hit(7,this);
            kill();
        }
    }
    public void onStartup(){

    }
}
