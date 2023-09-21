package Game.Assets.Other;

import System.TextureLoader.TextureLoader;

import static System.Util.CreateAnimation.createAnimation;

public class OtherAssetLoader {
    public static void loadAssets() {
        TextureLoader.registerTexture("Assets\\Other\\Missing.png","other.missing");
        createAnimation("Assets\\Other\\MissingAnim","other.missingAnim",1,1);
    }
}
