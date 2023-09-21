package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer;

import Game.Scenes.GameScene.Entites.Player.Player;

public class Boxer extends Player {
    public Boxer(float xa, float ya) {
        super(xa, ya);
        setAttackType("melee");
        setTextureName("boxerCharacter");
        setAttackAnimation("attackParticle");
        name="Boxer";
        ATK_SPEED = 20;
        KB=20;
    }
    public void setUpgrades(){

    }
}
