/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

  public static void main(String[] args) {
    File bmpFile = new File("./src/main/resources/Coffee.bmp");

    // Call readFile method
    readFile(bmpFile);

    // Call parseData method

    // Call the new output bitmap file

    // Set transformation of new bitmap 3 times
    Bitmap.setTransformName();


  }


  public static void readFile(File path){
    File file = new File(String.valueOf(path));
    BufferedImage image = null;
    try{
      image = ImageIO.read(file);

      Bitmap b = new Bitmap(image);

      ImageIO.write(image, "bmp", new File("./src/main/resources/CoffeeCopy.bmp"));

      //create with input file, output file and transform


      System.out.println(image);
      System.out.println("Success!");
    } catch(IOException e){
      System.out.println("Something is wrong with the image file!");
    }
  }
  
}
