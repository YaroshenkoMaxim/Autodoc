package autodoc.applogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import autodoc.screens.MainScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MainScreenHelper extends HelperBase {
	private MainScreen screen;
	
	public MainScreenHelper(ApplicationManager app) {
		super(app);
		screen = new MainScreen();
	}
	
	public MainScreenHelper closeCollectBonusesPopUp() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(screen.getCollectBonusesPopUp().closeButtonId)));
		driver.findElementById(screen.getCollectBonusesPopUp().closeButtonId).click();
		
		return this;
	}
	
	public AddCarHelper clickAddCarButton() {
		driver.findElementById(screen.getHeader().addCarButtonId).click();
		
		return app.getAddCarHelper();
	}
	
	public MainScreenHelper clickCarDescriptionInGarage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(screen.getBannerOnMain().bannerId)));
		wait.until(ExpectedConditions.visibilityOf(driver.findElementById(screen.getBannerOnMain().bannerId)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(screen.getHeader().carInGarageDescriptionId)));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(screen.getHeader().carInGarageDescriptionId)));
		driver.findElementById(screen.getHeader().carInGarageDescriptionId).click();
		
		return this;
	}
	
	public MainScreenHelper swipeLeftCarDescriptionInGarage() {
		MobileElement topCharts = driver.findElement(MobileBy.id(screen.getHeader().carInGarageSwipeContentId));
		Point point = topCharts.getLocation();
		int startY = point.y;
		int endY = point.y;

		int startX = (int) ((driver.manage().window().getSize().getWidth()) * 0.80);
		int endX = (int) ((driver.manage().window().getSize().getWidth()) * 0.20);

		TouchAction<?> actions = new TouchAction<>(driver);
		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endX, endY)).release().perform();
		
		return this;
	}
	
	public EditCarHelper clickEditCarButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(screen.getHeader().carInGarageEditButonId)));
		driver.findElementById(screen.getHeader().carInGarageEditButonId).click();
		
		return app.getEditCarHelper();
	}
	
	public MainScreenHelper cliclDeleteCarButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(screen.getHeader().carInGarageDeleteButonId)));
		driver.findElementById(screen.getHeader().carInGarageDeleteButonId).click();
		
		return this;
	}
}
