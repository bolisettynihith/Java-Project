import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.awt.Font;
import javax.swing.*;
import java.awt.Color;
public class Book_club extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1;
JPanel panel1;

Book_club(){
super("Book Club");
l1=new JLabel();
l2=new JLabel("Name");
l3=new JLabel("Book Club");
l4=new JLabel("Pages");
l5=new JLabel("400");
l6=new JLabel("Author");
l7=new JLabel("Montry");
l8=new JLabel("Price");
l9=new JLabel("Rs 3900");
l10=new JLabel();
b1=new JButton("ADD TO CART");
panel1=new JPanel();
b1.addActionListener(this);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
addAll();
}
public void addAll() {
//l1.setBounds(0,0,600,600);
//ImageIcon ip=new ImageIcon("/home/bolisettynihith/Documents/java_project/OopMaster/select.png");
//l1.setIcon(ip);
l2.setBounds(40,40,150,20);
l3.setBounds(160,40,150,20);
l4.setBounds(40,100,150,20);
l5.setBounds(160,100,150,20);
l6.setBounds(40,160,150,20);
l7.setBounds(160,160,150,20);
l8.setBounds(40,220,150,20);
l9.setBounds(160,220,150,20);
/*l2.setFont(new Font("Kalimati",Font.ITALIC,16));
l2.setForeground(Color.WHITE);
l3.setFont(new Font("Kalimati",Font.ITALIC,16));
l3.setForeground(Color.WHITE);
l4.setFont(new Font("Kalimati",Font.ITALIC,16));
l4.setForeground(Color.WHITE);
l5.setFont(new Font("Kalimati",Font.ITALIC,16));
l5.setForeground(Color.WHITE);
l6.setFont(new Font("Kalimati",Font.ITALIC,16));
l6.setForeground(Color.WHITE);
l7.setFont(new Font("Kalimati",Font.ITALIC,16));
l7.setForeground(Color.WHITE);
l8.setFont(new Font("Kalimati",Font.ITALIC,16));
l8.setForeground(Color.WHITE);
l9.setFont(new Font("Kalimati",Font.ITALIC,16));
l9.setForeground(Color.WHITE);*/
b1.setBounds(50,370,200,30);
/*b1.setFont(new Font("Kalimati",Font.ITALIC,21));
b1.setForeground(Color.GREEN);
b1.setBackground(new Color(0,0,0,20));*/
ImageIcon ip1=new ImageIcon("/home/bolisettynihith/Documents/java_project/OopMaster/iphone11.png");
l10.setBounds(320,40,300,500);
l10.setIcon(ip1);
panel1.add(l2);
panel1.add(l3);
panel1.add(l4);
panel1.add(l5);
panel1.add(l6);
panel1.add(l7);
panel1.add(l8);
panel1.add(l9);
panel1.add(b1);
panel1.add(l10);
//panel1.add(l1);
panel1.setLayout(null);
panel1.setSize(600,600);
panel1.setVisible(true);
add(panel1);
setSize(600,600);
setVisible(true);
setLayout(null);
setLocationRelativeTo(null);

}
public static void main(String[] args){
    new Book_club();
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {
try {
File file=new File("/home/bolisettynihith/Documents/java_project/SMS/products.txt");
FileWriter fw=new FileWriter(file,true);
fw.write("Book Club,150\n");
fw.close();
JOptionPane.showMessageDialog(null, "Added to cart");
dispose();
}
catch(Exception f){
JOptionPane.showMessageDialog(null, f);
}
}
}
}