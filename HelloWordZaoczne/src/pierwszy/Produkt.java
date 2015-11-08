package pierwszy;

import java.util.Comparator;


public interface Produkt  extends Comparable<Produkt>{

	public double kup();
	public double getCena();
	public void setCena( double cena);
	public String opis();
}

class ProduktComparator implements Comparator<Produkt>
{

	@Override
	public int compare(Produkt o1, Produkt o2) {
		// TODO Auto-generated method stub
		return o1.opis().compareToIgnoreCase(o2.opis());
	}

	
	
}
