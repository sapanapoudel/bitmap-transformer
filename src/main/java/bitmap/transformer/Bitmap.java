package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Bitmap extends GraphicsConfiguration {
  ColorModel colorModel;
  int width;
  int height;


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


  }
}