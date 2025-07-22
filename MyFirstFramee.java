
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFramee extends JFrame{

    public MyFirstFramee() {
        setTitle("My First GUI");
        setSize(600,600);
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
        
    }
    
    
}
