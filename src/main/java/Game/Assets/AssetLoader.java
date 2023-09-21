package Game.Assets;

import Game.Assets.Enemies.EnemiesAssetLoader;
import Game.Assets.Other.OtherAssetLoader;
import Game.Assets.PlayerAssets.PlayerAssetLoader;
import Game.Assets.UIAssets.HealthBarAssets.HealthBarAssetLoader;
import Game.Assets.UIAssets.UIAssetLoader;
import Game.Assets.WorldAssets.WorldAssetLoader;

public class AssetLoader {
    public static void loadAssets(){
        PlayerAssetLoader.loadAssets();
        WorldAssetLoader.loadAssets();
        UIAssetLoader.loadAssets();
        OtherAssetLoader.loadAssets();
        EnemiesAssetLoader.loadAssets();
    }
}
