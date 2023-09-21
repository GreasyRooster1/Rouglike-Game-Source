package Game.Assets.Enemies.Slimes.MiniPinkSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class MiniPinkSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\MiniPinkSlime\\Basic.png", "enemies.slimes.miniPinkSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\MiniPinkSlime\\JumpAnim", "enemies.slimes.miniPinkSlime.jumpAnim",5,7);
    }
}
