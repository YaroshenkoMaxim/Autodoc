package autodoc.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HelperBase {	
	protected ApplicationManager app;
	protected AndroidDriver<MobileElement> driver;
	protected Wait<WebDriver> wait;
	protected String baseUrl;
	
	public HelperBase(ApplicationManager app) {
		this.app = app;
		driver = app.getDriver();
		wait = app.getWait();
	}
}
