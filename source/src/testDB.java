import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class testDB {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/try","root","root");
            //Statement stmt=con.createStatement();
            String sql = "INSERT INTO data (amt, dis) VALUES(?,?)";
            //String x = t1.getText();
            String x1 = "1";
            String y = "try";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, x1);
            pstmt.setString(2, y);
            pstmt.executeUpdate();

//           stmt.executeUpdate("INSERT INTO data (amt, dis)"+" VALUES ('"+x1+"' ,'"+y+"');");

            con.close();
            pstmt.close();

        }catch(Exception eX){ System.out.println("fuck");}
    }
}