import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;

public class MyFirstGame extends Core {
    public MyFirstGame(CoreSetup coreSetup) {
        super(coreSetup);
    }

    public static void main(String[] args) {
        CoreSetup coreSetup = new CoreSetup("My First Game");
        coreSetup.width = 800;
        coreSetup.height = 600;

        new MyFirstGame(coreSetup).start();
    }

    public void init() {
    
    }

    public void update() {
    
    }

    public void render(Graphics g) {
    
    }

    public void cleanup() {
    
    }
}