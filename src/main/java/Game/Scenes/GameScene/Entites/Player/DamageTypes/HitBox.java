package Game.Scenes.GameScene.Entites.Player.DamageTypes;

import Game.Scenes.GameScene.Entites.Player.DamageEntity.DamageEntity;
import System.Entity.BaseEntity.Renders.EntityInvisibleRender;
import System.Entity.BaseEntity.Renders.EntityOutlineRender;

public class HitBox extends DamageEntity {

    public HitBox(float xa, float ya) {
        super(xa, ya);
        setRender(new EntityOutlineRender());
        setLife(2);
        setDecay(1);
        //gets set by the player
        setDamage(1);
    }
}

