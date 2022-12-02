package Game.Scenes.UpgradeScene.Entites.OuterAlchemyCricle;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;

public class OuterAlchemyCircle extends Entity {
    private Upgrade upgrade;
    private int space = 0;
    public OuterAlchemyCircle(float xa, float ya){
        super(xa,ya);
        setW(500);
        setH(500);
        setDecay(0);
    }
    public void onStartup(){
        setRender(new OuterAlchemyCircleRender());
    }
    public void everyFrame(){
        if(((UpgradeScene) Setup.getSceneManager().getCurrentScene()).canRotate){
            setDecay(-1);
        }
    }
}
