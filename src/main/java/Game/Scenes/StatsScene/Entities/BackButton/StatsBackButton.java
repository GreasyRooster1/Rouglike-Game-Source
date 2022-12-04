package Game.Scenes.StatsScene.Entities.BackButton;

import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PConstants;

public class StatsBackButton extends Entity{
    public StatsBackButton(float xa, float ya) {
        super(xa, ya);
        setW(32);
        setH(32);
        isUI=true;
    }
    public void onStartup(){
        setRender(new StatsBackButtonRender());
    }
    public void onMouseClickedSelf(int button){
        if(button== PConstants.LEFT) {
            Setup.getSceneManager().changeScene("gameScene");
        }
    }
}
