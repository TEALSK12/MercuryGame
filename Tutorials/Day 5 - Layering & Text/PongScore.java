import java.io.*;

import com.radirius.mercury.framework.*;
import com.radirius.mercury.graphics.*;
import com.radirius.mercury.graphics.font.*;
import com.radirius.mercury.resource.*;

public class PongScore {
   private TrueTypeFont font;
   
   private int leftScore;
   private int rightScore;
   
   public PongScore() {   
      InputStream fontStream = Loader.getResourceAsStream("font.ttf");
      this.font = TrueTypeFont.loadTrueTypeFont(fontStream, 100);
   }
   
   public void render(Graphics g) {
      g.setFont(this.font);
      g.setColor(Color.RED);
      g.drawString(this.leftScore + "     " + this.rightScore, 290, 0);
   }
   
   public void updateScore(int point) {
      if (point == -1) {
         this.leftScore++;
      }
      else if (point == 1) {
         this.rightScore++;
      }
   }
}