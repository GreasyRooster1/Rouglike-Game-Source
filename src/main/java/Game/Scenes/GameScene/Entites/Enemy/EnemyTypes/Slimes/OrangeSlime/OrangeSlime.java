package Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.OrangeSlime;

import Game.Scenes.GameScene.Entites.Enemy.EnemyTypes.Slimes.BaseSlime;

public class OrangeSlime extends BaseSlime {
    public OrangeSlime(float xa, float ya) {
        super(xa, ya);
        setTexturePath("enemies.slimes.orangeSlime.jumpAnim");
        SPD = 2f;
        ATK=2;
        MAX_HEALTH=40;
    }
}
