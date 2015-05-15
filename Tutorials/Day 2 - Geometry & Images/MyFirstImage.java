import java.io.InputStream;

import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.resource.*;

public class MyFirstImage extends Core {
   private Texture mushroom;
   private int xPos;

   public MyFirstImage(CoreSetup coreSetup) {
       super(coreSetup);
   }

   public static void main(String[] args) {
       CoreSetup coreSetup = new CoreSetup("My First Game");
       coreSetup.width = 800;
       coreSetup.height = 600;

       new MyFirstImage(coreSetup).start();
   }

   public void init() {
      InputStream stream = Loader.getResourceAsStream("mushroom.png");
      this.mushroom = Texture.loadTexture(stream);
      
      this.xPos = 0;
   }

   public void update() {
      this.xPos++;
   }

   public void render(Graphics g) {
      g.drawTexture(mushroom, this.xPos, 0);
   }

   public void cleanup() {
   
   }
}