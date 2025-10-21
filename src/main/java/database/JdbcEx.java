package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) throws SQLException {
		String username = "root";
		String password = "rootmysql123";
		String address = "jdbc:mysql://localhost:3306/dilipdb1";
		
		String createTable = "create table QEA25QE026 (employee_id INT AUTO_INCREMENT PRIMARY KEY, employee_name VARCHAR(20), employee_role VARCHAR(20) )";
		
		String insertData = "Insert into QEA25QE026 (employee_name,  employee_role) VALUES(?, ?)";
		
		String getData = "Select * from QEA25QE026 where employee_id = 4";
		
		Connection connection = DriverManager.getConnection(address, username, password);
		
		Statement st = connection.createStatement();

		
		
//		PreparedStatement ps = connection.prepareStatement(getData);
//		ps.setInt(1, 4);
		
//		ps.setString(1, "Ap");
//		ps.setString(2, "Dev");
//		ps.executeUpdate();
//		
//		ps.setString(1, "Raju");
//		ps.setString(2, "Devops");
//		ps.executeUpdate();
		
		ResultSet results =  	st.executeQuery(getData);;
		
		while(results.next()) {
			System.out.println(results.getInt("employee_id") + " " + results.getString("employee_name") + " " + results.getString("employee_role"));
		}
		
		st.close();
		connection.close();
		
		System.out.println();
	}
}
