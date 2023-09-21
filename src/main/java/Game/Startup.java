package Game;

import Game.Registry.ShortcutRegistry;
import Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Boxer;
import Game.Scenes.GameScene.Entites.Player.CharacterTypes.CharacterRegistry;
import System.Entity.BaseEntity.Entity;
import System.Logging.Logger;
import System.Setup.Setup;

import javax.swing.*;

import static Game.Assets.AssetLoader.loadAssets;

public class Startup {
    public static Entity playerType;
    public static void begin(){
        Logger.log("Game.Startup received begin...","game");
        loadAssets();
        CharacterRegistry.register();
        ShortcutRegistry.register();
        playerType = CharacterRegistry.getRegistry()[0];
        Setup.getSceneManager().changeScene("menuScene");
    }
}
