package autodoc.screens;

import autodoc.objects.SearchCarmakerField;

public class AddCarMakerScreen {
	private SearchCarmakerField searchCarmakerField;
	
	public AddCarMakerScreen() {
		searchCarmakerField = new SearchCarmakerField();
	}
	
	public SearchCarmakerField getSearchCarmakerField() {
		return searchCarmakerField;
	}
}
