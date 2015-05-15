import com.radirius.mercury.graphics.*;
import com.radirius.mercury.input.*;

public class Player extends Sprite {
   private int yVelocity = 0;
   private boolean isGrounded = false;

   public Player(int x, int y) {
      super("player.png", x, y);
   }
   
   public void update() {
      if (Input.keyDown(Input.KEY_LEFT)) {
         this.rectangle.translate(-5, 0);
      }
      if (Input.keyDown(Input.KEY_RIGHT)) {
         this.rectangle.translate(5, 0);
      }
      
      if (this.isGrounded && Input.keyDown(Input.KEY_SPACE)) {
         this.yVelocity = -20;
      }
      
      this.yVelocity++;
      
      this.rectangle.translate(0, this.yVelocity);
      
      this.isGrounded = false;
   }
   
   public void updateCamera(Camera camera) {
      if (Input.keyDown(Input.KEY_LEFT)) {
         camera.translate(-5, 0);
      }
      if (Input.keyDown(Input.KEY_RIGHT)) {
         camera.translate(5, 0);
      }
   }
   
   public void adjustForCollisionBelow(Sprite other) {
      int diff = (int)other.rectangle.getY() - (int)this.rectangle.getY2();
      if (diff < 0) {
         this.rectangle.translate(0, diff);
         this.yVelocity = 0;
         this.isGrounded = true;
      }
   }
}