package Game.Scenes.GameScene.Entites.ExpBar;

import System.Entity.UI.ProgressBar.ProgressBar;

public class ExpBar extends ProgressBar {

    public ExpBar(float xa, float ya) {
        super(xa, ya);
        setW(500);
        setH(10);
    }
    public void onStartup(){
        setRender(new ExpBarRender());
    }
}