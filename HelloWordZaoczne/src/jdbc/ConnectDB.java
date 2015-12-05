package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@oradb.pi.uni.lodz.pl:1521:orcl",
					"javastudent",
					"p@ssw0rd");
			Statement st = con.createStatement();
			String param = "3";
			st.execute("Select * from Osoba where id>"+param);
			ResultSet rs  = st.getResultSet();
			while (rs.next()){
				System.out.print(rs.getString("Imie"));
				System.out.print(" ");
				System.out.print(rs.getString("Nazwisko"));
				System.out.print(" ");
				System.out.println(rs.getInt(1));
			}
			System.out.println("===================================");
			PreparedStatement pst = con.prepareStatement("Select * from Osoba where id>? ORDER BY nazwisko");
			pst.setInt(1, //parameter number 
					 3 //parameter value
					 );
			//pst.setString(2, "'nazwisko'");
			pst.execute();
			rs  = pst.getResultSet();
			while (rs.next()){
				System.out.print(rs.getString("Imie"));
				System.out.print(" ");
				System.out.print(rs.getString("Nazwisko"));
				System.out.print(" ");
				System.out.println(rs.getInt(1));
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
