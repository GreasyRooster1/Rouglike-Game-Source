package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class SpeedUpgrade extends Upgrade {
    public SpeedUpgrade(){
        super();
        setName("speedUpgrade");
        setTitle("Increase SPD");
        setDescription("Increases player SPD by 0.2. SPD changes how fast the player moves. Player SPD does not change how fast the player attacks.");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.SPD+=0.2;
    }
}
