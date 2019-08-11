package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

  //Instance variables
  BufferedImage imageData;

  //Constructor
  public Bitmap(BufferedImage imageData) {
    this.imageData = imageData;
  }


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