import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class Project extends JFrame{
    public Project(){
    super("Change JTextField Font Name, Style, Size, Color");
    

    //Font.BOLD = font style, You Can Also Put An Int;
    // 30 = size;
    Font f = new Font("Verdana",Font.BOLD,30);
    JTextField tf = new JTextField(60);
    //set the font to the JTextField
    tf.setFont(f);
    //change a JTextField font color
        if(num == 1)
            tf.setForeground(Color.red);
        if(num == 2)
            tf.setForeground(Color.blue);
        if(num == 3)
            tf.setForeground(Color.green);
        if(num == 4)
            tf.setForeground(Color.orange);
        if(num == 5)
            tf.setForeground(Color.black);
        if(num == 6)
            tf.setForeground(Color.white);
        if(num == 7)
            tf.setForeground(Color.yellow);
        if(num == 8)
            tf.setForeground(Color.red);
        
    tf.setForeground(Color.red);
    add(tf);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(400,200);
    setVisible(true);
    }
    public static void main(String[] args){
        new Project();
    }
   }
