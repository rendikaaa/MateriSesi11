
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KOPUTER JARKOM 19
 */
import javax.swing.*;
public class FormTambah extends JFrame implements ActionListener {
JTextField t1;
JButton b2;
JButton b1;
    FormTambah() {
        super("TambahData");
        JPanel p = new JPanel();
        b1  = new JButton("1");
        b2  = new JButton("2");
        JButton b3  = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5  = new JButton("5");
        JButton b6  = new JButton("6");
        
        t1= new JTextField();
        GridLayout gl = new GridLayout(3,2,20,20);
        BorderLayout bl = new BorderLayout(5,5);
        b2.addActionListener(this);
        p.setLayout(bl);
        
        p.add("North",t1);
        p.add("South",b2);
        p.add("East",b3);
        p.add("West",b4);
        p.add("Center",b5);
        //p.add(b6);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(p);
    }
  public static void main(String[] args) {
      FormTambah ft = new FormTambah();
  }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b2){
           String msg = t1.getText();
           JOptionPane.showMessageDialog(null, msg);
           
       }
    }
}
