package Game.Scenes.CharacterSelectScene;

import Game.Scenes.CharacterSelectScene.Entites.CharacterButton.CharacterButton;
import Game.Scenes.CharacterSelectScene.Entites.DeployButton.DeployButton;
import Game.Scenes.GameScene.Entites.Player.CharacterTypes.CharacterRegistry;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.MenuScene.Entites.Button.CreditsButton.CreditsButton;
import Game.Scenes.MenuScene.Entites.Button.StartButton.StartButton;
import Game.Scenes.MenuScene.Entites.TextUI.TitleTextUI.TitleTextUI;
import System.Logging.Logger;
import System.Scene.Scene;

public class CharacterSelectScene extends Scene {
    public DeployButton deployButton;
    private int alive = 0;
    public CharacterSelectScene(){
        super();
    }
    public void onStartup(){
        name = "characterSelectScene";
    }
    public void onSwitch(){
        killAll();
        setBackgroundColor(0,30);
        addEntity(new TitleTextUI(250,50).setText("Select a character"));
        deployButton = (DeployButton) addEntity(new DeployButton(150,450));
        deployButton.setCanClick(false);
        setupButtons();
    }
    public void everyFrame(){
        if(alive>255/30){
            setBackgroundColor(0);
        }
        alive++;
    }
    void setupButtons(){
        Player[] playerTypes = CharacterRegistry.getRegistry();
        int c=64;
        int c1=64;
        for (Player p : playerTypes) {
            if(c>=500){
                c=64;
                c1+=64;
            }
            addEntity(new CharacterButton(c,c1).setType(p));
            c+=64;
        }
    }
}
