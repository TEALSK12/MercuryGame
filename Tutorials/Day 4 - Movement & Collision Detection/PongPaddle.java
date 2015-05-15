import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.input.*;
import com.radirius.mercury.math.geometry.*;

public class PongPaddle {
   private Rectangle rectangle;
   
   public PongPaddle(int x, int y) {
      this.rectangle = new Rectangle(x, y, 25, 200);
   }
   
   public void update() {
      if (Input.keyDown(Input.KEY_W)) {
         this.rectangle.translate(0, -5);
      }
      else if (Input.keyDown(Input.KEY_S)) {
         this.rectangle.translate(0, 5);
      }
   }
   
   public void render(Graphics g) {
      g.setColor(Color.WHITE);
      
      g.drawShape(this.rectangle);
   }
   
   public Rectangle getRectangle() {
      return this.rectangle;
   }
}