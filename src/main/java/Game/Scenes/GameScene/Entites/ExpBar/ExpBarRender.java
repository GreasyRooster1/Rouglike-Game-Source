package Game.Scenes.GameScene.Entites.ExpBar;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class ExpBarRender extends EntityRender {
    public void render(Entity entity){
        ExpBar e = (ExpBar) entity;
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        PApplet applet = Setup.getApplet();
        PImage end = TextureLoader.getTexture("UI.healthBar.blue.end");
        PImage middle = TextureLoader.getTexture("UI.healthBar.blue.middle");
        PImage endR = TextureLoader.getTexture("UI.healthBar.black.end");
        PImage middleR = TextureLoader.getTexture("UI.healthBar.black.middle");
        applet.image(endR,e.getX(),e.getY(),2,e.getH());
        applet.image(endR,e.getX()+e.getLerp()+e.getW()-2,e.getY(),2,e.getH());
        for(int i=2;i<e.getW()-2;i+=2) {
            applet.image(middleR, e.getX()+i, e.getY(), 2, e.getH());
        }
        applet.image(end,e.getX(),e.getY(),2,e.getH());
        applet.image(end,e.getX()+(e.getW()*e.getLerp()-2),e.getY(),2,e.getH());
        for(int i=2;i<e.getLerp()*e.getW()-2;i+=2) {
            applet.image(middle, e.getX()+i, e.getY(), 2, e.getH());
        }


    }
}
