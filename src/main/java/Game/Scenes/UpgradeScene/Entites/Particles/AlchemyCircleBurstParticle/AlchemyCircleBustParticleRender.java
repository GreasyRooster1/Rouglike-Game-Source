package Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleBurstParticle;

import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Setup.Setup;
import processing.core.PApplet;

public class AlchemyCircleBustParticleRender extends EntityImageRender {
    AlchemyCircleBustParticleRender(){
        super();
        useCamera = false;
        texturePath = "UI.upgrading.alchemyCircle.burstParticle";
    }
}
