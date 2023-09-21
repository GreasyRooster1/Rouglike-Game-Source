package Game.Scenes.GameScene.Entites.StatsButton;

import Game.Scenes.CharacterSelectScene.CharacterSelectScene;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Startup;
import System.Entity.BaseEntity.Entity;
import System.Entity.UI.Button.Button;
import System.Logging.Logger;
import System.Setup.Setup;
import processing.core.PConstants;

public class StatsButton extends Entity{
    public StatsButton(float xa, float ya) {
        super(xa, ya);
        setW(32);
        setH(32);
        isUI=true;
    }
    public void onStartup(){
        setRender(new StatsButtonRender());
    }
    public void onMouseClickedSelf(int button){
        if(button== PConstants.LEFT) {
            Setup.getSceneManager().changeScene("statsScene");
        }
    }
}
