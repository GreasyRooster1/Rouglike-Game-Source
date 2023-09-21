package Game.Scenes.UpgradeScene.Entites.AlchemyCircle;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PApplet;

import static processing.core.PApplet.*;

public class AlchemyCircle extends Entity {

    public AlchemyCircle(float xa, float ya){
        super(xa,ya);
        setW(400);
        setH(400);
        setLife(1);
        setDecay(0);
    }
    public void onStartup(){
        setRender(new AlchemyCircleRender());
    }
    public void everyFrame(){
        if(((UpgradeScene)Setup.getSceneManager().getCurrentScene()).canRotate){
            setDecay(-1);
        }
    }
}
