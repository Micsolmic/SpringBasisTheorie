package be.vdab.restclients;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Qualifier("ECB")
@Component
public class ECBKoersenClient implements KoersenClient{
	private final URL url;
	
	@Autowired
	public ECBKoersenClient(@Value("${ecbKoersenURL}")URL url) {
		this.url = url;
	}
	@Override
	public BigDecimal getDollarKoers() {
		try(Scanner xmlScanner = new Scanner(url.openStream())){
			String regel;
			while(!(regel = xmlScanner.nextLine()).contains("USD"));
			try(Scanner regelScanner =  new Scanner(regel)){
				
				regelScanner.findInLine("rate='");
				regelScanner.useDelimiter("'");
				return new BigDecimal(regelScanner.next());
				
			}
			
		}catch(Exception ex) {ex.printStackTrace(); return null;}
		
	}
}
