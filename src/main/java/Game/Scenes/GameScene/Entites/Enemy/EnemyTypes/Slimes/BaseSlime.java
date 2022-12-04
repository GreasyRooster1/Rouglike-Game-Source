package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes;

import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class BaseSlime extends Enemy {
    public BaseSlime(float xa, float ya) {
        super(xa, ya);
    }

    public void movement(){
        PApplet applet = Setup.getApplet();
        GameScene currentScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        float x = currentScene.player.getX();
        float y = currentScene.player.getY();
        float dir = PApplet.atan2(y-getY(),x-getX());
        float mag = SPD/2;
        if(TextureLoader.getAnimationClass(getTexturePath()).getFrame()>=3){
            mag = SPD;
        }
        setX((float) (getX()+(cos(dir)*mag)));
        setY((float) (getY()+(sin(dir)*mag)));
    }
}
