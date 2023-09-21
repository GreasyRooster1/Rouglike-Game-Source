package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.GreenSlime;

import Game.Scenes.GameScene.Entites.Enemy.BaseEnemy.Enemy;
import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class GreenSlime extends BaseSlime {
    public GreenSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.greenSlime.jumpAnim");
        SPD = 1.5f;
        ATK=1;
        MAX_HEALTH=40;
        EXP_VALUE = 1;
    }
}
