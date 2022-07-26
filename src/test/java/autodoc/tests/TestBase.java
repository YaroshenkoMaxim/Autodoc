package autodoc.tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;

import autodoc.applogic.ApplicationManager;

public class TestBase {
	protected ApplicationManager app;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		app = new ApplicationManager();
	}
}
