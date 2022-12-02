package Game.Scenes.GameScene.Entites.Player.CharacterTypes;

import Game.Scenes.GameScene.Entites.Player.CharacterTypes.Boxer.Boxer;
import Game.Scenes.GameScene.Entites.Player.Player;
import System.Logging.Logger;
import processing.core.PApplet;

public class CharacterRegistry {
    private static Player[] playerTypes = {};
    public static void register(){
        addRegistry(new Boxer(0,0));
    }

    public static Player[] getRegistry(){
        return playerTypes;
    }

    public static Player getByName(String name){
        for (Player p : playerTypes) {
            if(p.name==name){
                return p;
            }
        }
        return null;
    }
    public static void addRegistry(Player p){
        playerTypes = (Player[]) PApplet.append(playerTypes,p);
    }
}
