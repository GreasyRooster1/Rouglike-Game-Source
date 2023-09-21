package Game.Assets.WorldAssets.World1Assets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

public class World1AssetLoader {
    public static void loadAssets() {
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\World\\World1\\GroundTile.png","world.world1.groundTile");
    }
}
