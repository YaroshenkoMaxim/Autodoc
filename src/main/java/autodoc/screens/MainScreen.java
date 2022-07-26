package autodoc.screens;

import autodoc.objects.BannerOnMain;
import autodoc.objects.CollectBonusesPopUp;
import autodoc.objects.Header;

public class MainScreen {
	private CollectBonusesPopUp popUp;
	private Header header;
	private BannerOnMain banner;
	
	public MainScreen() {
		popUp = new CollectBonusesPopUp();
		header = new Header();
		banner = new BannerOnMain();
	};
	
	public CollectBonusesPopUp getCollectBonusesPopUp() {
		return popUp;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public BannerOnMain getBannerOnMain() {
		return banner;
	}
}
