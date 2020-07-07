package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Login_window implements ActionListener {  
    
    JFrame window;
    JTextField textUser;
    JPasswordField textPass;
    JPanel panel;
    JLabel labelUser,labelPass;
    JButton btn;
    private String username;
    private String password;
    
    public Login_window() {  

    window = new JFrame("Login to School System");
    window.setSize(400,250);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    panel = new JPanel();
    window.add(panel);
        
    labelUser =new JLabel("Username: ");
    labelUser.setBounds(10, 10, 80, 25);
    panel.add(labelUser);

    textUser = new JTextField(20);
    textUser.setBounds(100,10,160,25);
    textUser.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            username = textUser.getText();
        }
    });
    panel.add(textUser);

    labelPass =new JLabel("Password: ");  
    labelPass.setBounds(10, 50, 80, 25);
    panel.add(labelPass);

    textPass = new JPasswordField(20);
    textPass.setBounds(100,40,160,25);
    textPass.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                char[] pass = textPass.getPassword();
                password = new String(pass); 
            }
    });
    panel.add(textPass);
    
    btn = new JButton("Login");
    btn.setBounds(100,80,80,25); 
    btn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Correct username");
            if (textUser.getText()=="root"){
                System.out.println("Correct username");
            }
        }
    });
    panel.add(btn); 
            
    panel.setLayout(null);
    window.setBackground(Color.green);
    window.setVisible(true);
    }  
        
    public void actionPerformed(ActionEvent e) {
            if (textUser.getText()=="root"){
                System.out.println("Correct username");
            }
    }

}

    
    
   