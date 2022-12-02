package Game.Scenes.GameScene.Entites.Player.DamageEntity;

import System.Entity.BaseEntity.Entity;

public class DamageEntity extends Entity {
    private float amount;

    public DamageEntity(float xa, float ya) {
        super(xa, ya);
    }

    public float getDamage() {
        return amount;
    }

    public void setDamage(float amount) {
        this.amount = amount;
    }
}
