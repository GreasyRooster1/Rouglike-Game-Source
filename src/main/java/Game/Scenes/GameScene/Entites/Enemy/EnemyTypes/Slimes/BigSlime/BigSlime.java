package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BigSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class BigSlime extends BaseSlime {
    public BigSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.bigSlime.jumpAnim");
        SPD = 2f;
        ATK=13;
        MAX_HEALTH=200;
        EXP_VALUE = 6;
        setW(64);
        setH(64);
        setMovementFrames(new int[]{4,5,6,7,8,9,10});
    }
}

