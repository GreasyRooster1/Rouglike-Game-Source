package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class KnockbackUpgrade extends Upgrade {
    public KnockbackUpgrade(){
        super();
        setName("knockbackUpgrade");
        setTitle("Increase KB");
        setDescription("Increases player KB power by 10. Player KB is how far enemies are pushed upon a hit");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.KB+=10;
    }
}
