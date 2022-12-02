package Game.Scenes.UpgradeScene.Entites.UpgradeVisual;

import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import System.Util.Utils;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.Objects;

import static processing.core.PConstants.CORNER;

public class UpgradeVisualRender extends EntityImageRender {
    UpgradeVisualRender(){
        super();
        texturePath = "UI.upgrading.upgradeVisual.basicAnim";
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.upgradeVisual.basicAnim")).setRunning(true);
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.upgradeVisual.basicAnim")).setFrame(0);
    }
    public void render(Entity e1){
        UpgradeVisual e = (UpgradeVisual) e1;
        PApplet applet = Setup.getApplet();
        UpgradeScene upgradeScene = (UpgradeScene)Setup.getSceneManager().getSceneByName("upgradeScene");

        float camX = 0;
        float camY = 0;
        float vx = e.getX()+camX;
        float vy = e.getY()+camY;


        PImage tex = TextureLoader.getTexture(texturePath);

        if(!(upgradeScene).visualAnimation){
            Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.upgradeVisual.basicAnim")).setFrame(0);
            return;
        }
        if((upgradeScene).canRotate){
            if(Utils.mouseCollision(e)){
                texturePath = "UI.upgrading.upgradeVisual.basicSelected";
            }else{
                texturePath = "UI.upgrading.upgradeVisual.basic";
            }
        }

        if(tex!=null) {
            applet.image(tex, e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
        }else{
            applet.fill(0);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
            applet.fill(255,0,255);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW()/2, e.getH()/2);
            applet.rect(e.getX()+e.getW()/2 + camX, e.getY()+e.getH()/2 + camY, e.getW()/2, e.getH()/2);
        }
        if(Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgrading.upgradeVisual.basicAnim")).getFrame()>=24) {
            applet.fill(104, 42, 25);
            applet.textSize(17);
            applet.textLeading(19);
            applet.text(e.getUpgrade().getTitle(), vx + 4, vy + 13, e.getW() - 4, e.getH() - 23);
            applet.textAlign(CORNER);
            applet.textSize(14);
            applet.textLeading(14);
            applet.text(e.getUpgrade().getDescription(), vx + 4, vy + 33, e.getW() - 4, e.getH() - 23);
        }
    }
}
