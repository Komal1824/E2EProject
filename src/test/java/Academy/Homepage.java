package Academy;


import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage extends base{
	
	
	@Test
	public void basePageANavigation() throws IOException
	{
		driver = initializeDRiver();
		driver.get("http://qaclickacademy.com");
		
	}
	

}
