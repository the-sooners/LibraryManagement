package Librarymanagement;
import java.sql.*;
import java.util.logging.Logger;

public class DBClass
{
      static private Connection  connection;
    public static Connection getConnection() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password");
        }
        catch(ClassNotFoundException e)
        {
         Logger.getLogger(e.getMessage());  
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
          }
        return connection;
    }
}
