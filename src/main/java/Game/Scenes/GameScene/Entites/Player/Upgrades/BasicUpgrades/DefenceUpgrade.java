package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class DefenceUpgrade extends Upgrade {
    public DefenceUpgrade(){
        super();
        setName("defenceUpgrade");
        setTitle("Increase DEF");
        setDescription("Increases player DEF by 2%. Player DEF reduces all damage done to the player unless otherwise specified.");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.DEF+=2;
    }
}
