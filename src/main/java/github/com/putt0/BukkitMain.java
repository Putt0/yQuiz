package github.com.putt0;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    protected void loadService() {
        try {
            BukkitLoader.plugin = this;
            System.out.print("[Quiz] -> Loading project from devroom");
        } catch (Exception exception) {
            System.err.print("[Quiz] -> Error: (" + exception + ")");
        }
    }

    protected void enableService() {
        try {
            System.out.print("[Quiz] -> Started!");
        } catch (Exception exception) {
            System.err.print("[Quiz] -> Error: (" + exception + ")");
        }
    }

    protected void disableService() {
        try {
            System.out.print("[Quiz] -> Disabled");
            BukkitLoader.plugin = null;
        } catch (Exception exception) {
            System.out.print("[Quiz] -> Error: (" + exception + ")");
        }
    }
}