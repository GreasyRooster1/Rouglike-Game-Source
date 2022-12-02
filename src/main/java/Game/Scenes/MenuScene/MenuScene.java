package Game.Scenes.MenuScene;

import Game.Scenes.MenuScene.Entites.Button.CreditsButton.CreditsButton;
import Game.Scenes.MenuScene.Entites.Button.OptionsButton.OptionsButton;
import Game.Scenes.MenuScene.Entites.Button.StartButton.StartButton;
import Game.Scenes.MenuScene.Entites.MenuCharacter.MenuCharacter;
import Game.Scenes.ScrollingTilesScene.Entities.MenuGroundTile.MenuGroundTile;
import Game.Scenes.MenuScene.Entites.SideBar.SideBar;
import Game.Scenes.MenuScene.Entites.TextUI.TitleTextUI.TitleTextUI;
import Game.Scenes.ScrollingTilesScene.ScrollingTilesScene;
import System.Entity.BaseEntity.Entity;
import System.Scene.Scene;
import System.Setup.Setup;
import System.Util.InvisibleVariables.InvisibleVariables;

public class MenuScene extends Scene {
    public float aliveCount = 0;
    public MenuScene(){
        super();
    }
    public void onStartup(){
        name = "menuScene";
    }
    public void onSwitch(){
        aliveCount = 0;
        killAll();
        setupBackground();
        addEntity(new SideBar(0-250,0));
        addEntity(new StartButton(0-500,200));
        addEntity(new CreditsButton(0-500,274));
        addEntity(new OptionsButton(0-500,348));
        addEntity(new TitleTextUI(84-500,100).setText("Ok."));
        addEntity(new MenuCharacter(244-500,244));
    }
    public void setupBackground(){
        setBackgroundScene("scrollingTilesScene");
        Setup.getSceneManager().getSceneByName("scrollingTilesScene").setPaused(false);
        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=1;
    }

    public void everyFrame(){
        for (Entity e : entities) {
            if(aliveCount<500f/15f-1){
                if(e.getClass()!=MenuGroundTile.class) {
                    if(e.getClass()==SideBar.class){
                        e.setX(e.getX() + 7.5f);
                    }else {
                        e.setX(e.getX() + 15);
                        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=15;
                    }
                }
            }else{
                ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=1;
            }
        }
        aliveCount++;
    }
}
