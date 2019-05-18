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
            String sql = "insert into data (amt, dis)"+" values(?,?)";
            //String x = t1.getText();
            int x1 = 1;
            String y = "try";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, x1);
            pstmt.setString(2, y);
            pstmt.execute();

//           stmt.executeUpdate("INSERT INTO data (amt, dis)"+" VALUES ('"+x1+"' ,'"+y+"');");
            //pstmt.close();
            con.close();


        }catch(Exception eX){ System.out.println("fuck");}
    }
}
