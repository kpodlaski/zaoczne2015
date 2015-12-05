package jdbc.model;

import java.sql.ResultSet;

public class Stanowisko {
	public int id;
	public String Nazwa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return Nazwa;
	}
	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}
	
	public Stanowisko(ResultSet rs){
		
	}
}
