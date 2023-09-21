package Game.Scenes.MenuScene.Entites.Button.OptionsButton;

import Game.Scenes.ScrollingTilesScene.ScrollingTilesScene;
import System.Entity.UI.Button.Button;
import System.Setup.Setup;

public class OptionsButton extends Button{

    public OptionsButton(float xa, float ya) {
        super(xa, ya);
        setW(128);
        setH(64);
    }
    public void onStartup(){
        setRender(new OptionsButtonRender());
    }
    public void onButtonClick(int button){
        Setup.getSceneManager().changeScene("optionsScene");
        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=15;
    }
}
