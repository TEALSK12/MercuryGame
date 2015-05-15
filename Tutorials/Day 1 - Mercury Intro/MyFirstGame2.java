import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.math.geometry.*;

public class MyFirstGame2 extends Core {
    public MyFirstGame2(CoreSetup coreSetup) {
        super(coreSetup);
    }

    public static void main(String[] args) {
        CoreSetup coreSetup = new CoreSetup("My First Game");
        coreSetup.width = 800;
        coreSetup.height = 600;

        new MyFirstGame2(coreSetup).start();
    }

    public void init() {
    
    }

    public void update() {
    
    }

    public void render(Graphics g) {
    
      Rectangle rect = new Rectangle( 50, 50, 200, 200 );
		g.setColor( Color.GREEN );
		g.drawShape( rect );
      
      Rectangle rect2 = new Rectangle( 500, 450, 100, 50 );
		g.setColor( Color.BLUE );
		g.drawShape( rect2 );
    
    }

    public void cleanup() {
    
    }
}