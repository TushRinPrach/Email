package notification;
import java.sql.*;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;



public class Notification {
    
    private static final String USERNAME="Prachita";
    private static final String PASSWORD="Prachita";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
    static private Connection conn;
    Notification()
    {
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("CONNECTED");
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
        }
    }
    public void mailing()
    {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Notification n = new Notification();
        n.mailing();
    }
    
}
