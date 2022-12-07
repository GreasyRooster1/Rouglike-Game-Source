package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer;

import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades.AttackUpgrade;
import Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades.DefenceUpgrade;
import Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades.SpeedUpgrade;
import System.Logging.Logger;

public class Boxer extends Player {
    public Boxer(float xa, float ya) {
        super(xa, ya);
        setAttackType("melee");
        setTextureName("basicCharacter");
        name="Boxer";
        ATK_SPEED = 10;
        KB=20;
    }
    public void setUpgrades(){

    }
}
