package Game.Scenes.MenuScene.Entites.Button.StartButton;

import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.UI.Button.ButtonRender;
import System.Entity.BaseEntity.Entity;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

import javax.imageio.ImageReader;

public class StartButtonRender extends EntityImageRender {
    public StartButtonRender(){
        super();
        texturePath="UI.buttons.startButton.basic";
    }
}
