package strumienie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class CzytajZSieci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			URL url = new URL("http://www.onet.pl/");
			//url = new URL("file:///C:\\Users\\Krzysztof\\git\\Zaoczne2015\\HelloWordZaoczne\\src\\strumienie\\CzytajZSieci.java");
			InputStream is = url.openStream();
			int c;
			StringBuilder sb= new StringBuilder();
			while( (c=is.read())!=-1  ){
				sb.append((char) c);
				//Thread.sleep(10);
			}
			//System.out.flush();
			System.out.println(sb.toString());
			System.out.println("KONIEC");
			is.close();
			
			File f = new File("C:\\Users\\Krzysztof\\git\\Zaoczne2015\\HelloWordZaoczne\\src\\strumienie\\CzytajZSieci.java");
			//is = new FileInputStream(f);
			FileReader freader = new FileReader(f);
			BufferedReader br = new BufferedReader(freader);
			FileWriter fwriter = new FileWriter("plik.txt");
			c=1;
			String line;
			while(br.ready()){
				System.out.print("["+ (c) +"]\t");
				line = br.readLine();
				System.out.println(line);
				
				fwriter.write("["+ (c++) +"]\t");
				fwriter.write(line);
				fwriter.write(System.lineSeparator());	//"\n" "\r\n"
			}
			fwriter.close();
			br.close();
		}
		catch(MalformedURLException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
