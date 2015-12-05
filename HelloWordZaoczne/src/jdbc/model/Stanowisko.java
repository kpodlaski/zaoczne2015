package jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Stanowisko {
	public int id;
	public String nazwa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		nazwa = nazwa;
	}
	
	public static Stanowisko fromResultSet(ResultSet rs) throws SQLException{
		int id = rs.getInt("stanowisko");
		String nazwa = rs.getString("nazwa");
		return new Stanowisko(id, nazwa);
		
	}
	public Stanowisko(int id, String nazwa) {
		super();
		this.id = id;
		this.nazwa = nazwa;
	}
	
	
}
