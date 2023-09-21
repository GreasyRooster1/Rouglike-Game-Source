package Game.Scenes.OptionsScene.Entites.BarAnimation;

import System.Entity.UI.UIEntity;

public class SideBarAnimation extends UIEntity {
    public SideBarAnimation(float xa, float ya) {
        super(xa,ya);
        setW(200);
        setH(500);
    }

    public void onStartup(){
        setRender(new SideBarAnimationRender());
    }
    public void everyFrame(){
        if(getW()<1000){
            setW(getW()+15);
        }else{

        }
    }
}
