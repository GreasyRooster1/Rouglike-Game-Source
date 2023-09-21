package Game.Scenes.MenuScene.Entites.MenuCharacter;

import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.Entites.Player.PlayerRender;
import Game.Startup;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class MenuCharacterRender extends EntityImageRender {
    public MenuCharacterRender(){
        super();
        Player player = (Player) Startup.playerType;
        texturePath = "player."+player.getTextureName()+".idleLeft";
    }
}
