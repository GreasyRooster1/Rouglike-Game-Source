package Game.Scenes.GameScene.Entites.Bullet;

import Game.Scenes.GameScene.Entites.Player.DamageEntity.DamageEntity;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

import static processing.core.PApplet.dist;

public class Bullet extends DamageEntity {
    public Bullet(float xa, float ya) {
        super(xa, ya);
        setW(5);
        setH(5);
        setFriction((float) 1);
    }
    public void everyFrame(){
        GameScene currentScene = (GameScene) Setup.getSceneManager().getCurrentScene();
        Player player = (Player) currentScene.player;
        if(dist(getX(),getY(),player.getX(),player.getY())>600){
            kill();
        }
    }
}
