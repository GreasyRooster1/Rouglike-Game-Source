package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.MiniPinkSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class MiniPinkSlime extends BaseSlime {
    public MiniPinkSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.miniPinkSlime.jumpAnim");
        SPD = 1.7f;
        ATK = 0.5f;
        MAX_HEALTH = 20;
        EXP_VALUE = 1;
        setW(16);
        setH(16);
    }
}
