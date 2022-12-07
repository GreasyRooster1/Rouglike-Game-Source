package Game.Scenes.GameScene.Entites.Enemy.Spawning;

import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BigSlime.BigSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BlueSlime.BlueSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.GreenSlime.GreenSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.OrangeSlime.OrangeSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.PinkSlime.PinkSlime;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Logging.Logger;
import System.Setup.Setup;
import processing.core.PApplet;
import processing.core.PConstants;

import static java.lang.Math.*;

public class EnemySpawning {
    public static int enemiesKilled=0,enemyCount=0;
    static int level = 1;
    static int maxEnemies = 5;
    static Player p = (Player)((GameScene) Setup.getSceneManager().getSceneByName("gameScene")).player;
    static PApplet applet = Setup.getApplet();


    public static void spawnEnemies(){
        levelUp();
        switch (level){
            case(1):level1Spawns();break;
            case(2):level2Spawns();break;
            case(3):level3Spawns();break;
            case(4):level4Spawns();break;
            case(5):level5Spawns();break;
            case(6):level6Spawns();break;
            case(7):level7Spawns();break;
            default:levelDefaultSpawns();break;
        }
    }
    private static void levelUp(){;
        if(enemiesKilled>((10*level)+10)){
            level+=1;
            enemiesKilled = 0;
            if(maxEnemies<200) {
                maxEnemies += 5;
            }
            Logger.log("Spawning level up!","game");
        }
    }

    private static void level1Spawns(){
        if(enemyCount<5){
            if(round(applet.random(0,20))==0){
                spawn(new GreenSlime(0,0));
            }
        }
    }
    private static void level2Spawns(){
        if(enemyCount<10){
            if(round(applet.random(0,20))==0){
                spawn(new GreenSlime(0,0));
            }
            if(round(applet.random(0,35))==0){
                spawn(new OrangeSlime(0,0));
            }
        }
    }
    private static void level3Spawns(){
        if(enemyCount<17){
            if(round(applet.random(0,30))==0){
                spawn(new GreenSlime(0,0));
            }
            if(round(applet.random(0,27))==0){
                spawn(new OrangeSlime(0,0));
            }
            if(round(applet.random(0,35))==0){
                spawn(new PinkSlime(0,0));
            }
        }
    }
    private static void level4Spawns(){
        if(enemyCount<17){
            if(round(applet.random(0,30))==0){
                spawn(new GreenSlime(0,0));
            }
            if(round(applet.random(0,27))==0){
                spawn(new OrangeSlime(0,0));
            }
            if(round(applet.random(0,35))==0){
                spawn(new PinkSlime(0,0));
            }
            if(round(applet.random(0,40))==0){
                spawn(new BlueSlime(0,0));
            }
        }
    }
    private static void level5Spawns(){
        if(enemyCount<30){
            if(round(applet.random(0,40))==0){
                spawn(new GreenSlime(0,0));
            }
            if(round(applet.random(0,25))==0){
                spawn(new OrangeSlime(0,0));
            }
            if(round(applet.random(0,30))==0){
                spawn(new PinkSlime(0,0));
            }
            if(round(applet.random(0,30))==0){
                spawn(new BlueSlime(0,0));
            }
        }
    }
    private static void level6Spawns(){
        if(enemyCount<32){
            if(round(applet.random(0,20))==0){
                spawn(new OrangeSlime(0,0));
            }
            if(round(applet.random(0,25))==0){
                spawn(new PinkSlime(0,0));
            }
            if(round(applet.random(0,30))==0){
                spawn(new BlueSlime(0,0));
            }
            if(round(applet.random(0,30))==0){
                spawn(new BigSlime(0,0));
            }
        }

    }
    public static void level7Spawns(){
        if(enemyCount<35){
            if(round(applet.random(0,40))==0){
                spawn(new OrangeSlime(0,0));
            }
            if(round(applet.random(0,35))==0){
                spawn(new PinkSlime(0,0));
            }
            if(round(applet.random(0,20))==0){
                spawn(new BlueSlime(0,0));
            }
            if(round(applet.random(0,25))==0){
                spawn(new BigSlime(0,0));
            }
        }
    }
    public static void levelDefaultSpawns(){
        if(enemyCount<maxEnemies){
            if(round(applet.random(0,20))==0){
                spawn(new Enemy(0,0));
            }
        }
    }
    public static void spawn(Enemy e){
        float dir = applet.random(0, PConstants.PI*2);
        float playerX = p.getX();
        float playerY = p.getY();
        float mag = 500f;
        float cosX = (float) (cos(dir)*mag);
        float sinY = (float) (sin(dir)*mag);
        float spawnX = playerX+cosX;
        float spawnY = playerY+sinY;

        e.setX(spawnX);
        e.setY(spawnY);

        Setup.getSceneManager().getCurrentScene().addEntity(e);
    }
}
