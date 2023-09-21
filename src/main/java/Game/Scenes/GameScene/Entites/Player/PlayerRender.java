package Game.Scenes.GameScene.Entites.Player;

import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class PlayerRender extends EntityImageRender {
    public PlayerRender(){
        super();
        texturePath = "player.basicCharacter.right";
    }

    @Override
    public void preRendering(Entity e) {
        if(((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player.getVisibleHitTimer()>0) {
            Setup.getApplet().tint(255, 0, 0);
        }else{
            Setup.getApplet().tint(255);
        }
    }

    @Override
    public void postRendering(Entity e) {
        Setup.getApplet().tint(255);
    }
}
