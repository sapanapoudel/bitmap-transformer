/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import static org.junit.Assert.*;

public class BitmapTest {
 @Test public void paintPurpleTest () {
   BufferedImage myImage = new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB);
   for(int i = 0; i < myImage.getHeight(); i++) {
     for(int j = 0; j < myImage.getWidth(); j++) {
       myImage.setRGB(i, j, 0);
     }
   }

   Bitmap bitMapforTesting = new Bitmap(myImage);
   bitMapforTesting.chnageToYellow();
   for(int i = 0; i < myImage.getHeight(); i++) {
     for(int j = 0; j < myImage.getWidth(); j++) {
       assertEquals("All pixels should be equal",
           new Color(250, 255, 50).getRGB(),
       myImage.getRGB(i, j));
     }
   }
 }

}
