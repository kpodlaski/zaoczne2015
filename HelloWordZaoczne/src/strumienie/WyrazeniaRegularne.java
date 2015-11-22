package strumienie;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {

	public static void main(String s[]) throws Exception{
		Pattern pattern = Pattern.compile("<a[^>]*/?>");
		Pattern patternHref = Pattern.compile("href=(([^>^=]*))");
		
		URL url = new URL("http://www.onet.pl/");
		InputStream is = url.openStream();
		int c;
		StringBuilder sb= new StringBuilder();
		while( (c=is.read())!=-1  ){
			sb.append((char) c);
			//Thread.sleep(10);
		}
		//System.out.flush();
		is.close();
		
		Matcher matcher = pattern.matcher(sb);
		int counter = 0;
		String el;
		while (matcher.find()){
			System.out.println(matcher.group());
			Matcher matcherH = patternHref.matcher(matcher.group());
			if (!matcherH.find()) continue;
			System.out.println(matcherH.group(1).replace("\"", ""));
			System.out.println("==================");
			counter++;
		}
		System.out.println(counter);
		
	}
}
