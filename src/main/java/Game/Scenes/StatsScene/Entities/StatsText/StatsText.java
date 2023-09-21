package Game.Scenes.StatsScene.Entities.StatsText;

import System.Entity.BaseEntity.Entity;
import System.Entity.BaseEntity.Renders.EntityRender;

public class StatsText extends Entity {
    public StatsText(float xa, float ya) {
        super(xa, ya);
        isUI = true;
        setW(400);
        setH(400);
        setRender(new StatsTextRender());
    }
}
