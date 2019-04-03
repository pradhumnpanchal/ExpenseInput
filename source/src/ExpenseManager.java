import javax.swing.*;
import java.awt.*;

public class ExpenseManager {
    JFrame frame ;
    void go(){
        frame = new JFrame("Daily Expenses");
        JLabel l1 = new JLabel("Amount");
        JTextField t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        JButton b = new JButton("SUBMIT");
        frame.add(l1);
        //l1.setOpaque(true);
        l1.setForeground(Color.WHITE);
        l1.setBounds(50,25,500,20);
        frame.add(t1);
        t1.setBounds(50,50,200,30);
        frame.add(t2);
        t2.setBounds(50,100,200,30);
        frame.add(b);
        b.setBounds(50,150,200,30);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExpenseManager e = new ExpenseManager();
        e.go();
    }
}
