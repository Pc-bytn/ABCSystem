import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static Connection connect(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/abcsystemdb","root","");
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }
}
