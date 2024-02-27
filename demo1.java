import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements KeyListener{
JTextField tx1;
JPasswordField tx2;
FDemo()
{
setTitle("Login page");
setLayout(null);
Font f=new Font ("",Font.BOLD,30);
 
JLabel un=new JLabel("Enter Name");
un.setSize(350,70);
un.setLocation(100,100);
un.setFont(f);
add(un);
JLabel up=new JLabel("Enter Pass");
up.setSize(350,70);
up.setLocation(100,200);
up.setFont(f);
add(up);

tx1=new JTextField("Enter Name",10);
 tx1.setSize(500,70);
 tx1.setLocation(450,100);
 tx1.setFont(f);
 tx1.setForeground(Color.gray);
 tx1.addKeyListener(this);
 add(tx1);
 
 tx2=new JPasswordField("Enter Pass",10);
 tx2.setSize(500,70);
 tx2.setLocation(450,200);
 tx2.setFont(f);
 tx2.addKeyListener(this);
 tx2.setForeground(Color.gray);
 add(tx2);
 
 JButton b1=new JButton("Clicks!!");
 b1.setSize(200,40);
 b1.setLocation(250,350);
 b1.setFont(f);
 add(b1);
 
 setResizable(false);
}
public void keyReleased(KeyEvent e)
{
if(tx1.isFocusOwner())
{
String s1=tx1.getText().trim();
if(s1.equals(""))
{
tx1.setText("Enter Name");
tx1.setForeground(Color.gray);
}
}
if(tx2.isFocusOwner())
{
String s2=tx2.getText().trim();
if(s2.equals(""))
{
tx2.setText("Enter Pass");
tx2.setForeground(Color.gray);
tx2.setEchoChar((char)0);
}
}
} 
public void keyPressed(KeyEvent e)
{
if(tx1.isFocusOwner())
{
String s1=tx1.getText();
if(s1.equals("Enter Name"))
{
tx1.setText("");
tx1.setForeground(Color.black);
}
}
if(tx2.isFocusOwner())
{
String s2=tx2.getText();
if(s2.equals("Enter Pass"))
{
tx2.setText("");
tx2.setForeground(Color.black);
tx2.setEchoChar('*');
}
}
}
public void keyTyped(KeyEvent e){} 
}
class demo1
{
public static void main(String ar[])
{
FDemo f1=new FDemo();
f1.setVisible(true);
f1.setSize(1100,500);
f1.setLocation(200,100);
f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
}
}