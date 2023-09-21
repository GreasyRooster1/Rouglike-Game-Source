package Game.Assets.PlayerAssets;

import Game.Assets.PlayerAssets.BasicCharacterAssets.BasicCharacterAssetLoader;
import Game.Assets.PlayerAssets.BoxerAssets.BoxerCharacterAssetLoader;

public class PlayerAssetLoader {
    public static void loadAssets(){
        BasicCharacterAssetLoader.loadAssets();
        BoxerCharacterAssetLoader.loadAssets();
    }
}
