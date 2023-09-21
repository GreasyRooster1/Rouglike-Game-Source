package Game.Assets.PlayerAssets.BasicCharacterAssets;

import System.Setup.Setup;
import System.TextureLoader.TextureLoader;
import processing.core.PApplet;

import static System.Util.CreateAnimation.createAnimation;

public class BasicCharacterAssetLoader {
    public static void loadAssets(){
        PApplet a = Setup.getApplet();
        TextureLoader.registerTexture("Assets\\Player\\BasicCharacter\\Right.png","player.basicCharacter.right");
        TextureLoader.registerTexture("Assets\\Player\\BasicCharacter\\Left.png","player.basicCharacter.left");
        TextureLoader.registerTexture("Assets\\Player\\BasicCharacter\\IdleRight.png","player.basicCharacter.idleRight");
        TextureLoader.registerTexture("Assets\\Player\\BasicCharacter\\IdleLeft.png","player.basicCharacter.idleLeft");
        createAnimation("Assets\\Player\\BasicCharacter\\LeftWalk","player.basicCharacter.leftWalk",5,3);
        createAnimation("Assets\\Player\\BasicCharacter\\RightWalk","player.basicCharacter.rightWalk",5,3);
    }
}
