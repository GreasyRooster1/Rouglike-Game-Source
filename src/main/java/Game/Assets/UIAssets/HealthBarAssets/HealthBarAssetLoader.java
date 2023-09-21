package Game.Assets.UIAssets.HealthBarAssets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

public class HealthBarAssetLoader {
    public static void loadAssets() {
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Green\\GreenEnd.png","UI.healthBar.green.end");
        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Green\\GreenMiddle.png","UI.healthBar.green.middle");

        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Red\\RedEnd.png","UI.healthBar.red.end");
        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Red\\RedMiddle.png","UI.healthBar.red.middle");

        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Blue\\BlueEnd.png","UI.healthBar.blue.end");
        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Blue\\BlueMiddle.png","UI.healthBar.blue.middle");

        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Black\\BlackEnd.png","UI.healthBar.black.end");
        TextureLoader.registerTexture("Assets\\UI\\HealthBar\\Black\\BlackMiddle.png","UI.healthBar.black.middle");
    }
}
