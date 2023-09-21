package Game.Assets.PlayerAssets.BoxerAssets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

import static System.Util.CreateAnimation.createAnimation;

public class BoxerCharacterAssetLoader {
    public static void loadAssets(){
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\Player\\BoxerCharacter\\Right.png","player.boxerCharacter.right");
        TextureLoader.registerTexture("Assets\\Player\\BoxerCharacter\\Left.png","player.boxerCharacter.left");
        TextureLoader.registerTexture("Assets\\Player\\BoxerCharacter\\IdleRight.png","player.boxerCharacter.idleRight");
        TextureLoader.registerTexture("Assets\\Player\\BoxerCharacter\\IdleLeft.png","player.boxerCharacter.idleLeft");
        TextureLoader.registerTexture("Assets\\Player\\BoxerCharacter\\AttackParticle.png","player.boxerCharacter.attackParticle");
        createAnimation("Assets\\Player\\BoxerCharacter\\LeftWalk","player.boxerCharacter.leftWalk",5,3);
        createAnimation("Assets\\Player\\BoxerCharacter\\RightWalk","player.boxerCharacter.rightWalk",5,3);
        createAnimation("Assets\\Player\\BoxerCharacter\\AttackAnim","player.boxerCharacter.attack",4,4);
    }
}
