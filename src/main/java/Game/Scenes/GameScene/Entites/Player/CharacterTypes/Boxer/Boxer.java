package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer;

import Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Projectiles.BoxerBullet;
import Game.Scenes.GameScene.Entites.Player.Player;
import System.Setup.Setup;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

public class Boxer extends Player {
    public Boxer(float xa, float ya) {
        super(xa, ya);
        setAttackType("melee");
        setTextureName("boxerCharacter");
        setAttackAnimation("attackParticle");
        name="Boxer";
        ATK_SPEED = 30;
        KB=20;
    }
    public void setUpgrades(){

    }

    @Override
    public void attack() {
        super.attack();
        float dir = attackDir();
        BoxerBullet bullet = new BoxerBullet(getCenterX(),getCenterY());
        bullet.setDir(dir);
        Setup.getSceneManager().getCurrentScene().addEntity(bullet);
    }
}
