package Game.Scenes.GameScene.Entites.HealthBar;

import System.Entity.UI.ProgressBar.ProgressBar;

public class HealthBar extends ProgressBar {

    public HealthBar(float xa, float ya) {
        super(xa, ya);
        setW(200);
        setH(10);
    }
    public void onStartup(){
        setRender(new HealthBarRender());
    }
}