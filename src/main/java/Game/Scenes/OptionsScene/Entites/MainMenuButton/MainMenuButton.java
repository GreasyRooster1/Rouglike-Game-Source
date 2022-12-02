package Game.Scenes.OptionsScene.Entites.MainMenuButton;

import Game.Scenes.OptionsScene.OptionsScene;
import System.Entity.UI.Button.Button;
import System.Setup.Setup;

public class MainMenuButton extends Button{

    public MainMenuButton(float xa, float ya) {
        super(xa, ya);
        setW(128);
        setH(64);

    }
    public void onStartup(){
        setRender(new MainMenuButtonRender());
    }
    public void onButtonClick(int button){
        OptionsScene scene = (OptionsScene) Setup.getSceneManager().getSceneByName("optionsScene");
        scene.transitionOut = true;

    }
}
