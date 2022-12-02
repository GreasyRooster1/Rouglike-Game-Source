package Game.Scenes.MenuScene.Entites.SideBar;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Entity.BaseEntity.Renders.EntityTransparentRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class SideBarRender extends EntityTransparentRender {
    public SideBarRender(){
        super();
        transparency = 100;
    }
}
