package Game.Scenes.GameScene.Entites.Player.AttackParticles;

import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;
import processing.core.PApplet;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class AttackParticle extends Entity {

    public AttackParticle(float xa, float ya) {
        super(xa, ya);
        setDecay(1);
        setLife(4);
        setW(14);
        setH(14);
        float x = getX()+getW()/2;
        float y = getY()+getH()/2;
        float dir = PApplet.radians(Setup.getApplet().random(-90,90))+PApplet.atan2(Setup.getMouseY()-y,Setup.getMouseX()-x);
        float mag = 3;
        setXvel((float) (cos(dir)*mag));
        setYvel((float) (sin(dir)*mag));
        setFriction(0.99f);
        setRender(new AttackParticleRender());
    }
}
