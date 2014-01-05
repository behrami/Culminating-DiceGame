import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JLabel;



public class ShowImage extends Panel {
    BufferedImage  image;
  
    public ShowImage() {
    try {
  File input = new File("die1.png");
      image = ImageIO.read(input);
    } catch (IOException ie) {
      System.out.println("Error:"+ie.getMessage());
    }
  }

     
    public void paint(Graphics g) {
    g.drawImage( image, 0, 0, null);
  }
    
    
    static public void main(String args[]) throws
Exception {
      
    JFrame frame = new JFrame("Dice");
    
    Panel panel = new ShowImage();
    frame.getContentPane().add(panel);
    frame.setSize(500, 500);
    
    frame.setVisible(true);
  }
}