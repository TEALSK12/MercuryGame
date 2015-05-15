import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;

public class PongGame extends Core {
   private PongPaddle leftPaddle;
   private PongPaddle rightPaddle;
   private PongBall ball;

   public PongGame(CoreSetup coreSetup) {
       super(coreSetup);
   }

   public static void main(String[] args) {
       CoreSetup coreSetup = new CoreSetup("Pong");
       coreSetup.width = 800;
       coreSetup.height = 600;

       new PongGame(coreSetup).start();
   }

   public void init() {
      this.leftPaddle = new PongPaddle(75, 200);
      this.rightPaddle = new PongPaddle(700, 200);
      this.ball = new PongBall(400, 200);
   }

   public void update() {
      this.leftPaddle.update();
      this.rightPaddle.update();
      this.ball.update();
      
      this.ball.checkPaddleCollision(this.leftPaddle);
      this.ball.checkPaddleCollision(this.rightPaddle);
      
      this.ball.checkWindowCollision(800, 600);
   }

   public void render(Graphics g) {
      this.leftPaddle.render(g);
      this.rightPaddle.render(g);
      this.ball.render(g);
   }

   public void cleanup() {
   
   }
}