package wise.aid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 2025, 670);
        panel.setBackground(new Color(135,206,235));
        add(panel);


        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1975, 150);
        panel1.setBackground(new Color(135,206,235));
        add(panel1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/doctor.png"));
        Image image = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1300,0,250,250);
        panel1.add(label);

         JButton btn1 = new JButton("Add New Patient");
         btn1.setBounds(50,25,280,60);
         btn1.setBackground(new Color(245, 245, 220));
         panel1.add(btn1);
         btn1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                      new Add_New_Patient();
             }
         });


        JButton btn2 = new JButton("Medicine");
        btn2.setBounds(50,90,280,60);
        btn2.setBackground(new Color(245, 245, 220));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Medicine();
            }
        });


        JButton btn3 = new JButton("Doctor's Appointment");
        btn3.setBounds(360,25,280,60);
        btn3.setBackground(new Color(245, 245, 220));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Appointment();
            }
        });


        JButton btn4 = new JButton("Nutrition Management");
        btn4.setBounds(360,90,280,60);
        btn4.setBackground(new Color(245, 245, 220));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new Nutrition();
            }
        });

        JButton btn5 = new JButton("Transport");
        btn5.setBounds(670,25,280,60);
        btn5.setBackground(new Color(245, 245, 220));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new Transport();
            }
        });




        setSize(1950, 1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
    
}
