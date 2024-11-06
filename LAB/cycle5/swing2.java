import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test extends JFrame implements ActionListener
{
  JLabel x,y;
  JTextField t1,t2;
  JButton b1,b2;
  test()
  {
    JFrame f = new JFrame("Login");
    x = new JLabel("Username");
    t1 = new JTextField(10);
    y = new JLabel("Password");
    t2 = new JPasswordField(10);
    b1 = new JButton("Login");
    b2 = new JButton("Clear");
    JPanel p =new JPanel (new GridLayout(3,3));
    p.add(x);
    p.add(y);
    p.add(t1);
    p.add(t2);
    p.add(b1);
    p.add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    f.add(p);
    f.setSize(300,300);
    f.show();
  }
   public void actionPerformed(ActionEvent e)
    {
      String s = e.getActionCommand();
      if (s.equals("Login"))
      {
        x.setText(t1.getText());
        y.setText(t2.getText());
        t1.setText("");
        t2.setText("");
      }
      else
      {
        t1.setText("");
        t2.setText("");
      }
    }
    public static void main(String args[])
    {
      test t1 = new test();
      test t2 = new test();
    }
}  
