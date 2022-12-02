package Game.Scenes.GameScene.Entites.Player.DamageTypes;

import Game.Scenes.GameScene.Entites.Player.DamageEntity.DamageEntity;
import System.Entity.BaseEntity.Renders.EntityInvisibleRender;

public class HitBox extends DamageEntity {

    public HitBox(float xa, float ya) {
        super(xa, ya);
        setRender(new EntityInvisibleRender());
        setLife(2);
        setDecay(1);
        setDamage(1);
    }
}

