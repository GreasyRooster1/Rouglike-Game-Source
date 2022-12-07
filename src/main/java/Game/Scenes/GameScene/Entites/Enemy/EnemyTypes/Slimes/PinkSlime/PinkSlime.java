package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.PinkSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.MiniPinkSlime.MiniPinkSlime;
import System.Setup.Setup;

public class PinkSlime extends BaseSlime {
    public PinkSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.pinkSlime.jumpAnim");
        SPD = 1.5f;
        ATK = 1.5f;
        MAX_HEALTH = 40;
        EXP_VALUE = 3;
    }
    public void onDeath(){
        for(int i=1;i<=3;i++) {
            Setup.getSceneManager().getSceneByName("gameScene").addEntity(new MiniPinkSlime(getX(), getY()));
        }
    }
}
