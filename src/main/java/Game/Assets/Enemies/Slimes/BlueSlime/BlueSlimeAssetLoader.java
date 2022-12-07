package Game.Assets.Enemies.Slimes.BlueSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class BlueSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\BlueSlime\\Basic.png", "enemies.slimes.blueSlime.basic");
        createAnimation("Assets\\Enemies\\Slimes\\BlueSlime\\JumpAnim", "enemies.slimes.blueSlime.jumpAnim",5,7);
    }
}
