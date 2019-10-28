import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.Color;
public class Register extends JFrame implements ActionListener{
    JLabel l1=new JLabel("Name:");
    JLabel l2=new JLabel("Password:");
    JLabel l3 = new JLabel("Confirm Password:");
    JLabel l4=new JLabel("Select Country:");
    JLabel l5=new JLabel("Gender:");
    JLabel l6 = new JLabel("Phone Number:");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3 = new JTextField();
    JRadioButton c1=new JRadioButton("A) Male");    
    JRadioButton c2=new JRadioButton("B) Female");
    ButtonGroup bg=new ButtonGroup();
    JComboBox c=new JComboBox();
    JButton b1=new JButton("SUBMIT");
    JButton b2=new JButton("Close");
    JTextField p1=new JPasswordField();
    JTextField p2=new JPasswordField();

public Register()
{
    super("Register");
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(1360,768);
    //getContentPane().setBackground(Color.gray);
    l1.setBounds(80,80,160,40);
    l2.setBounds(80,160,160,40);
    l3.setBounds(80,240,160,40);
    l4.setBounds(80,320,160,40);
    l5.setBounds(80,400,160,40);
    l6.setBounds(80,480,160,40);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    t1.setBounds(200,80,150,40);
    add(t1);
    t2.setBounds(200,480,150,40);
    add(t2);
    p1.setBounds(200,160,150,40);
    add(p1);
    p2.setBounds(220,240,150,40);
    add(p2);
    c1.setBounds(200,400,100,40);
    c2.setBounds(200,450,100,40);
    add(c1);
    add(c2);
    bg.add(c1);
    bg.add(c2);
    c.setBounds(200,325,110,30);
    c.addItem("INDIA");
    c.addItem("AMERICA");
    c.addItem("AUSTRALIA");
    c.addItem("PHILLIPHINES");
    c.addItem("SPAIN");
    c.addItem("Germany");
    c.addItem("Vietnam");
    c.addItem("France");

    add(c);
    b1.setBounds(100,575,100,60);
    add(b1);
    b1.addActionListener(this);
    b2.setBounds(300,575,100,60);
    add(b2);
    b2.addActionListener(this);
}

public static void main(String[] args){
    new Register();
}
public void actionPerformed(ActionEvent ar){
    String s1 = p1.getText();
    String s2 = p2.getText();
    if(ar.getSource()==b1){
        if(!(s1.equals(s2))){
            JOptionPane.showMessageDialog(null, "Password doesnot match!!!");
        }
        else{
            try{
                File file = new File("/home/bolisettynihith/Documents/java_project/SMS/users.txt");
                FileWriter fw1 = new FileWriter(file,true);
                String User = t1.getText();
                String Pass = p2.getText();
                String full = User + "," + Pass + "\n";
                fw1.write(full);
                fw1.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Registration Successfull, Please login.");
            new Homepage();
            this.dispose();
        }
    }
    else{
        new Homepage();
        this.dispose();
    }
    if(ar.getSource()==b2){
        this.dispose();
    }
}
}