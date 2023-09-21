package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Projectiles;

import Game.Scenes.GameScene.Entites.Bullet.Bullet;
import Game.Scenes.GameScene.Entites.Bullet.BulletRender;
import Game.Scenes.GameScene.GameScene;
import System.Setup.Setup;

public class BoxerBullet extends Bullet {
    public BoxerBullet(float xa, float ya) {
        super(xa, ya);
        setRender(new BulletRender());
        setDamage(((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player.ATK);
        setSize(48);
        ( (BulletRender)getRender()).texturePath = "player.boxerCharacter.boxingGlove";
    }
}
