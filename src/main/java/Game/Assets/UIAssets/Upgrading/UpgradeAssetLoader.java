package Game.Assets.UIAssets.Upgrading;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

import static System.Util.CreateAnimation.createAnimation;

public class UpgradeAssetLoader {
    public static void loadAssets() {
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\UpgradeVisual\\Basic.png","UI.upgrading.upgradeVisual.basic");
        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\UpgradeVisual\\BasicSelected.png","UI.upgrading.upgradeVisual.basicSelected");

        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\AlchemyCircle\\AlchemyCircle.png","UI.upgrading.alchemyCircle.alchemyCircle");
        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\AlchemyCircle\\OuterAlchemyCircle.png","UI.upgrading.alchemyCircle.outerAlchemyCircle");

        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\AlchemyCircle\\Particles\\BurstParticle.png","UI.upgrading.alchemyCircle.burstParticle");
        TextureLoader.registerTexture("Assets\\UI\\Upgrading\\AlchemyCircle\\Particles\\AmbientParticle.png","UI.upgrading.alchemyCircle.ambientParticle");

        createAnimation("Assets\\UI\\Upgrading\\AlchemyCircle\\AlchemyCircleAnim","UI.upgrading.alchemyCircle.alchemyCircleAnim",36,3).setPlaymode("once");
        createAnimation("Assets\\UI\\Upgrading\\AlchemyCircle\\OuterAlchemyCircleAnim","UI.upgrading.alchemyCircle.outerAlchemyCircleAnim",36,3).setPlaymode("once");
        createAnimation("Assets\\UI\\Upgrading\\UpgradeVisual\\UpgradeVisualAnim","UI.upgrading.upgradeVisual.basicAnim",24,3).setPlaymode("once");
        createAnimation("Assets\\UI\\Upgrading\\AlchemyCircle\\Particles\\AmbientParticleFadeAnim","UI.upgrading.alchemyCircle.ambientParticleFadeAnim",4,30).setPlaymode("once");


    }
}
