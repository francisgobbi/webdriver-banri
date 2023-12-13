package br.com.banrisul.core;

import org.junit.jupiter.api.AfterEach;

import br.com.banrisul.core.DriverFactory;

public abstract class BaseTest {
	
	@AfterEach
	public void tearDown() {
		DriverFactory.killDriver();
	}

}
