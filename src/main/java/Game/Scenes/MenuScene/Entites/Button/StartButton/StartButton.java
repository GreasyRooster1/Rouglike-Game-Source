package Game.Scenes.MenuScene.Entites.Button.StartButton;

import System.Entity.UI.Button.Button;
import System.Setup.Setup;

public class StartButton extends Button{

    public StartButton(float xa, float ya) {
        super(xa, ya);
        setW(192);
        setH(64);
    }
    public void onStartup(){
        setRender(new StartButtonRender());
    }
    public void onButtonClick(int button){
        Setup.getSceneManager().changeScene("characterSelectScene");
    }
}
