package Game.Scenes.OptionsScene;

import Game.Scenes.MenuScene.Entites.MenuCharacter.MenuCharacter;
import Game.Scenes.ScrollingTilesScene.Entities.MenuGroundTile.MenuGroundTile;
import Game.Scenes.MenuScene.MenuScene;
import Game.Scenes.OptionsScene.Entites.BarAnimation.SideBarAnimation;
import Game.Scenes.GameScene.Entites.GroundTile.GroundTile;
import Game.Scenes.MenuScene.Entites.Button.CreditsButton.CreditsButton;
import Game.Scenes.MenuScene.Entites.Button.OptionsButton.OptionsButton;
import Game.Scenes.MenuScene.Entites.Button.StartButton.StartButton;
import Game.Scenes.MenuScene.Entites.TextUI.TitleTextUI.TitleTextUI;
import Game.Scenes.OptionsScene.Entites.MainMenuButton.MainMenuButton;
import Game.Scenes.ScrollingTilesScene.ScrollingTilesScene;
import System.Entity.BaseEntity.Entity;
import System.Scene.Scene;
import System.Setup.Setup;

public class OptionsScene extends Scene {
    public boolean transitionOut;
    public SideBarAnimation anim;
    public OptionsScene(){
        super();
    }
    public void onStartup(){
        name = "optionsScene";
    }
    public void onSwitch(){
        transitionOut = false;
        setBackgroundScene("scrollingTilesScene");
        setupBackground();
        killAll();
        float menuSceneCamX = Setup.getSceneManager().getSceneByName("menuScene").getCamera().getCamX();
        setupEntities();
        syncCamera(Setup.getSceneManager().getSceneByName("gameScene"));
        for (Entity e : entities) {
            if(e.getClass()!=GroundTile.class) {
                e.setX(e.getX() - menuSceneCamX);
            }
        }
    }

    void setupEntities(){
        anim = (SideBarAnimation) addEntity(new SideBarAnimation(0,0));
        addEntity(new StartButton(0,200));
        addEntity(new CreditsButton(0,274));
        addEntity(new OptionsButton(0,348));
        addEntity(new MainMenuButton(-510,348));
        addEntity(new MenuCharacter(244,244));
        addEntity(new TitleTextUI(84,100).setText("Ok."));
    }
    public void setupBackground(){
        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=1;
        setBackgroundScene("scrollingTilesScene");
        Setup.getSceneManager().getSceneByName("scrollingTilesScene").setPaused(false);
    }
    public void everyFrame(){

        if(getCamera().getCamX()%64==0){
            getCamera().setCamX(0);
        }
        for (Entity e : entities) {
            if(transitionOut){
                if(e.getClass()==MenuGroundTile.class) {
                    MenuScene scene = (MenuScene) Setup.getSceneManager().getSceneByName("menuScene");
                    if(e.getX()-getCamera().getCamX()>1000) {
                        for (Entity entity : scene.entities) {
                            if(entity.getClass()==MenuGroundTile.class) {
                                ((MenuGroundTile) entity).c=((MenuGroundTile)e).c-2;
                            }
                        }

                    }
                }
            }
            if(e.getClass()!=MenuGroundTile.class) {
                if(e.getClass()!=SideBarAnimation.class){
                    if(anim.getW()<715) {
                        e.setX(e.getX() + 15);
                        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=15;
                    }else{
                        ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=1;
                    }
                }
                if(transitionOut){
                    e.setX(e.getX() + 15);
                    ((ScrollingTilesScene)Setup.getSceneManager().getSceneByName("scrollingTilesScene")).tileSpeed=15;
                    if(e.getX()-getCamera().getCamX()>1500){
                        Setup.getSceneManager().changeScene("menuScene");
                    }
                }
            }

        }

    }
}
