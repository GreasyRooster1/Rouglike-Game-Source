package Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleAmbientParticle;

import Game.Scenes.UpgradeScene.Entites.UpgradeVisual.UpgradeVisual;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PImage;

public class AlchemyCircleAmbientParticleRender extends EntityImageRender {
    float alpha = 255;
    AlchemyCircleAmbientParticleRender(){
        super();
        useCamera = false;
        texturePath = "UI.upgrading.alchemyCircle.ambientParticle";
    }
    public void render(Entity e){
        PApplet applet = Setup.getApplet();
        Scene currentScene = Setup.getSceneManager().getCurrentScene();
        PImage tex = TextureLoader.getTexture(texturePath);
        float camX = 0;
        float camY = 0;
        float vx = e.getX()+camX;
        float vy = e.getY()+camY;
        if(e.getLife()==1){
            alpha-=5;
        }
        if(tex!=null) {

            Setup.getApplet().tint(255,alpha);
            applet.image(tex, e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
            Setup.getApplet().tint(255,255);
        }else{
            applet.fill(0);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW(), e.getH());
            applet.fill(255,0,255);
            applet.rect(e.getX() + camX, e.getY() + camY, e.getW()/2, e.getH()/2);
            applet.rect(e.getX()+e.getW()/2 + camX, e.getY()+e.getH()/2 + camY, e.getW()/2, e.getH()/2);
        }
    }
}
