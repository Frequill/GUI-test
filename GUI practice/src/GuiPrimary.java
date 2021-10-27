import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrimary {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Quiz!");
        JButton myButton = new JButton("2000");
        JButton myButton2 = new JButton("1970");
        JButton myButton3 = new JButton("1945");
        JButton myButton4 = new JButton("1991");
        JLabel myLabel = new JLabel("Which year did the Soviet Union fall?");

        myFrame.setSize(400, 500);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        myButton.setVisible(true);
        myButton2.setVisible(true);
        myButton3.setVisible(true);
        myButton4.setVisible(true);

        myButton.setBounds(130, 100, 100, 40);
        myButton2.setBounds(130, 160, 100, 40);
        myButton3.setBounds(130, 220, 100, 40);
        myButton4.setBounds(130, 280, 100, 40);

        myLabel.setBounds(80, 30, 400, 50);

        myFrame.add(myButton);
        myFrame.add(myButton2);
        myFrame.add(myButton3);
        myFrame.add(myButton4);
        myFrame.add(myLabel);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Incorrect answer!");
            }
        });

        myButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Incorrect answer!");
            }
        });
        myButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Incorrect answer!");
            }
        });
        myButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Perfectly correct, well done!");
            }
        });
    }
}
