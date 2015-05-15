import java.io.InputStream;

import com.radirius.mercury.audio.*;
import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.math.geometry.*;
import com.radirius.mercury.resource.*;

public class PongBall {
   public int startingX;
   public int startingY;

   public Rectangle rectangle;
   public int xVelocity = 2;
   public int yVelocity = 2;

   public PongBall(int x, int y) {
      this.startingX = x;
      this.startingY = y;
      this.rectangle = new Rectangle(x, y, 25, 25);
   }
   
   public void update() {
      this.rectangle.translate(this.xVelocity, this.yVelocity);
   }
   
   public void checkWindowCollision(int height) {
      if (this.rectangle.getY() < 0 || this.rectangle.getY2() > height) {
         this.yVelocity *= -1;
      }
   }
   
   public int checkPointCollision(int width) {
      if (this.rectangle.getX() < 0) {
         this.rectangle.translateTo(this.startingX, this.startingY);
         return 1;
      }
      if (this.rectangle.getX2() > width) {
         this.rectangle.translateTo(this.startingX, this.startingY);
         return -1;
      }
      return 0;
   }
   
   public void checkPaddleCollision(PongPaddle paddle) {
      if (this.rectangle.intersects(paddle.getRectangle())) {
         this.xVelocity *= -1;
      }
   }
   
   public void render(Graphics g) {
      g.setColor(Color.WHITE);
      
      g.drawShape(this.rectangle);   
   }
}