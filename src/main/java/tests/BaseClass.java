package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	private static final String CapabilityType.PLATFORM_NAME, "ANDROID" = null;

	@BeforeTest
	public void setup() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
	}
	
	@AfterTest
	public void teardown() {
		
		
		
		
	}
	
}
