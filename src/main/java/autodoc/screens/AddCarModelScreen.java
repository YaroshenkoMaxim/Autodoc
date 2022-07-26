package autodoc.screens;

import autodoc.objects.CarTeslaModelsList;

public class AddCarModelScreen {
	private CarTeslaModelsList carModelsList;
	
	public AddCarModelScreen() {
		carModelsList = new CarTeslaModelsList();
	}
	
	public CarTeslaModelsList getCarModelsList() {
		return carModelsList;
	}
}
