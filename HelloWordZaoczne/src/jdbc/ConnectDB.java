package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.model.Osoba;

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
			PreparedStatement pst = con.prepareStatement(
					"Select *  from Osoba os Join Stanowisko st on (os.stanowisko = st.id)");
			//pst.setInt(1, //parameter number 
			//		 3 //parameter value
			//		 );
			//pst.setString(2, "'nazwisko'");
			pst.execute();
			rs  = pst.getResultSet();
			while (rs.next()){
				System.out.print(rs.getString("Imie"));
				System.out.print(" ");
				System.out.print(rs.getString("Nazwisko"));
				System.out.print(" ");
				System.out.println(rs.getString("nazwa"));
				System.out.println(rs.getInt(1));
				Osoba o = null;
				try{
				o = Osoba.fromResultSet(rs);
				}catch (Exception e){
					
				}
				System.out.print(o.getImie());
				System.out.print(" ");
				System.out.print(o.getNazwisko());
				System.out.print(" ");
				System.out.println(o.getStanowisko().getNazwa());
				System.out.println(o.getId());
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
