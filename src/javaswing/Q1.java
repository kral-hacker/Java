package javaswing;

import javax.swing.*;
import java.awt.event.*;

public class Q1 extends JFrame implements ActionListener{
    JFrame f = new JFrame("Registration form");
    JButton b;
    JLabel l1;
    JCheckBox chb1;
    JTextField t1;
    Q1(){
        l1 = new JLabel("Name");
        l1.setBounds(30,25,100,30);
        t1 = new JTextField();
        t1.setBounds(90,30,100,20);
        chb1=new JCheckBox("Please verify the details");
        chb1.setBounds(30,150,200,50);
        b=new JButton("Submit");
        b.setBounds(100,200,80,30);
        b.addActionListener(this);
        add(l1);add(b);add(chb1);add(t1);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }
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
        new Q1();
    }
}
