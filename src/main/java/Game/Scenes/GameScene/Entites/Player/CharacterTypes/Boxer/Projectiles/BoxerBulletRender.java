package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Projectiles;

import Game.Scenes.GameScene.Entites.Bullet.Bullet;
import Game.Scenes.GameScene.Entites.Bullet.BulletRender;
import Game.Scenes.GameScene.GameScene;
import Game.Scenes.UpgradeScene.Entites.AlchemyCircle.AlchemyCircle;
import System.Camera.Camera;
import System.Entity.BaseEntity.Entity;
import System.Scene.SceneManager;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

import static processing.core.PConstants.*;

public class BoxerBulletRender extends BulletRender {
    public BoxerBulletRender() {
        texturePath="player.boxerCharacter.boxingGlove";
    }

    public void render(Entity e1){
        BoxerBullet e = (BoxerBullet) e1;
        PApplet applet = Setup.getApplet();
        PImage tex = TextureLoader.getTexture(texturePath);
        Camera cam = Setup.getSceneManager().getCurrentScene().getCamera();

        applet.imageMode(CENTER);
        applet.pushMatrix();
        applet.translate(e.getX()+cam.getCamX(), e.getY()+cam.getCamY());
        applet.rotate((PApplet.atan2(e.getXvel(),-e.getYvel())+PI/2));
        applet.image(tex, 0,0, e.getW(), e.getH());
        applet.popMatrix();
        applet.imageMode(CORNER);
    }
}
