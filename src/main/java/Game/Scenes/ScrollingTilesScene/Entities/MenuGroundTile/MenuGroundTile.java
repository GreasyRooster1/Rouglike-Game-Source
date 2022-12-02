package Game.Scenes.ScrollingTilesScene.Entities.MenuGroundTile;

import Game.Scenes.ScrollingTilesScene.ScrollingTilesScene;
import System.Entity.BaseEntity.BackgroundEntity;
import System.Logging.Logger;
import System.Setup.Setup;

public class MenuGroundTile extends BackgroundEntity {
    public float c;

    public MenuGroundTile(float xa, float ya) {
        super(xa,ya);
        setW(64);
        setH(64);
        //Logger.log(String.valueOf(xa),"game");
    }

    public void onStartup(){
        setRender(new MenuGroundTileRender());
    }
    public void everyFrame(){
        ScrollingTilesScene scene = (ScrollingTilesScene) Setup.getSceneManager().getSceneByName("scrollingTilesScene");
        c+=scene.tileSpeed;
    }
}
