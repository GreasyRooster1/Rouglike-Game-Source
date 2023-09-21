package Game.Scenes.MenuScene.Entites.Button.CreditsButton;

import System.Entity.UI.Button.Button;
import System.Setup.Setup;

public class CreditsButton extends Button{

    public CreditsButton(float xa, float ya) {
        super(xa, ya);
        setW(128);
        setH(64);
    }
    public void onStartup(){
        setRender(new CreditsButtonRender());
    }
    public void onButtonClick(int button){
        Setup.getSceneManager().changeScene("creditsScene");
    }
}
