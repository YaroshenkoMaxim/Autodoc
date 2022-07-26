package autodoc.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.AddCarMakerScreen;

public class AddCarMakerHelper extends HelperBase {
	private AddCarMakerScreen screen;
	
	public AddCarMakerHelper(ApplicationManager app) {
		super(app);
		screen = new AddCarMakerScreen();
	}
	
	public AddCarMakerHelper typeTeslaInSearchField() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(screen.getSearchCarmakerField().searchFieldId)));
		driver.findElementById(screen.getSearchCarmakerField().searchFieldId).sendKeys("Tesla");
	
		return this;
	}
	
	public AddCarModelHelper chooseTeslaInSearchField() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(screen.getSearchCarmakerField().searchResultTesla)));
		driver.findElementByAndroidUIAutomator(screen.getSearchCarmakerField().searchResultTesla).click();
		
		return app.getSearchCarModelHelper();
	}
}
