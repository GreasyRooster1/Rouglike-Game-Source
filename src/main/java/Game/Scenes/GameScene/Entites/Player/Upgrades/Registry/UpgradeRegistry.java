package Game.Scenes.GameScene.Entites.Player.Upgrades.Registry;

import Game.Scenes.GameScene.Entites.Player.Upgrades.BasicUpgrades.*;
import Game.Scenes.GameScene.Entites.Player.Upgrades.Upgrade;
import processing.core.PApplet;

import java.util.Objects;

public class UpgradeRegistry {
    public static Upgrade[] upgrades = {};
    public static void upgradeRegistry(){
        addRegistry(new AttackUpgrade());
        addRegistry(new DefenceUpgrade());
        addRegistry(new SpeedUpgrade());
    }



    //Registry Functions
    public static Upgrade[] getRegistry(){
        return upgrades;
    }
    static Upgrade getByName(String name){
        for (Upgrade p : upgrades) {
            if(Objects.equals(p.getName(), name)){
                return p;
            }
        }
        return null;
    }
    static void addRegistry(Upgrade p){
        upgrades = (Upgrade[]) PApplet.append(upgrades,p);
    }
}
