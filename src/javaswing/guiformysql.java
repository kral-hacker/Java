package javaswing;
import javax.swing.*;
import java.awt.event.*;

public class guiformysql extends JFrame implements ActionListener{
    JFrame f = new JFrame("Question-2");
    JButton b;
    JLabel l1,l2,l3;
    JCheckBox chb1;
    JTextField t1,t2,t3;
    guiformysql() {
        l1 = new JLabel("Name:");
        l1.setBounds(30, 25, 100, 30);
        t1 = new JTextField();
        t1.setBounds(90, 30, 100, 20);
        l2 = new JLabel("Roll Number");
        l2.setBounds(60, 35, 100, 20);
        t2 = new JTextField();
        t2.setBounds(90, 40, 100, 20);
        l3 = new JLabel("Mobile Number");
        l3.setBounds(90, 45, 100, 20);
        t3 = new JTextField();
        t3.setBounds(110, 50, 100, 20);
        b = new JButton("Save");
        b.setBounds(200, 100, 80, 30);
        b.addActionListener(this);
        add(l1);
        add(b);
        add(t1);
        add(t2);
        add(t3);
        add(l2);
        add(l3);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }
@Override
        public void actionPerformed(ActionEvent e){
            if(chb1.isSelected()){
                String n1 = t1.getText();
                JOptionPane.showMessageDialog(this,"Welcome "+n1);
            }
            else{
                JOptionPane.showMessageDialog(this,"Verify the Details !!");
            }
        }



    public static void main(String[] args) {
        new guiformysql();
    }
}
