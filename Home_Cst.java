import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.io.*;
import javax.swing.table.*;
import java.util.*;
public class Home_Cst extends JFrame implements ActionListener{
    JButton b1 = new JButton("LogOut");
    JButton b2 = new JButton("Cart");
    //JTextField tf1 = new JTextField();
    //JButton b6 = new JButton("Search");
    JPanel home=new JPanel();
    JPanel books = new JPanel();
    JPanel movie_cds = new JPanel();
    //JPanel checked_items = new JPanel();
    JTabbedPane t = new JTabbedPane();
    JLabel l1=new JLabel("Welcome to the Stall");
    JButton bk1 = new JButton();
    JButton bk2 = new JButton();
    JButton cd1 = new JButton();
    JButton cd2 = new JButton();


public Home_Cst(){
    super("Welcome Customer");
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(1360,768);
        getContentPane().setBackground(Color.gray);
    b1.setBounds(50,475,150,50);
    b2.setBounds(50,235,150,50);
    add(b1);add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    //tf1.setBounds(300,50,700,40);
    //add(tf1);
    //b6.setBounds(1025,50,100,40);
    //add(b6);
    t.setBounds(225,100,1050,575);
    t.add("Home",home);
    t.add("Books",books);
    t.add("Movie CD's",movie_cds);
    //t.add("Checked Items",checked_items);
    l1.setBounds(275,150,850,200);
    l1.setFont(new Font("TimesRoman",Font.BOLD,40));
    home.setLayout(null);
    home.add(l1);
    add(t);
    bk1.addActionListener(this);
    bk2.addActionListener(this);
    cd1.addActionListener(this);
    cd1.addActionListener(this);
    ImageIcon bok1 = new ImageIcon("/home/bolisettynihith/Documents/java_project/SMS/images/bk1.jpg");
    ImageIcon bok2 = new ImageIcon("/home/bolisettynihith/Documents/java_project/SMS/images/bk2.jpg");
    ImageIcon mov1 = new ImageIcon("/home/bolisettynihith/Documents/java_project/SMS/images/cd1.jpg");
    ImageIcon mov2 = new ImageIcon("/home/bolisettynihith/Documents/java_project/SMS/images/cd2.jpg");
    bk1.setBounds(0,0,150,250);
    bk2.setBounds(300,0,150,250);
    cd1.setBounds(0,100,250,500);
    cd2.setBounds(300,100,250,500);
    bk1.setIcon(bok1);
    bk2.setIcon(bok2);
    cd1.setIcon(mov1);
    cd2.setIcon(mov2);
    books.add(bk1);
    books.add(bk2);
    movie_cds.add(cd1);
    movie_cds.add(cd2);
}

public static void main(String[] args){
    new Home_Cst();
}
public void actionPerformed(ActionEvent ar){
    if(ar.getSource()==b1){
        this.setVisible(false);
    }
    if(ar.getSource()==b2){
        new ViewCart("View Cart");
        
    }
    if(ar.getSource()==bk1){
        new Book_club();
        
    }
    if(ar.getSource()==bk2){
        new Harrypotter();
        
    }
    if(ar.getSource()==cd1){
        new LionKing();
        
    }
    if(ar.getSource()==cd2){
        new MIB();
        
    }
}
}