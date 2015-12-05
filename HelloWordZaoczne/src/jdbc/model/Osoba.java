package jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Osoba {
	public int id;
	public String imie;
	public String nazwisko;
	public String fotka;
	public Stanowisko stanowisko;
	
	public static Osoba fromResultSet(ResultSet rs) throws SQLException {
		Osoba o = null;
		try{
			Stanowisko stanowisko = Stanowisko.fromResultSet(rs);
			int id = rs.getInt("identity");
			String imie = rs.getString("imie");
			String nazwisko = rs.getString("nazwisko");
			String fotka = rs.getString("fotka");
			o= new Osoba(id,imie,nazwisko,fotka, stanowisko);
		}
		catch (SQLException e){
			throw (e);
		}
		return o;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getFotka() {
		return fotka;
	}
	public void setFotka(String fotka) {
		this.fotka = fotka;
	}
	public Stanowisko getStanowisko() {
		return stanowisko;
	}
	public void setStanowisko(Stanowisko stanowisko) {
		this.stanowisko = stanowisko;
	}

	public Osoba(int id, String imie, String nazwisko, String fotka,
			Stanowisko stanowisko) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.fotka = fotka;
		this.stanowisko = stanowisko;
	}
	
}
