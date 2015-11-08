package pierwszy;

public class HelloWord {

	public int wartosc;
	public String nazwa= "Jaœniepan Olaf Olafowski";
	private double cena=13.5;
	//private Double cena2;
	
	public HelloWord(){
		wartosc =5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Word");
		HelloWord hw = new HelloWord();
		hw.wartosc=-15;
		hw = new HelloWord();
		System.out.println(hw.wartosc);
		//hw=null;
		String[] tab = hw.nazwa.split("l");
		for (int i=0; i<tab.length;i++)
			System.out.println(tab[i]);
		System.out.println("==========================");
		for(String text : tab){
			System.out.println(text);
		}
		for (int i=0; i<tab.length;i++){
			for (int j=i+1; j<tab.length;j++){
				if (tab[j].length() < tab[i].length()){
					String temp = tab[i];
					tab[i]=tab[j];
					tab[j]=temp;
				}
			}
		}
		System.out.println("==========================");
		for(String text : tab){
			System.out.println(text);
		}
		
		System.out.println(hw);
		
		SamochodCiezarowy sc = new SamochodCiezarowy();
		System.out.println(sc.opis());
	}

	@Override
	public String toString() {
		return String
				.format("HelloWord [wartosc=%s, nazwa=%s]", wartosc, nazwa);
	}

}
