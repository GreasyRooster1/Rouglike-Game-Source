package Game.Scenes.StatsScene;

import Game.Scenes.StatsScene.Entities.BackButton.StatsBackButton;
import Game.Scenes.StatsScene.Entities.StatsText.StatsText;
import System.Scene.Scene;
import System.Setup.Setup;

public class StatsScene extends Scene {
    public StatsScene(){
        super();
        name="statsScene";
    }
    public void onStartup(){
        setBackgroundColor(0,200);
        addEntity(new StatsText(50,50));
        addEntity(new StatsBackButton(0,0));
    }
    public void onSwitch(){
        setBackgroundScene(Setup.getSceneManager().getSceneByName("gameScene"));
    }
}
