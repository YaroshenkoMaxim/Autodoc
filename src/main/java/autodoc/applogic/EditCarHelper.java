package autodoc.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.EditCarScreen;

public class EditCarHelper extends HelperBase {
	private EditCarScreen screen;
	
	public EditCarHelper(ApplicationManager app) {
		super(app);
		screen = new EditCarScreen();
	}
	
	public EditCarModificationHelper clickCarModificationButton() {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAndroidUIAutomator(screen.getEditCarBlock().carModificationButton)));
		driver.findElementByAndroidUIAutomator(screen.getEditCarBlock().carModificationButton).click();
		
		return app.getEditCarModificationHelper();
	}
	
	public MainScreenHelper clickSaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(screen.getEditCarBlock().saveButton)));
		driver.findElementById(screen.getEditCarBlock().saveButton).click();
		
		return app.getMainScreenHelper();
	}
}
