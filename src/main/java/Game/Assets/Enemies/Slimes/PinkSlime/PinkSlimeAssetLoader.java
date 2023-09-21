package Game.Assets.Enemies.Slimes.PinkSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class PinkSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\PinkSlime\\Basic.png", "enemies.slimes.pinkSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\PinkSlime\\JumpAnim", "enemies.slimes.pinkSlime.jumpAnim",5,7);
    }
}
