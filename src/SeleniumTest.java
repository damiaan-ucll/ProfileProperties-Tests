import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	private WebDriver driver;
	protected static final String baseURL = "http://localhost:63342/ProfileProperties/";

	@org.junit.Before
	public void setUp() throws Exception {
		System.out.println("hello");
		driver = new FirefoxDriver();
	}

	@org.junit.After
	public void tearDown() throws Exception {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}