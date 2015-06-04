import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestWebsite extends SeleniumTest {

	private WebElement newNameField;
	private WebElement newDescriptionField;
	private Select newTypeField;
	private WebElement submitButton;

	@Before
	@Override public void setUp() throws Exception {
		super.setUp();
		getDriver().get(baseURL + "index.php");

		newNameField = getDriver().findElement(By.id("nameInput"));
		newDescriptionField = getDriver().findElement(By.id("descriptionInput"));
		newTypeField = new Select(getDriver().findElement(By.id("typeInput")));
		submitButton = getDriver().findElements(By.cssSelector("input[type=submit]")).get(0);

	}

	@Test
	public void addNewAndDeleteProperty(){
		newNameField.sendKeys("Haarkleur");
		newDescriptionField.sendKeys("De kleur van je haar");
		newTypeField.selectByVisibleText("String");
		submitButton.click();

//		getDriver().findElements(By.cssSelector("tbody > td"));
	}

}
