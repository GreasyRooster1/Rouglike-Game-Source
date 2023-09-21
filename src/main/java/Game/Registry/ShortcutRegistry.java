package Game.Registry;

import Game.Shortcuts.DebugShortcut;
import Game.Shortcuts.LevelingShortcut;
import System.GlobalShortcut.GlobalShortcutRegistry;
import System.GlobalShortcut.Types.SceneSwitcherGlobalShortcut;
import processing.core.PConstants;

import static java.awt.event.KeyEvent.VK_F3;
import static processing.core.PConstants.UP;

public class ShortcutRegistry {
    public static void register(){
        GlobalShortcutRegistry.registerShortcut(new DebugShortcut(114));
        GlobalShortcutRegistry.registerShortcut(new LevelingShortcut(113));
    }
}
