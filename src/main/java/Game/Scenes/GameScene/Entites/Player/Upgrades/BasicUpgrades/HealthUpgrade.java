package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class HealthUpgrade extends Upgrade {
    public HealthUpgrade(){
        super();
        setName("healthUpgrade");
        setTitle("Increase MAX HEALTH");
        setDescription("\nIncreases player MAX HEALTH by 10HP. player MAX HEALTH is the limit for the players health");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.MAX_HEALTH+=5;
        scene.player.updateHealthBar();
    }
}
