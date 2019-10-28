import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
public class Homepage extends JFrame implements ActionListener{
    JLabel l1 = new JLabel("Username");
    JLabel l2 = new JLabel("Password");
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel("Welcome to login page");
    JTextField t1=new JTextField();
    JTextField p1=new JPasswordField();
    JButton b1=new JButton("Sign in");
    JButton b2=new JButton("Sign Up");
    ImageIcon i1 = new ImageIcon("/home/bolisettynihith/Documents/java_project/SMS/images/Background.jpg");
    JPanel panel = new JPanel();

public Homepage(){
    super("Home");
    l3.setIcon(i1);
    l3.setBounds(0,0,750,420);
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(750,420);
    getContentPane().setBackground(Color.gray);
    l1.setBounds(75,100,200,40);
    l2.setBounds(75,200,200,40);
    add(l1);
    add(l2);
    add(l4);
    t1.setBounds(200,100,200,40);
    add(t1);
    p1.setBounds(200,200,200,40);
    add(p1);
    b1.setBounds(200,300,100,60);
    add(b1);
    b1.addActionListener(this);
    b2.setBounds(400,300,100,60);
    add(b2);
    b2.addActionListener(this);
    panel.add(b1);
    panel.add(p1);
    panel.add(t1);
    panel.add(l3);
    //panel.add(l2);
    //panel.add(l1);
    panel.setLayout(null);
    panel.setSize(750,420);
    add(panel);
    setLocationRelativeTo(null);

}
public static void main(String[] args){
    new Homepage();
}
public void actionPerformed(ActionEvent ar){
    String U = "root";
    String P = "root";
    String s2 = p1.getText();
    String s1 = t1.getText();
    if(ar.getSource()==b1){
        if (s1.equals(U) && s2.equals(P)) {
            new Home_Onr();
            this.dispose();
        }
        else if(!s1.equals("") && !s2.equals("")){
            try{
                File file=new File("/home/bolisettynihith/Documents/java_project/SMS/users.txt");
	    		Scanner read = new Scanner(file);
	    		read.useDelimiter("\\n|,");
	    		boolean check=false;
	    		while(read.hasNext()){
	    		    String user = read.next();
	    		    String pass = read.next();
	    		    if(s1.equals(user) && s2.equals(pass)) {
	    			    check=true;
	    		    }
	    		}
                if(check) {
	    			new Home_Cst();
	    		}
	    	    else {
	    			JOptionPane.showMessageDialog(null, "Please Sign-Up");
	    	    	new Register();
                }
                dispose();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");
            new Homepage();
        }
    }
    if(ar.getSource()==b2){
        dispose();
        new Register();
    }
}
}