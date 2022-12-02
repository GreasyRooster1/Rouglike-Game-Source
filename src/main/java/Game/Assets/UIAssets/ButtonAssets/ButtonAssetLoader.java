package Game.Assets.UIAssets.ButtonAssets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

public class ButtonAssetLoader {
    public static void loadAssets() {
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\StartButton\\Basic.png", "UI.buttons.startButton.basic");
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\CreditsButton\\Basic.png", "UI.buttons.creditsButton.basic");
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\OptionsButton\\Basic.png", "UI.buttons.optionsButton.basic");
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\BackButton\\Basic.png", "UI.buttons.backButton.basic");
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\DeployButton\\Basic.png", "UI.buttons.deployButton.basic");
        TextureLoader.registerTexture("Assets\\UI\\Buttons\\StatsButton\\Basic.png", "UI.buttons.statsButton.basic");
    }
}
