package Game.Scenes.ScrollingTilesScene;

import Game.Scenes.ScrollingTilesScene.Entities.MenuGroundTile.MenuGroundTile;
import System.Scene.Scene;

public class ScrollingTilesScene extends Scene {
    public float tileSpeed = 1;
    public ScrollingTilesScene(){
        super();
        name = "scrollingTilesScene";
    }
    public void onStartup(){
        killAll();
        setupGround();
    }
    void setupGround(){
        for(int i=-64;i<564;i+=64){
            for(int j=-64;j<564;j+=64){
                addEntity(new MenuGroundTile(i,j));
            }
        }
    }
}
