package Game.Scenes.CharacterSelectScene.Entites.DeployButton;

import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.UI.Button.Button;
import System.Setup.Setup;

public class DeployButton extends Button{

    public DeployButton(float xa, float ya) {
        super(xa, ya);
        setW(200);
        setH(50);
    }
    public void onStartup(){
        setRender(new DeployButtonRender());
    }
    public void onButtonClick(int button) {
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.newGame();
        Setup.getSceneManager().changeScene("gameScene");

    }
}
