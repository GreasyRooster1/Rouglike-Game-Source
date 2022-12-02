package Game.Scenes.GameScene.Entites.Enemy.BaseEnemy;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

public class EnemyRender extends EntityRender {
    public EnemyRender(){
        super();
    }
    @Override
    public void render(Entity e){
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        float camX = currentScene.getCamera().getCamX();
        float camY = currentScene.getCamera().getCamY();
        applet.fill(255,0,0);
        applet.rect(e.getX()+camX,e.getY()+camY,e.getW(),e.getH());
    }
}
