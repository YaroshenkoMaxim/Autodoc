package autodoc.tests;

import org.testng.annotations.Test;

public class AddEditDeleteCarTest extends TestBase {	
	@Test (priority=1)
	public void addCar() {
		app.getMainScreenHelper().closeCollectBonusesPopUp()
								.clickAddCarButton()
								.clickCarMakerButton()
								.typeTeslaInSearchField()
								.chooseTeslaInSearchField()
								.chooseModel5YJ3InList()
								.chooseModificationEV220KW299PSInList();	
	}
	
	@Test (dependsOnMethods="addCar")
	public void editCar() {
				app.getMainScreenHelper().clickCarDescriptionInGarage()
										.swipeLeftCarDescriptionInGarage()
										.clickEditCarButton()
										.clickCarModificationButton()
										.chooseModificationEV225KW306PSInList()
										.clickSaveButton();
	}
	
	@Test (dependsOnMethods="editCar")
	public void deleteCar() {
		app.getMainScreenHelper().clickCarDescriptionInGarage()
								.swipeLeftCarDescriptionInGarage()
								.cliclDeleteCarButton();
	}
}
