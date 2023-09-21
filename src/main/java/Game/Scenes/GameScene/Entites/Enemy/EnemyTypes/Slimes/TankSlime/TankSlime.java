package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.TankSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.TankSlime.TankSlimeBullet.TankSlimeBullet;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;
import processing.core.PApplet;

public class TankSlime extends BaseSlime {
    public TankSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.tankSlime.left.jumpAnim");
        SPD = 1f;
        ATK=20;
        MAX_HEALTH=250;
        EXP_VALUE = 9;
        ATTACK_SPEED = 300;
        setW(64);
        setH(64);
        setMovementFrames(new int[]{4,5,6,7,8,9,10});
    }
    public void onAttack(){
        Player player = ((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player;
        if(PApplet.dist(getX(),getY(),player.getX(),player.getY())<500){
            Setup.getSceneManager().getCurrentScene().addEntity(new TankSlimeBullet(getX(),getY()));
        }
    }
    public void slimeEveryFrame(){
        Player player = ((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player;
        if(getX()<=player.getX()){
            setTexturePath("enemies.slimes.tankSlime.right.jumpAnim");
        }else{
            setTexturePath("enemies.slimes.tankSlime.left.jumpAnim");
        }
    }
}

