package metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SingletonConnexion {
private static Connection connection;
static {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/FACTUREDB","youssef","youssef");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection getConnection() {
	return connection;
}
}
