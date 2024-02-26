package jarduera5_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class futbol {

	private Connection conexion() {
		String url = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=futbol";
		String username = "root";
		String password = "";
		Connection connection = null;		
		
		try {
			connection = DriverManager.getConnection(url, username, password );
			System.out.println("Datu Basera konektatzen.");
	
		} catch (SQLException e){
			System.out.println("Errorea " + e.getMessage());
		}
		
		return connection;
	}
	
	
	}


