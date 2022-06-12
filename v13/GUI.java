import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI{
  javax.swing.JFrame window;
  Container con;

  public GUI(){
    window = new JFrame();
    window.setSize(800,600);
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);
    window.setVisible(true);
    con = window.getContentPane();
  }

  public static void main(String[] args){
    new GUI();

  }



}