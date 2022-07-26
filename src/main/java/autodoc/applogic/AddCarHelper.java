package autodoc.applogic;

import autodoc.screens.AddCarScreen;

public class AddCarHelper extends HelperBase {
	private AddCarScreen screen;
	
	public AddCarHelper(ApplicationManager app) {
		super(app);
		screen = new AddCarScreen();
	}
	
	public AddCarMakerHelper clickCarMakerButton() {
		driver.findElementById(screen.getAddCarByModelBlock().carMakerButton).click();
		
		return app.getSearchCarMakerHelper();
	}
}
