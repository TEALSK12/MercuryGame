import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;

public class PlatformerGame extends Core {
   private Sprite background;
   
   private Player player;

   public PlatformerGame(CoreSetup coreSetup) {
       super(coreSetup);
   }

   public static void main(String[] args) {
       CoreSetup coreSetup = new CoreSetup("Platformer Game");
       coreSetup.width = 800;
       coreSetup.height = 600;

       new PlatformerGame(coreSetup).start();
   }

   public void init() {
      this.background = new Sprite("background.png", 0, 0);
      
      this.player = new Player(300, 300);
   }

   public void update() {
      this.player.update();
      this.player.updateCamera(this.getCamera());
   }

   public void render(Graphics g) {
      this.background.render(g);
      
      this.player.render(g);
   }

   public void cleanup() {
   
   }
}