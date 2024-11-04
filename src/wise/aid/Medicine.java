package wise.aid;

import net.proteanit.sql.DbUtils;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;


public class Medicine extends JFrame {


    JTable table;

    Medicine(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(90, 156, 163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/Medicine.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(90, 156, 163));
        panel.add(table);


        try{
            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        setSize(900,600);
        setLayout(null);
        setLocation(300,230);
        setVisible(true);
    }
    public static void main(String[] args) {

    }
}
