/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {
  BufferedImage i  = ImageIO.read(new File(args[0]));
  Bitmap myBitmap  = new Bitmap(i);
  myBitmap.paintPurple();
  myBitmap.chnageToYellow();
  myBitmap.wtiteToFile(args[1]);
  }
}
