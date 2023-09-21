package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.PinkSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.MiniPinkSlime.MiniPinkSlime;
import System.Setup.Setup;

import java.util.Set;

public class PinkSlime extends BaseSlime {
    private float splitRange = 7;
    public PinkSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.pinkSlime.jumpAnim");
        SPD = 1.5f;
        ATK = 2f;
        MAX_HEALTH = 60;
        EXP_VALUE = 3;
    }
    public void onDeath(){
        for(int i=1;i<=3;i++) {
            float xrand = Setup.getApplet().random(-splitRange,splitRange);
            float yrand = Setup.getApplet().random(-splitRange,splitRange);
            Setup.getSceneManager().getSceneByName("gameScene").addEntity(new MiniPinkSlime(getX()+xrand, getY()+yrand));
        }
    }
}
