import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ExpenseManager implements ActionListener {

    JFrame frame ;

    JTextField t1 = new JTextField("");
    JTextField t2 = new JTextField("");
    JButton b = new JButton("SUBMIT");

    void go(){

        frame = new JFrame("Daily Expenses");

        JLabel l = new JLabel("DAILY KA NATAK");
        JLabel l1 = new JLabel("Amount");
        JLabel l2 = new JLabel("Description");

        frame.add(l1);
        frame.add(l2);
        frame.add(l);

        l.setForeground(Color.WHITE);
        l.setBounds(100,2,500,30);

        l1.setForeground(Color.WHITE);
        l1.setBounds(50,30,500,20);

        l2.setForeground(Color.WHITE);
        l2.setBounds(50,80,500,20);

        frame.add(t1);
        t1.setBounds(50,50,200,30);

        frame.add(t2);
        t2.setBounds(50,100,200,30);

        frame.add(b);
        b.setBounds(50,150,200,30);

        b.addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        frame.getContentPane().setBackground(Color.black);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/try","root","root");

            //Statement stmt=con.createStatement();

            String sql = "INSERT INTO data (amt, dis) VALUES(?,?)";
            String x = t1.getText();
            int x1 = Integer.parseInt(x);
            String y = t2.getText();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, x1);
            pstmt.setString(2, y);
            pstmt.execute();

//            stmt.executeUpdate("INSERT INTO data (amt, dis)"+" VALUES ('"+x1+"' ,'"+y+"');");

            con.close();
            pstmt.close();

        }catch(Exception eX){ System.out.println(e);}
    }

    public static void main(String[] args) {
        ExpenseManager e = new ExpenseManager();
        e.go();
    }
}
