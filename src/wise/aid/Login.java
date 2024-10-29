package wise.aid;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener  {



    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1,b2;

    Login(){


        //Username/Email input
        JLabel namelabel= new JLabel("Username");
        namelabel.setBounds(40, 20, 100, 30);
        namelabel.setFont(new Font( "Tahoma" , Font.BOLD, 16));
        add(namelabel);



        //Password
        JLabel password= new JLabel("Password");
        password.setBounds(40, 70, 100, 30);
        password.setFont(new Font( "Times New Roman" , Font.BOLD, 16));
        add(password);



        //Declaring Globally
        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font( "Times New Roman" , Font.PLAIN, 16));
        textField.setBackground(new Color(245, 245, 220));
        add(textField);



        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 70, 150, 30);
        jPasswordField.setFont(new Font( "Times New Roman" , Font.PLAIN, 16));
        jPasswordField.setBackground(new Color(245, 245, 220));
        add(jPasswordField);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpg"));
        Image i1 = imageIcon.getImage(). getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300, -30, 400, 300);
        add(label);



        b1 = new JButton("Login");
        b1.setBounds(40, 140,120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);


        b2 = new JButton("Cancel");
        b2.setBounds(180, 140,120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);



          getContentPane().setBackground(new Color(255,255,255));
          setSize( 750,  300);
          setLocation(400,270);
          setLayout(null);
          setVisible(true);

    }



    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == b1){
            try{
                conn c = new conn();
                String user = textField.getText();
                String Pass = jPasswordField. getText();

                String q = "select * from login where ID = '"+user+"' and PW = '"+Pass+"'" ;
                ResultSet resultSet = c.statement.executeQuery(q);




                if(resultSet.next()){
                    new Reception();
                    setVisible(false);
                }else{

                    JOptionPane.showMessageDialog(null, "Invalid");
                }


            }catch (Exception E){
                E.printStackTrace();
            }

        }
        else{
            System.exit(10);



        }
    }
  
       

   


    public static void main(String[] args) {
        
       new Login();
    }


}




   

