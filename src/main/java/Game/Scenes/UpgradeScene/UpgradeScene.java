package Game.Scenes.UpgradeScene;

import Game.Scenes.UpgradeScene.Entites.AlchemyCircle.AlchemyCircle;
import Game.Scenes.UpgradeScene.Entites.OuterAlchemyCricle.OuterAlchemyCircle;
import Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleAmbientParticle.AlchemyCircleAmbientParticle;
import Game.Scenes.UpgradeScene.Entites.Particles.AlchemyCircleBurstParticle.AlchemyCircleBurstParticle;
import Game.Scenes.UpgradeScene.Entites.UpgradeVisual.UpgradeVisual;
import System.Scene.Scene;
import System.Setup.Setup;
import processing.core.PApplet;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;

public class UpgradeScene extends Scene {
    public boolean transitionOut;
    public boolean canRotate = false,visualAnimation = false;
    private int animFrames = 0;
    public UpgradeScene(){
        super();
    }
    public void onStartup(){
        name = "upgradeScene";

    }
    public void onSwitch() {
        killAll();
        canRotate = false;
        visualAnimation = false;
        animFrames = 0;
        setBackgroundScene(Setup.getSceneManager().getSceneByName("gameScene"));
        setBackgroundColor(0,127);
        addEntity(new AlchemyCircle(250,250));
        addEntity(new OuterAlchemyCircle(250,250));
        spawnUpgradeVisuals();
    }
    public void spawnUpgradeVisuals(){
        for(int i=0;i<3;i++) {
            float dir = PApplet.radians(PApplet.lerp(0, 360, (float) i / 3) - 90);
            float mag = 150;
            ((UpgradeVisual)addEntity(new UpgradeVisual((250 + cos(dir) * mag) - 64,(250 + sin(dir) * mag) - 96))).setSpace(i);
        }
    }
    public void everyFrame(){
        if(Setup.getApplet().frameCount%2==0) {
            animFrames++;
        }
        if(animFrames==30){
            for(int i=0;i<30;i++){
                addEntity(new AlchemyCircleBurstParticle(250,250));
            }
        }
        if(animFrames>=40){
            visualAnimation = true;
        }
        if(animFrames>=60){
            canRotate = true;
        }
        if(PApplet.round(Setup.getApplet().random(1,5))==1&&canRotate){
            addEntity(new AlchemyCircleAmbientParticle(250,250));
        }
    }
}
