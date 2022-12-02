package Game.Shortcuts;

import System.GlobalShortcut.Types.GlobalShortcut;
import System.Logging.Logger;
import System.Setup.Setup;
import processing.core.PApplet;

public class DebugShortcut extends GlobalShortcut {
    public DebugShortcut(int i){
        super(i);
    }
    public void shortcutEvent(){
        PApplet applet = Setup.getApplet();
        applet.fill(255);
        applet.textSize(15);
        applet.text("FPS: "+PApplet.round(applet.frameRate),applet.mouseX,applet.mouseY-30);
        applet.text("E: "+Setup.getSceneManager().getCurrentScene().entities.length,applet.mouseX,applet.mouseY-15);
        //applet.text(": "+,applet.mouseX,applet.mouseY);
    }
}
