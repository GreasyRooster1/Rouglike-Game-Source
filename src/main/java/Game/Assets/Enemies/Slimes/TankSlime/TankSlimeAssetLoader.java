package Game.Assets.Enemies.Slimes.TankSlime;

import static System.TextureLoader.TextureLoader.registerTexture;
import static System.Util.CreateAnimation.createAnimation;

public class TankSlimeAssetLoader {
    public static void loadAssets(){
        registerTexture("Assets\\Enemies\\Slimes\\TankSlime\\Basic.png", "enemies.slimes.tankSlime.basic");
        registerTexture("Assets\\Enemies\\Slimes\\TankSlime\\Bullet.png", "enemies.slimes.tankSlime.bullet");
        createAnimation("Assets\\Enemies\\Slimes\\TankSlime\\JumpAnim", "enemies.slimes.tankSlime.jumpAnim",10,7);
    }
}
