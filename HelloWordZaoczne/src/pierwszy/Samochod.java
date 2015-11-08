package pierwszy;

public class Samochod implements Produkt {

	private double cena;
	private String opis = "To jest Samochód ale badziewny";
	
	@Override
	public double kup() {
		// TODO Auto-generated method stub
		return cena;
	}

	

	@Override
	public String opis() {
		// TODO Auto-generated method stub
		return opis;
	}



	public double getCena() {
		return cena;
	}



	public void setCena(double cena) {
		this.cena = cena;
	}



	@Override
	public int compareTo(Produkt p) {
		// TODO Auto-generated method stub
		return (int) Math.signum(getCena()-p.getCena());
	}



	public Samochod(double cena) {
		super();
		this.cena = cena;
	}



	public Samochod(double cena, String opis) {
		this(cena);
		this.opis = opis;
	}

}
