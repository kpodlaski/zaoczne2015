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



	@Override
	public String toString() {
		return String.format("%s; cena:%s", opis, cena);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Samochod other = (Samochod) obj;
		if (Double.doubleToLongBits(cena) != Double
				.doubleToLongBits(other.cena))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		return true;
	}

	
}
