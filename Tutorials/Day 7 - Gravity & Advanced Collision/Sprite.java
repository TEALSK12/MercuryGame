import java.io.InputStream;

import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.math.geometry.*;
import com.radirius.mercury.resource.*;

public class Sprite {
   private Texture texture;
   protected Rectangle rectangle;
   
   public Sprite(String imagePath, int x, int y) {
      InputStream stream = Loader.getResourceAsStream(imagePath);
      this.texture = Texture.loadTexture(stream);
      
      this.rectangle = new Rectangle(x, y, this.texture.getWidth(), this.texture.getHeight());
   }
   
   public void update() {

   }

   public void render(Graphics g) {
      g.drawTexture(this.texture, this.rectangle);
   }
   
   public boolean intersects(Sprite other) {
      return this.rectangle.intersects(other.rectangle);
   }
}