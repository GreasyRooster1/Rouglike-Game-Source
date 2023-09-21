package Game.Scenes.StatsScene.Entities.StatsText;

import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Scenes.GameScene.GameScene;
import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityImageStaticRender;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Setup.Setup;
import processing.core.PApplet;
import processing.core.PConstants;

public class StatsTextRender extends EntityImageStaticRender {
    StatsTextRender(){
        super();

    }
    @Override
    public void render(Entity e){
        PApplet applet = Setup.getApplet();
        Player player = ((GameScene)Setup.getSceneManager().getSceneByName("gameScene")).player;
        String gameStatsText = "ATK: "+player.ATK+"\nSPD: "+player.SPD+"\nDEF: "+player.DEF+"\nATK SPEED: "+player.ATK_SPEED+"\nMAX HEALTH: "+player.MAX_HEALTH+"\nKB: "+player.KB+"\nLVL: "+player.LVL;
        applet.fill(255);
        applet.textAlign(PConstants.LEFT);
        applet.textSize(20);
        applet.text("Player statistics",e.getX(),e.getY(),400,400);
        applet.stroke(255);
        applet.line(e.getX(),e.getY()+30,e.getX()+300,e.getY()+30);
        applet.textSize(15);
        applet.text(gameStatsText,e.getX(),e.getY()+35,400,400);
        applet.stroke(0);
    }
}
