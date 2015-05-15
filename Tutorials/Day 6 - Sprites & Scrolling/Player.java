import com.radirius.mercury.graphics.*;
import com.radirius.mercury.input.*;

public class Player extends Sprite {
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
   }
   
   public void updateCamera(Camera camera) {
      if (Input.keyDown(Input.KEY_LEFT)) {
         camera.translate(-5, 0);
      }
      if (Input.keyDown(Input.KEY_RIGHT)) {
         camera.translate(5, 0);
      }
   }
}