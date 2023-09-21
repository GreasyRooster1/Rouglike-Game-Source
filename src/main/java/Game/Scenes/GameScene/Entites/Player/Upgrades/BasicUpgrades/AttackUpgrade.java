package Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class AttackUpgrade extends Upgrade {
    public AttackUpgrade(){
        super();
        setName("attackUpgrade");
        setTitle("Increase ATK");
        setDescription("Increases player ATK power by 5HP. Primary & secondary items deal player ATK plus the items ATK.");
    }
    public void upgradeEvent(){
        GameScene scene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        scene.player.ATK+=5;
    }
}
