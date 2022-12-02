package Game.Scenes.GameScene.Entites.StatsButton;

import Game.Scenes.CharacterSelectScene.CharacterSelectScene;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Startup;
import System.Entity.BaseEntity.Entity;
import System.Entity.UI.Button.Button;
import System.Logging.Logger;
import System.Setup.Setup;

public class StatsButton extends Button{
    public StatsButton(float xa, float ya) {
        super(xa, ya);
        setW(32);
        setH(32);
        isUI=true;
    }
    public void onStartup(){
        setRender(new StatsButtonRender());
    }
    public void onButtonClick(int button){

    }
}
