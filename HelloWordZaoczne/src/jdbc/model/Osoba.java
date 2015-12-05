package jdbc.model;

import java.sql.ResultSet;

public class Osoba {
	public int id;
	public String imie;
	public String nazwisko;
	public String fotka;
	public Stanowisko stanowisko;
	
	public Osoba(ResultSet rs){
		
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
	
}
