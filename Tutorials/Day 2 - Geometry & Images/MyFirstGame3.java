import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.math.geometry.*;

public class MyFirstGame3 extends Core {
    public MyFirstGame3(CoreSetup coreSetup) {
        super(coreSetup);
    }

    public static void main(String[] args) {
        CoreSetup coreSetup = new CoreSetup("My First Game");
        coreSetup.width = 800;
        coreSetup.height = 600;

        new MyFirstGame3(coreSetup).start();
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
      
      Rectangle rect3 = new Rectangle( -50, 500, 250, 250 );
		g.setColor( Color.RED );
		g.drawShape( rect3 );
      
      Rectangle rect4 = new Rectangle( 700, -100, 50, 200 );
		g.setColor( Color.YELLOW );
		g.drawShape( rect4 );
      
      Rectangle rect5 = new Rectangle( 900, 400, 100, 100 );
		g.setColor( Color.PURPLE );
		g.drawShape( rect5 );
    
    }

    public void cleanup() {
    
    }
}