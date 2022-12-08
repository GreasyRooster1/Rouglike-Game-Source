package Game.Assets.Enemies.Slimes;

import Game.Assets.Enemies.Slimes.BigSlime.BigSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.BlueSlime.BlueSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.GreenSlime.GreenSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.MiniPinkSlime.MiniPinkSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.OrangeSlime.OrangeSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.PinkSlime.PinkSlimeAssetLoader;
import Game.Assets.Enemies.Slimes.TankSlime.TankSlimeAssetLoader;

public class SlimesAssetLoader {
    public static void loadAssets(){
        GreenSlimeAssetLoader.loadAssets();
        OrangeSlimeAssetLoader.loadAssets();
        BlueSlimeAssetLoader.loadAssets();
        BigSlimeAssetLoader.loadAssets();
        PinkSlimeAssetLoader.loadAssets();
        MiniPinkSlimeAssetLoader.loadAssets();
        TankSlimeAssetLoader.loadAssets();
    }
}
