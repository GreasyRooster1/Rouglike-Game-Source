package Game.Scenes.GameScene.Entites.Player;

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
}
