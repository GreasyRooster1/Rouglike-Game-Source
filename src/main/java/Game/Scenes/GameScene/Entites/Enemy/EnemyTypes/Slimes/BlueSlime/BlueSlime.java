package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BlueSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class BlueSlime extends BaseSlime {
    public BlueSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.blueSlime.jumpAnim");
        SPD = 0.5f;
        ATK=5;
        MAX_HEALTH=100;
        EXP_VALUE = 4;
    }
}
