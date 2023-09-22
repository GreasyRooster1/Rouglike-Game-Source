package Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Projectiles;

import Game.Scenes.GameScene.Entites.Bullet.Bullet;
import Game.Scenes.GameScene.Entites.Bullet.BulletRender;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Setup.Setup;

import static processing.core.PApplet.*;

public class BoxerBullet extends Bullet {
    private boolean decel = false;
    public BoxerBullet(float xa, float ya) {
        super(xa, ya);
        setRender(new BoxerBulletRender());
        setDamage(((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player.ATK);
        setSize(48);
        dieOnHit = false;
        ( (BulletRender)getRender()).texturePath = "player.boxerCharacter.boxingGlove";
    }

    public void setDir(float dir) {
        setXvel(cos(dir)*0.8f);
        setYvel(sin(dir)*0.8f);
    }

    public void everyFrame(){
        if(getMag()<=10&&!decel){
            setXvel(getXvel() * 1.1f);
            setYvel(getYvel() * 1.1f);
        }else{
            setXvel(getXvel() * 0.8f);
            setYvel(getYvel() * 0.8f);
            decel = true;
        }
        if(getMag()<0.8f){
            kill();
        }
    }
}
