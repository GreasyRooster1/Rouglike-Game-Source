package System.Scene;

import System.Logging.Logger;
import System.Scene.SystemScenes.DefaultScene;
import System.Setup.Setup;
import processing.core.PApplet;

public class SceneManager {
    private Scene[] scenes = {};
    private Scene currentScene;
    private final Scene defaultScene = getSceneByName("System.defaultScene");
    private final Scene debugScene = getSceneByName("System.debugScene");
    private Scene previousScene = defaultScene;
    public SceneManager(){
        currentScene = defaultScene;
    }
    public void renderCurrentScene(){
        currentScene.update();
    }

    public void incomingScene(Scene s){
        scenes = (Scene[])(PApplet.append(scenes, s));
        Logger.log("SceneManager added "+s.name+" to its registry","System");
    }
    public void changeScene(String name){
        previousScene = currentScene;
        for(Scene s:scenes){
            if(s.name==name){
                currentScene = s;
            }
        }
        currentScene.onSwitch();
    }

    /**
     * @return current Scene
     * @desc returns current scene. not recommended for most applications because this function will not give background scenes. use getSceneByName() instead.
     */
    public Scene getCurrentScene() {
        return currentScene;
    }
    public Scene getSceneByName(String name) {
        for (Scene s : scenes) {
            if(s.name==name){
                return s;
            }
        }
        return null;
    }

    public Scene getDefaultScene() {
        return defaultScene;
    }

    public Scene getPreviousScene() {
        return previousScene;
    }
}
