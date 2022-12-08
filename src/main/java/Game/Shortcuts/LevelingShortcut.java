package Game.Shortcuts;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.MiniPinkSlime.MiniPinkSlime;
import Game.Scenes.GameScene.Entites.Enemy.Spawning.EnemySpawning;
import Game.Scenes.GameScene.GameScene;
import System.GlobalShortcut.Types.GlobalShortcut;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

public class LevelingShortcut extends GlobalShortcut {
    public LevelingShortcut(int code) {
        super(code);
    }
    public void shortcutEvent(){
        //((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player.addEXP(1);
        EnemySpawning.enemiesKilled+=1;
    }
}
