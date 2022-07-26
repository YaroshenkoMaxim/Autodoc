package autodoc.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.EditCarModificationScreen;

public class EditCarModificationHelper extends HelperBase {
	private EditCarModificationScreen screen;
	
	public EditCarModificationHelper(ApplicationManager app) {
		super(app);
		screen = new EditCarModificationScreen();
	}
	
	public EditCarHelper chooseModificationEV225KW306PSInList() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(screen.getCarTeslaModel5YJ3ModificationsList().modificationEV225KW306PS)));
		driver.findElementByAndroidUIAutomator(screen.getCarTeslaModel5YJ3ModificationsList().modificationEV225KW306PS).click();
		
		return app.getEditCarHelper();
	}
}
