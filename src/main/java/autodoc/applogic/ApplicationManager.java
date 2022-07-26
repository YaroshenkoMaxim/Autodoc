package autodoc.applogic;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import autodoc.util.PropertyLoader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class ApplicationManager {
	private AndroidDriver<MobileElement> driver;
	private Wait<WebDriver> wait;

	private AddCarHelper addCarHelper;
	private MainScreenHelper mainScreenHelper;
	private AddCarMakerHelper searchCarMakerHelper;
	private AddCarModelHelper searchCarModelHelper;
	private AddCarModificationHelper searchCarModificationHelper;
	private EditCarHelper editCarHelper;
	private EditCarModificationHelper editCarModificationHelper;
	
	public ApplicationManager() throws MalformedURLException {		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", (new PropertyLoader()).loadProperty("platformName"));
		caps.setCapability("platformVersion", (new PropertyLoader()).loadProperty("platformVersion"));
		caps.setCapability("deviceName", (new PropertyLoader()).loadProperty("deviceName"));
		caps.setCapability("udid", (new PropertyLoader()).loadProperty("udid"));
		caps.setCapability("appPackage", "de.autodoc.gmbh");
        caps.setCapability("appActivity", "de.autodoc.gmbh.ui.activity.MainActivity");
		caps.setCapability("app", System.getProperty("user.dir") +  "\\src\\test\\resources\\apps\\AUTODOC_ buy car parts online_2.2.0.apk");
		
		driver = new AndroidDriver<MobileElement>(new URL((new PropertyLoader()).loadProperty("url")), caps);
		
		 wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30L)).pollingEvery(Duration.ofSeconds(5L))
		.ignoring(NoSuchElementException.class);
		
		addCarHelper = new AddCarHelper(this);
		mainScreenHelper = new MainScreenHelper(this);
		searchCarMakerHelper = new AddCarMakerHelper(this);
		searchCarModelHelper = new AddCarModelHelper(this);
		searchCarModificationHelper = new AddCarModificationHelper(this);
		editCarHelper = new EditCarHelper(this);
		editCarModificationHelper = new EditCarModificationHelper(this);
	}
	
	protected AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
	
	protected Wait<WebDriver> getWait() {
		return wait;
	}
	
	public AddCarHelper getAddCarHelper() {
		return addCarHelper;
	}
	
	public MainScreenHelper getMainScreenHelper() {
		return mainScreenHelper;
	}
	
	protected AddCarMakerHelper getSearchCarMakerHelper() {
		return searchCarMakerHelper;
	}
	
	protected AddCarModelHelper getSearchCarModelHelper() {
		return searchCarModelHelper;
	}
	
	protected AddCarModificationHelper getSearchCarModificationHelper() {
		return searchCarModificationHelper;
	}
	
	public EditCarHelper getEditCarHelper() {
		return editCarHelper;
	}
	
	public EditCarModificationHelper getEditCarModificationHelper() {
		return editCarModificationHelper;
	}
}
