package Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleAmbientParticle;

import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PApplet;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;

public class AlchemyCircleAmbientParticle extends Entity {
    float radAnim = Setup.getApplet().random(0,PI*2);
    float dist = Setup.getApplet().random(160,360);
    int death = 90;
    public AlchemyCircleAmbientParticle(float xa, float ya) {
        super(xa, ya);
        setW(14);
        setH(14);
        setDecay(1);

    }
    public void onStartup(){
        setRender(new AlchemyCircleAmbientParticleRender());
    }
    public void everyFrame(){
        if(dist>175) {
            radAnim -= 0.02;
        }else {
            radAnim += 0.02;
        }
        float mag = dist;
        setX((250 + cos(radAnim) * mag));
        setY((250 + sin(radAnim) * mag)-20);
        if(getLife()==1){
            setDecay(0);
            death-=1;
        }
        if(death<=0){
            kill();
        }
    }
}
