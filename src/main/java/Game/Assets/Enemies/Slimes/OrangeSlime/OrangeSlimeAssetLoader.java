package Game.Assets.Enemies.Slimes.OrangeSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class OrangeSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\OrangeSlime\\Basic.png", "enemies.slimes.orangeSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\OrangeSlime\\JumpAnim", "enemies.slimes.orangeSlime.jumpAnim",5,7);
    }
}
