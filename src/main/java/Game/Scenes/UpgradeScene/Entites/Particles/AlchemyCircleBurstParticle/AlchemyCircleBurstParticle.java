package Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleBurstParticle;

import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PApplet;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

public class AlchemyCircleBurstParticle extends Entity {

    public AlchemyCircleBurstParticle(float xa, float ya) {
        super(xa, ya);
        setW(14);
        setH(14);
        float dir = PApplet.radians(Setup.getApplet().random(0,360));
        float mag = Setup.getApplet().random(5,15);
        float posMag = Setup.getApplet().random(50,100);
        setX(getX()+cos(dir)*posMag);
        setY(getY()+sin(dir)*posMag);
        setXvel(cos(dir)*mag);
        setYvel(sin(dir)*mag);
        setFriction(0.99f);
    }
    public void onStartup(){
        setRender(new AlchemyCircleBustParticleRender());
    }
    public void everyFrame(){
        if(getX()>500||getY()>500||getX()<0||getY()<0){
            kill();
        }
    }
}
