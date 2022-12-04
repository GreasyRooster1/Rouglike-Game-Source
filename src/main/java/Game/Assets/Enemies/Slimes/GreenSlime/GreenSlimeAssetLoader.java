package Game.Assets.Enemies.Slimes.GreenSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class GreenSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\GreenSlime\\Basic.png", "enemies.slimes.greenSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\GreenSlime\\JumpAnim", "enemies.slimes.greenSlime.jumpAnim",5,7);
    }
}
