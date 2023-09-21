package Game.Assets.UIAssets.GraphicsAssets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

public class GraphicsAssetLoader {
    public static void loadAssets() {
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\UI\\Graphics\\CheckMark\\CheckMark.png","UI.graphics.checkMark");
    }
}
