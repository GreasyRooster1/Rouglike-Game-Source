package Game.Scenes.MenuScene.Entites.MenuCharacter;

import System.Entity.BaseEntity.BackgroundEntity;
import System.Entity.UI.UIEntity;

public class MenuCharacter extends UIEntity {
    public MenuCharacter(float xa, float ya) {
        super(xa,ya);
        setW(256);
        setH(256);
    }

    public void onStartup(){
        setRender(new MenuCharacterRender());
    }
    public void everyFrame(){
    }
}
