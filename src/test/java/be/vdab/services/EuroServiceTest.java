package be.vdab.services;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import be.vdab.restclients.DummyKoersenClient;
import be.vdab.restclients.KoersenClient;

public class EuroServiceTest {

	private KoersenClient koersenClient;
	private EuroService euroService;
	
	@Before
	public void before() {
		
		koersenClient = new DummyKoersenClient();
		euroService = new EuroService(koersenClient);
	}
	
	
	@Test
	public void naarDollar() {
		
		Assert.assertEquals(0, BigDecimal.valueOf(6).compareTo(euroService.naarDollar(BigDecimal.valueOf(4))));
		
	}
	
}
