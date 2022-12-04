package Game.Registry;

import Game.Scenes.CharacterSelectScene.CharacterSelectScene;
import Game.Scenes.OptionsScene.OptionsScene;
import Game.Scenes.GameScene.GameScene;
import Game.Scenes.MenuScene.MenuScene;
import Game.Scenes.ScrollingTilesScene.ScrollingTilesScene;
import Game.Scenes.StatsScene.StatsScene;
import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Scene.Scene;
import System.Setup.Setup;

public class SceneRegistry {
    public static void registerScenes() {
        registerScene(new MenuScene());
        registerScene(new GameScene());
        registerScene(new CharacterSelectScene());
        registerScene(new OptionsScene());
        registerScene(new UpgradeScene());
        registerScene(new ScrollingTilesScene());
        registerScene(new StatsScene());
    }

    private static void registerScene(Scene scene) {
        Setup.getSceneManager().incomingScene(scene);
    }
}
