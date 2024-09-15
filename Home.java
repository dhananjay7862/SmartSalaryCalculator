import java.awt.*;
import java.awt.event.*;
public class Home extends Frame implements TextListener {
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    public Home()
    {
        setTitle("Salary Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(8,2));
        l1=new Label("Name");
        t1=new TextField();
        l2=new Label("Basic Salary");
        t2=new TextField();
        l3=new Label("TA");
        t3=new TextField();
        l4=new Label("DA");
        t4=new TextField();
        l5=new Label("HRA");
        t5=new TextField();
        l6=new Label("Net Salary");
        t6=new TextField();
        l7=new Label("PF");
        t7=new TextField();
        l8=new Label("Gross Salary");
        t8=new TextField();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        t2.addTextListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void textValueChanged(TextEvent e)
    {
        double bs,ta,da,hra,pf,gross,net;
        bs=Double.parseDouble(t2.getText());
        ta=(bs*10)/100;
        da=(bs*20)/100;
        hra=(bs*6)/100;
        gross=bs+ta+da+hra;
        pf=(bs*15)/100;
        net=gross-pf;
        t3.setText(Double.toString(ta));
        t4.setText(Double.toString(da));
        t5.setText(Double.toString(hra));
        t6.setText(Double.toString(gross));
        t7.setText(Double.toString(pf));
        t8.setText(Double.toString(net));
    }
}
