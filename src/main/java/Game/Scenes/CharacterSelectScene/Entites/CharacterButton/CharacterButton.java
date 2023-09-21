package Game.Scenes.CharacterSelectScene.Entites.CharacterButton;

import Game.Scenes.CharacterSelectScene.CharacterSelectScene;
import Game.Scenes.CharacterSelectScene.Entites.DeployButton.DeployButton;
import Game.Scenes.CharacterSelectScene.Entites.DeployButton.DeployButtonRender;
import Game.Scenes.GameScene.Entites.Player.Player;
import Game.Startup;
import System.Entity.BaseEntity.Entity;
import System.Entity.UI.Button.Button;
import System.Logging.Logger;
import System.Setup.Setup;
import System.Util.InvisibleVariables.InvisibleVariables;

public class CharacterButton extends Button{
    private Player playerType;
    private boolean selected;
    public CharacterButton(float xa, float ya) {
        super(xa, ya);
        setW(64);
        setH(64);
    }
    public void onStartup(){
        setRender(new CharacterButtonRender());
    }
    public void onButtonClick(int button){
        CharacterSelectScene scene = (CharacterSelectScene) Setup.getSceneManager().getCurrentScene();
        for (Entity e : scene.entities) {
            if(e.getClass()== CharacterButton.class&&e.getID()!=getID()){
                ((CharacterButton) e).setSelected(false);
            }
        }
        selected = !selected;
        if(!selected){
            scene.deployButton.setCanClick(false);
        }else{
            scene.deployButton.setCanClick(true);
        }

        Startup.playerType = playerType;

    }
    public Entity setType(Player p) {
        playerType = p;
        CharacterButtonRender render = (CharacterButtonRender) getRender();
        render.texturePath = "player."+p.getTextureName()+".idleLeft";
        Logger.log(p.getTextureName(),"game");
        return this;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
