package Game.Scenes.GameScene;

import Game.Scenes.GameScene.Entites.ExpBar.ExpBar;
import Game.Scenes.GameScene.Entites.GroundTile.GroundTile;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.Entites.HealthBar.HealthBar;
import Game.Startup;
import System.Entity.BaseEntity.Entity;
import System.Logging.Logger;
import System.Scene.Scene;
import System.Setup.Setup;

import static Game.Scenes.GameScene.Entites.Enemy.Spawning.EnemySpawning.spawnEnemies;
import static processing.core.PConstants.RIGHT;

public class GameScene extends Scene {
    public Player player;
    public HealthBar progressBar;
    public ExpBar expBar;
    public GameScene(){
        super();
    }

    public void onStartup(){
        name = "gameScene";
        addEntity(new GroundTile(2,2));
        setupHealth();
        setupGround();
        setupEXP();
    }
    public void onSwitch(){
        getCamera().setCamLock(player);
    }
    public void newGame(){
        player = (Player) addEntity(Startup.playerType);
    }
    public void everyFrame() {
        spawnEnemies();
    }
    void setupHealth(){
        progressBar = (HealthBar)addEntity(new HealthBar(0,0));
    }
    void setupEXP(){
        expBar = (ExpBar) addEntity(new ExpBar(0,490));
        expBar.setLerp(0);
    }
    void setupGround(){
        for(int i=-64;i<564;i+=64){
            for(int j=-64;j<564;j+=64){
                addEntity(new GroundTile(i,j));
            }
        }
    }
}
