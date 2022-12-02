package Game.Scenes.UpgradeScene.Entites.OuterAlchemyCricle;

import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.Objects;

import static processing.core.PConstants.CENTER;
import static processing.core.PConstants.CORNER;

public class OuterAlchemyCircleRender extends EntityImageRender {
    OuterAlchemyCircleRender(){
        super();
        texturePath = "UI.upgrading.alchemyCircle.outerAlchemyCircleAnim";
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.alchemyCircle.outerAlchemyCircleAnim")).setRunning(true);
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.alchemyCircle.outerAlchemyCircleAnim")).setFrame(0);
    }
    public void render(Entity e1){
        OuterAlchemyCircle e = (OuterAlchemyCircle) e1;
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();

        float camX = 0;
        float camY = 0;
        float vx = e.getX()+camX;
        float vy = e.getY()+camY;

        PImage tex = TextureLoader.getTexture(texturePath);

        if(tex!=null) {
            applet.imageMode(CENTER);
            applet.pushMatrix();
            applet.translate(e.getX(), e.getY());
            applet.rotate((float) -e.getLife() / 200);
            applet.image(tex, 0,0, e.getW(), e.getH());
            applet.popMatrix();
            applet.imageMode(CORNER);
        }else{
            applet.fill(0);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
            applet.fill(255,0,255);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW()/2, e.getH()/2);
            applet.rect(e.getX()+e.getW()/2 + camX, e.getY()+e.getH()/2 + camY, e.getW()/2, e.getH()/2);
        }

    }
}
