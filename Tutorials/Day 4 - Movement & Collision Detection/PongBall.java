import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.math.geometry.*;

public class PongBall {
   public Rectangle rectangle;
   public int xVelocity = 2;
   public int yVelocity = 2;

   public PongBall(int x, int y) {
      this.rectangle = new Rectangle(x, y, 25, 25);
   }
   
   public void update() {
      this.rectangle.translate(this.xVelocity, this.yVelocity);
   }
   
   public void checkWindowCollision(int width, int height) {
      if (this.rectangle.getY() < 0 || this.rectangle.getY2() > height) {
         this.yVelocity *= -1;
      }
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