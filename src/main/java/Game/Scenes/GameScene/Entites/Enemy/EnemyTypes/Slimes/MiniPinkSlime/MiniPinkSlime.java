package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.MiniPinkSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class MiniPinkSlime extends BaseSlime {
    public MiniPinkSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.miniPinkSlime.jumpAnim");
        SPD = 2f;
        ATK = 1f;
        MAX_HEALTH = 30;
        EXP_VALUE = 1;
        setW(16);
        setH(16);
    }
}
