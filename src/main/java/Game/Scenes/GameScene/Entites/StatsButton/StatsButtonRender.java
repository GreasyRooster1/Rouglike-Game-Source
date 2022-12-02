package Game.Scenes.GameScene.Entites.StatsButton;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.UI.Button.ButtonImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class StatsButtonRender extends ButtonImageRender {
    public StatsButtonRender(){
        super();
        texturePath="UI.buttons.statsButton.basic";
    }

}
