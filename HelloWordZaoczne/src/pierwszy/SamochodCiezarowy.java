package pierwszy;import java.io.Serializable;

public class SamochodCiezarowy extends Samochod implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7071190598936962338L;

	/**
	 * 
	 */
	

	@Override
	public String opis() {
		// TODO Auto-generated method stub
		return super.opis()+ " ale cie¿arowy";
	}

	public SamochodCiezarowy(double cena) {
		super(cena);
		// TODO Auto-generated constructor stub
	}

}
