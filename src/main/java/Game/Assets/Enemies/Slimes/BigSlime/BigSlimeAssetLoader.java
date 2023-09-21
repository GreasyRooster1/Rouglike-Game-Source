package Game.Assets.Enemies.Slimes.BigSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class BigSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\BigSlime\\Basic.png", "enemies.slimes.bigSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\BigSlime\\JumpAnim", "enemies.slimes.bigSlime.jumpAnim",10,7);
    }
}
