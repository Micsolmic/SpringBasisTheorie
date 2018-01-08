package be.vdab;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Locale;

public class ClassA implements InterfaceA {
	
	private String telefoonNrHelpDesk;
	private EMailAdres webMasterEmailAdres;
	private Date websiteGestart;
	
	public Date getWebsiteGestart() {
		return websiteGestart;
	}

	public void setWebsiteGestart(Date websiteGestart) {
		this.websiteGestart = websiteGestart;
	}

	public EMailAdres getWebMasterEmailAdres() {
		return webMasterEmailAdres;
	}

	public void setWebMasterEmailAdres(EMailAdres webMasterEmailAdres) {
		this.webMasterEmailAdres = webMasterEmailAdres;
	}

	private URL koersenURL;
	private Locale defaultTaalEnLand;
	private File importData;
	private BladRichtingInPrinter defaultBladRichting;
	
	
	public URL getKoersenURL() {
		return koersenURL;
	}

	public Locale getDefaultTaalEnLand() {
		return defaultTaalEnLand;
	}

	public File getImportData() {
		return importData;
	}

	public BladRichtingInPrinter getDefaultBladRichting() {
		return defaultBladRichting;
	}

	public void setKoersenURL(URL koersenURL) {
		this.koersenURL = koersenURL;
	}

	public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
		this.defaultTaalEnLand = defaultTaalEnLand;
	}

	public void setImportData(File importData) {
		this.importData = importData;
	}

	public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
		this.defaultBladRichting = defaultBladRichting;
	}

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}

	public String getBoodschap() {
		
		return "ClassA object";
		
	}
	
}