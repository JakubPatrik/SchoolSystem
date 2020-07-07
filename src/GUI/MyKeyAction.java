package GUI;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyAction implements KeyListener{
        
    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            JFrame window2 = new JFrame("SchoolSystem TM");
            window2.setSize(300,300);
            window2.setVisible(true);  
        }
         
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            System.out.println("You pressed SPACE");
        }          

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}