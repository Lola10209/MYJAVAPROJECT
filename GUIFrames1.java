import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIFrames1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hospital Management System");  //setting the title
        frame.setSize(450, 450); //setting the width(y) and height(x)
        frame.setResizable(false);  // prevent from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x123456)); //getContentPane is for container
        ImageIcon image = new ImageIcon("logo.png"); //create an image icon
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
    }
}
//Jframe is a method. () is an constructor
//frame.setVisible is use the frame
// The exit application default window close operation. It is recommended you only use this in an application.
// others type of exit on close inclue; hide_on_close and do_nothing_on_close
// setting background .setbackground for colour
//different background colour includes .setBackground(new Color(0,0,25)) sky blue(173, 216, 240)-rgb
// another way to add color for background color .setBackground(new color(0x123456)); -hexdecimal
// another wat to add color for background color .setbackground(Color.blue); -standard colors or fixed color