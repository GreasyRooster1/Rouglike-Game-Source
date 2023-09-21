package Game.Scenes.MenuScene.Entites.TextUI.TitleTextUI;

import System.Entity.BaseEntity.Entity;

public class TitleTextUI extends Entity {
    public TitleTextUI(float xa, float ya) {
        super(xa, ya);
    }
    public void onStartup(){
        setRender(new TitleTextUIRender());
    }

    public Entity setText(String t) {
        TitleTextUIRender render = (TitleTextUIRender)(getRender());
        render.setText(t);
        return this;
    }
}
