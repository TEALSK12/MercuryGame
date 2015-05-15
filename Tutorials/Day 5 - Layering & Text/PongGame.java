import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.input.*;

public class PongGame extends Core {
   private PongPaddle leftPaddle;
   private PongPaddle rightPaddle;
   private PongBall ball;
   private PongScore score;

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
      this.leftPaddle = new PongPaddle(75, 200, Input.KEY_W, Input.KEY_S);
      this.rightPaddle = new PongPaddle(700, 200, Input.KEY_UP, Input.KEY_DOWN);
      this.ball = new PongBall(400, 200);
      this.score = new PongScore();
   }

   public void update() {
      this.leftPaddle.update();
      this.rightPaddle.update();
      this.ball.update();
      
      this.ball.checkPaddleCollision(this.leftPaddle);
      this.ball.checkPaddleCollision(this.rightPaddle);
      
      this.ball.checkWindowCollision(600);
      
      int point = this.ball.checkPointCollision(800);
      this.score.updateScore(point);
   }

   public void render(Graphics g) {
      this.score.render(g);
   
      this.leftPaddle.render(g);
      this.rightPaddle.render(g);
      
      this.ball.render(g);
   }

   public void cleanup() {
   
   }
}