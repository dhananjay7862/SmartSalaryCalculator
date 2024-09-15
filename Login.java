import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends Frame implements ActionListener {
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    public Login()
    {
        setTitle("Login Window");
        setSize(500,200);
        setLayout(new GridLayout(3,2));
        l1=new Label("User Name");
        t1=new TextField();
        l2=new Label("Password");
        t2=new TextField();
        t2.setEchoChar('*');
        b1=new Button("Login");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(new Label());
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String un=t1.getText();
        String pw=t2.getText();
        if(un.equals("dhananjay") && pw.equals("secret"))
        {
            setVisible(false);
            new Home();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid User Name or Password");
        }
    }
}
