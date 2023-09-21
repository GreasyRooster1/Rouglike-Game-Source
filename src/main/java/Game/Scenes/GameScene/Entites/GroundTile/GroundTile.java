package Game.Scenes.GameScene.Entites.GroundTile;

import System.Entity.BaseEntity.BackgroundEntity;
import System.Entity.BaseEntity.Entity;
import System.Logging.Logger;

import static System.Util.Utils.collision;

public class GroundTile extends BackgroundEntity {
    public GroundTile(float xa, float ya) {
        super(xa,ya);
        setW(64);
        setH(64);
        //Logger.log(String.valueOf(xa),"game");
    }

    public void onStartup(){
        setRender(new GroundTileRender());
    }
    public void everyFrame(){
    }
}
