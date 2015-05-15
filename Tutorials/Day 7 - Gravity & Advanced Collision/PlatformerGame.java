import java.util.*;

import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;

public class PlatformerGame extends Core {
   private Sprite background;
   
   private Player player;
   
   private ArrayList<Block> platform;

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
      
      this.platform = new ArrayList<Block>();
      this.platform.add(new Block(180, 500));
      this.platform.add(new Block(250, 500));
      this.platform.add(new Block(320, 500));
      this.platform.add(new Block(390, 500));
      this.platform.add(new Block(460, 500));
   }

   public void update() {
      this.player.update();
      this.player.updateCamera(this.getCamera());
      
      for (int i = 0; i < this.platform.size(); i++) {
         if (this.player.intersects(this.platform.get(i))) {
            this.player.adjustForCollisionBelow(this.platform.get(i));
         }
      }      
   }

   public void render(Graphics g) {
      this.background.render(g);
      
      this.player.render(g);
      
      for (int i = 0; i < this.platform.size(); i++) {
         this.platform.get(i).render(g);
      }
   }

   public void cleanup() {
   
   }
}