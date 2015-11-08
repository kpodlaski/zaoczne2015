package pierwszy;import java.io.Serializable;

public class SamochodCiezarowy extends Samochod implements Serializable, Comparable<SamochodCiezarowy>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7071190598936962338L;

	/**
	 * 
	 */
	

	@Override
	public int compareTo(SamochodCiezarowy o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String opis() {
		// TODO Auto-generated method stub
		return super.opis()+ " ale cie¿arowy";
	}

}
