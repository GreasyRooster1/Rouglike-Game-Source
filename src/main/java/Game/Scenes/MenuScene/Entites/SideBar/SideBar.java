package Game.Scenes.MenuScene.Entites.SideBar;

import System.Entity.BaseEntity.BackgroundEntity;
import System.Entity.BaseEntity.Renders.EntityRender;
import System.Entity.UI.UIEntity;

public class SideBar extends UIEntity {
    public SideBar(float xa, float ya) {
        super(xa,ya);
        setW(200);
        setH(500);
    }

    public void onStartup(){
        setRender(new SideBarRender());
    }
    public void everyFrame(){
    }
}
