package github.com.putt0;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    protected void loadService() {
        try {
            BukkitLoader.plugin = this;
            System.out.print("[yQuiz] -> Loading project from devroom");
        } catch (Exception exception) {
            System.err.print("[yQuiz] -> Error: (" + exception + ")");
        }
    }

    protected void enableService() {
        try {
            System.out.print("[yQuiz] -> Started!");
        } catch (Exception exception) {
            System.err.print("[yQuiz] -> Error: (" + exception + ")");
        }
    }

    protected void disableService() {
        try {
            System.out.print("[yQuiz] -> Disabled");
            BukkitLoader.plugin = null;
        } catch (Exception exception) {
            System.out.print("[yQuiz] -> Error: (" + exception + ")");
        }
    }
}
