
package travel;
import java.sql.Connection;
import java.sql.DriverManager;

public class connections {
    static Connection con;
    public static Connection getConnection(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","");
    }catch(Exception ex){
    System.out.println(""+ex);
    }
    return con;
    }
}

    
    
