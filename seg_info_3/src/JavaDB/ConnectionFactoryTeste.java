package JavaDB;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTeste {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			System.out.println("Conectado ao banco de dados");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

