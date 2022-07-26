package autodoc.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.AddCarModificationScreen;

public class AddCarModificationHelper extends HelperBase {
	private AddCarModificationScreen screen;
	
	public AddCarModificationHelper(ApplicationManager app) {
		super(app);
		screen = new AddCarModificationScreen();
	}
	
	public MainScreenHelper chooseModificationEV220KW299PSInList() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(screen.getCarTeslaModel5YJ3ModificationsList().modificationEV220KW299PS)));
		driver.findElementByAndroidUIAutomator(screen.getCarTeslaModel5YJ3ModificationsList().modificationEV220KW299PS).click();
		
		return app.getMainScreenHelper();
	}
}
