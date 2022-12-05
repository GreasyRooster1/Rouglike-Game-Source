package Game.Assets.Enemies.Slimes;

import Game.Assets.Enemies.Slimes.GreenSlime.GreenSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.OrangeSlime.OrangeSlimeAssetLoader;

public class SlimesAssetLoader {
    public static void loadAssets(){
        GreenSlimeAssetLoader.loadAssets();
        OrangeSlimeAssetLoader.loadAssets();
    }
}
