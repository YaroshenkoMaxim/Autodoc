package autodoc.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.AddCarModelScreen;

public class AddCarModelHelper extends HelperBase {
	private AddCarModelScreen screen;
	
	public AddCarModelHelper(ApplicationManager app) {
		super(app);
		screen = new AddCarModelScreen();
	}
	
	public AddCarModificationHelper chooseModel5YJ3InList() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(screen.getCarModelsList().model5YJ3)));
		driver.findElementByAndroidUIAutomator(screen.getCarModelsList().model5YJ3).click();
		
		return app.getSearchCarModificationHelper();
	}
}
