package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes;

import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class BaseSlime extends Enemy {
    private int[] movementFrames = {};
    public BaseSlime(float xa, float ya) {
        super(xa, ya);
        movementFrames = new int[]{3,4,5};
    }
    public void enemyEveryFrame(){
        slimeEveryFrame();
    }
    public void movement(){
        PApplet applet = Setup.getApplet();
        GameScene currentScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        float x = currentScene.player.getX();
        float y = currentScene.player.getY();
        float dir = PApplet.atan2(y-getY(),x-getX());
        float mag = SPD/7;
        for (int movementFrame : movementFrames) {
            if(TextureLoader.getAnimationClass(getTexturePath()).getFrame()>=movementFrame){
                mag = SPD;
            }
        }
        setX((float) (getX()+(cos(dir)*mag)));
        setY((float) (getY()+(sin(dir)*mag)));
    }

    public int[] getMovementFrames() {
        return movementFrames;
    }

    public void setMovementFrames(int[] movementFrames) {
        this.movementFrames = movementFrames;
    }
    public void slimeEveryFrame(){

    }
}
