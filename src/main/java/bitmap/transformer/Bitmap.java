package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
=======
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Bitmap extends GraphicsConfiguration {
  ColorModel colorModel;
  int width;
  int height;




  //Instance variables
  BufferedImage imageData;

  //Constructor
  public Bitmap(BufferedImage imageData) {
    this.imageData = imageData;

  public Bitmap(BufferedImage image) {
    this.colorModel = image.getColorModel();
    this.width = image.getWidth();
    this.height = image.getHeight();

  }

  /*
  private Bitmap addWhiteBorder(Bitmap bmp, int borderSize) {
    Bitmap bmpWithBorder = Bitmap.createBitmap(bmp.getWidth() + borderSize * 2, bmp.getHeight() + borderSize * 2, bmp.getConfig());
    Canvas canvas = new Canvas(bmpWithBorder);
    canvas.drawColor(Color.WHITE);
    canvas.drawBitmap(bmp, borderSize, borderSize, null);
    return bmpWithBorder;
}
   */


  private Bitmap addWhiteBorder(Bitmap bmp, int borderSize){
    bmp.width = bmp.width + borderSize * 2;
    bmp.height = bmp.height + borderSize * 2;
    Canvas canvas = new Canvas(bmp);
//    canvas.draw


  //Instance Methods
  public void wtiteToFile(String s) throws IOException {
    ImageIO.write(this.imageData, "bmp", new File(s));

  }

  //First Transformer
  public void paintPurple() {
    for(int i = 0; i < this.imageData.getWidth(); i++) {
      for(int j = 0; j < this.imageData.getHeight(); j++) {
        this.imageData.setRGB(i, j, new Color(250, 50, 50).getRGB());
      }
    }

  }

  public void chnageToYellow() {
    for(int i = 0; i < this.imageData.getWidth(); i++) {
      for(int j = 0; j < this.imageData.getHeight(); j++) {
        this.imageData.setRGB(i, j, new Color(250, 255, 50).getRGB());
      }
    }
  }

}