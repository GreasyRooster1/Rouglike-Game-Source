package Game.Scenes.MenuScene.Entites.Button.CreditsButton;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.UI.Button.ButtonRender;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

public class CreditsButtonRender extends EntityImageRender {
    public CreditsButtonRender(){
        super();
        texturePath = "UI.buttons.creditsButton.basic";
    }
}
