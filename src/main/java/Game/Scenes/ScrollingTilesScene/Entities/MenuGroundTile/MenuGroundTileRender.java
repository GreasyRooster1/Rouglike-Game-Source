package Game.Scenes.ScrollingTilesScene.Entities.MenuGroundTile;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class MenuGroundTileRender extends EntityImageRender {
    public MenuGroundTileRender(){
        super();

        texturePath = "world.world1.groundTile";
    }
    public void render(Entity e1){
        PApplet applet = Setup.getApplet();
        MenuGroundTile e = (MenuGroundTile) e1;
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        float camX = currentScene.getCamera().getCamX();
        float camY = currentScene.getCamera().getCamY();
        float x = (e.getX()+(e.c%e.getW()));
        float y = (e.getY()+(e.getH()));
        applet.fill(255);
        PImage tex = TextureLoader.getTexture(texturePath);
        applet.image(tex,x,y,e.getW(),e.getH());
    }
}
