package pierwszy;

public class Samochod implements Produkt {

	private double cena; 
	
	@Override
	public double kup() {
		// TODO Auto-generated method stub
		return cena;
	}

	

	@Override
	public String opis() {
		// TODO Auto-generated method stub
		return "To jest Samochód ale badziewny";
	}



	public double getCena() {
		return cena;
	}



	public void setCena(double cena) {
		this.cena = cena;
	}

}
