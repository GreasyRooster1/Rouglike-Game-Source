package Game.Scenes.GameScene.Entites.HealthBar;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Entity.UI.ProgressBar.ProgressBar;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class HealthBarRender extends EntityRender {
    public void render(Entity entity){
        HealthBar e = (HealthBar) entity;
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        PApplet applet = Setup.getApplet();
        PImage end = TextureLoader.getTexture("UI.healthBar.green.end");
        PImage middle = TextureLoader.getTexture("UI.healthBar.green.middle");
        PImage endR = TextureLoader.getTexture("UI.healthBar.red.end");
        PImage middleR = TextureLoader.getTexture("UI.healthBar.red.middle");
        applet.image(endR,e.getX(),e.getY(),2,e.getH());
        applet.image(endR,e.getX()+e.getW(),e.getY(),2,e.getH());
        for(int i=2;i<200;i+=2) {
            applet.image(middleR, e.getX()+i, e.getY(), 2, e.getH());
        }
        applet.image(end,e.getX(),e.getY(),2,e.getH());
        applet.image(end,e.getX()+e.getLerp()*200,e.getY(),2,e.getH());
        for(int i=2;i<e.getLerp()*200;i+=2) {
            applet.image(middle, e.getX()+i, e.getY(), 2, e.getH());
        }


    }
}
