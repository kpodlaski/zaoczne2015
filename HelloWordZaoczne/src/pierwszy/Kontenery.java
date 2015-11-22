package pierwszy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kontenery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produkt> lista = new ArrayList<>();
		lista.add(new Samochod(28585,"Micra"));
		lista.add(new Samochod(12300,"Tata"));
		lista.add(new Samochod(582.33,"Fiat 126P"));
		lista.add(new Samochod(128585,"BMW X6"));
		lista.add(new Samochod(28585,"Micra"));
		
		System.out.println(lista.toString());
		
		for (int i=0; i<lista.size(); i++){
			lista.get(i);
		}
		
		Iterator<Produkt> it = lista.iterator() ;
		while(it.hasNext()){
			Produkt p = it.next();
			if (p.opis().equals("Micra")){
				it.remove();
			}
		}
		
		for(Produkt p : lista){
			if (p.opis().equals("Micra")){
				lista.remove(p);
			}
		}
		
		System.out.println(lista.toString());
		
		Set<Produkt> set = new HashSet<>();
		set.addAll(lista);
		System.out.println("Zbiór zawiera:"+set.size()+" elementów");
		set.add(new Samochod(28585,"Micra"));
		System.out.println("Zbiór zawiera:"+set.size()+" elementów");
		set.add(new Samochod(28585,"Micra"));
		System.out.println("Zbiór zawiera:"+set.size()+" elementów");
		System.out.println(set.toString());
		
		Map<Produkt,String> mapa = new HashMap<>();
		mapa.put(lista.get(0), "Jan Kowalski z Delhi");
		mapa.put(lista.get(1), "Marian Ziêba z Koluszek");
		mapa.put(lista.get(2), "Marian Ziêba z Koluszek");
		mapa.put(lista.get(2), "Marianna Ziêba z Koluszek");
		System.out.println(mapa.toString());
		
		for(Produkt p : mapa.keySet()){
			System.out.println(p+" => "+mapa.get(p));
		}
		
		
		
		
		
	}

}
