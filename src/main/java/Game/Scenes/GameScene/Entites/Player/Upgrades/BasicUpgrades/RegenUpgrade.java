package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class RegenUpgrade extends Upgrade {
    public RegenUpgrade(){
        super();
        setName("regenUpgrade");
        setTitle("Increase HEALTH REGEN");
        setDescription("\n\n\nIncreases player HEALTH REGEN by 3. Player HEALTH REGEN is how log it takes to regenerate 1HP of health");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.HEALTH_REGEN-=3;
    }
}
