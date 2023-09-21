package Game.Scenes.GameScene.Entites.GroundTile;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Logging.Logger;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class GroundTileRender extends EntityImageRender {
    public GroundTileRender(){
        super();

        texturePath = "world.world1.groundTile";
    }
    public void render(Entity e){
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        float camX = currentScene.getCamera().getCamX();
        float camY = currentScene.getCamera().getCamY();
        float x = e.getX()+(camX%e.getW());
        float y = e.getY()+(camY%e.getH());
        applet.fill(255);
        PImage tex = TextureLoader.getTexture(texturePath);
        applet.image(tex,x,y,e.getW(),e.getH());
    }
}
