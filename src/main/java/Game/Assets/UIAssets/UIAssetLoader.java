package Game.Assets.UIAssets;

import Game.Assets.UIAssets.ButtonAssets.ButtonAssetLoader;
import Game.Assets.UIAssets.GraphicsAssets.GraphicsAssetLoader;
import Game.Assets.UIAssets.HealthBarAssets.HealthBarAssetLoader;
import Game.Assets.UIAssets.Upgrading.UpgradeAssetLoader;

public class UIAssetLoader {
    public static void loadAssets() {
        HealthBarAssetLoader.loadAssets();
        ButtonAssetLoader.loadAssets();
        GraphicsAssetLoader.loadAssets();
        UpgradeAssetLoader.loadAssets();
    }
}
