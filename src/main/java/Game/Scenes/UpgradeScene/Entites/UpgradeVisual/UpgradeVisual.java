package Game.Scenes.UpgradeScene.Entites.UpgradeVisual;

import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import Game.Scenes.GameScene.GameScene;
import Game.Scenes.UpgradeScene.UpgradeScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Scene.Scene;
import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;
import processing.core.PConstants;

import java.util.Objects;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.LEFT;

public class UpgradeVisual extends Entity {
    private Upgrade upgrade;
    private int space = 0;
    public UpgradeVisual(float xa, float ya){
        super(xa,ya);
        setW(128);
        setH(192);
        setDecay(0);
        setLife(1);
    }
    public void onStartup(){
        setRender(new UpgradeVisualRender());
        GameScene gameScene = (GameScene) Setup.getSceneManager().getSceneByName("gameScene");
        setUpgrade(gameScene.player.getRandomUpgrade());
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgradeVisual.upgradeVisualAnim")).setRunning(true);
        Objects.requireNonNull(TextureLoader.getAnimationClass("UI.upgradeVisual.upgradeVisualAnim")).setFrame(0);
    }

    public void everyFrame(){
        if(((UpgradeScene)Setup.getSceneManager().getSceneByName("upgradeScene")).canRotate){
            setDecay(-1);
        }
        if(((UpgradeScene)Setup.getSceneManager().getSceneByName("upgradeScene")).canRotate) {
            float radAnim = getLife() / 200;
            float dir = PApplet.radians(PApplet.lerp(0, 360, (float) space / 3) - 90) + radAnim;
            float mag = 150;
            setX((250 + cos(dir) * mag) - 64);
            setY((250 + sin(dir) * mag) - 96);
        }
    }
    public void onMouseClickedSelf(int button){
        if(!((UpgradeScene)Setup.getSceneManager().getSceneByName("upgradeScene")).canRotate){return;}
        if(button == LEFT) {
            upgrade.upgradeEvent();
            Setup.getSceneManager().getSceneByName("gameScene").setPaused(false);
            Setup.getSceneManager().changeScene("gameScene");

        }
    }
    public Upgrade getUpgrade() {
        return upgrade;
    }
    public void setUpgrade(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
