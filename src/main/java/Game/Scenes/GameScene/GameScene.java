package Game.Scenes.GameScene;

import Game.Scenes.GameScene.Entites.ExpBar.ExpBar;
import Game.Scenes.GameScene.Entites.GroundTile.GroundTile;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.Entites.HealthBar.HealthBar;
import Game.Scenes.GameScene.Entites.StatsButton.StatsButton;
import Game.Startup;
import System.Scene.Scene;

import static Game.Scenes.GameScene.Entites.Enemy.Spawning.EnemySpawning.spawnEnemies;

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
        setupUI();
        setupGround();
        setupEXP();
    }
    public void onSwitch(){
        getCamera().setCamLock(player);
        setPaused(false);
    }
    public void newGame(){
        player = (Player) addEntity(Startup.playerType);
    }
    public void everyFrame() {
        spawnEnemies();
    }
    void setupUI(){
        progressBar = (HealthBar)addEntity(new HealthBar(0,0));
        addEntity(new StatsButton(0, 460));
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
