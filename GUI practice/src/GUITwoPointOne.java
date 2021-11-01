import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static java.lang.System.out;

public class GUITwoPointOne {
    public static void main(String[] args) {

        //Login details are: "Julius" ,  "fluff"

        //Creates new frame and adds a "panel" to the frame. It's easier to put things on a "panel" rather than on the frame itself.
        JFrame frame = new JFrame("Frame!");
        JPanel panel = new JPanel();

        //Sets size and makes "cross/X" terminate the program instead of just the frame. (Always remember to add the componant to the frame itself)
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        //The JLabel is like the "System.out.Print" of swing. Makes text appear! (wow)
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        //JTextField adds a field for text to be typed in, can later be used with an action listener to become cool...
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = passwordText.getText();
                //System.out.println(user + ", " + password);

                if (user.equals("Julius") && password.equals("fluff")){
                    success.setText("Login Successful!");
                }
                else{
                    success.setText("Incorrect username or password!");
                }
            }
        });

        frame.setVisible(true);

        // ************************************* Attempt 2 in adding an image *************************************

        JLabel image = new JLabel();
        ImageIcon imageSupport = new ImageIcon("gerFlagTrue.png");
        image.setIcon(imageSupport);
        image.setBounds(10, 200, 70, 40);
        panel.add(image);

        JLabel description = new JLabel("I am a weirdly stretched german flag :(");
        description.setBounds(100, 200, 1000, 40);
        panel.add(description);

        // This will take some practice...





    }
}
