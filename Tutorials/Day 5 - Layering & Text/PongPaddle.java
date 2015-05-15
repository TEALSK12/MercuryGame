import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.input.*;
import com.radirius.mercury.math.geometry.*;

public class PongPaddle {
   private Rectangle rectangle;
   private int upKey;
   private int downKey;
   
   public PongPaddle(int x, int y, int upKey, int downKey) {
      this.rectangle = new Rectangle(x, y, 25, 200);
      this.upKey = upKey;
      this.downKey = downKey;
   }
   
   public void update() {
      if (Input.keyDown(upKey)) {
         this.rectangle.translate(0, -5);
      }
      else if (Input.keyDown(downKey)) {
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