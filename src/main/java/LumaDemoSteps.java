import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LumaDemoSteps {

    private WebDriver driver;
    @Given("User is on Luma Demo page Men's Tees section")
    public void userIsOnLumaDemoPageMenSTeesSection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
    }

    @When("User chooses {string}")
    public void userChooses(String arg0) {
        driver.findElement(By.xpath("//li[contains(@class, 'product-item')]/div[@class='product-item-info']//a[contains(text(), '" + arg0 + "')]")).click();

    }

    @And("User chooses {string} as the size")
    public void userChoosesAsTheSize(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"option-label-size-143-item-167\"]")));
        driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-167\"]")).click();
    }

    @And("User chooses {string} as the colour")
    public void userChoosesAsTheColour(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")));
        driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")).click();
    }

    @And("User clicks {string} button")
    public void userClicksButton(String arg0) {
        driver.findElement(By.id("product-addtocart-button")).click();

    }

    @Then("Black S size tee is added to the cart")
    public void blackMSizeTeeIsAddedToTheCart() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div")));

        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"mini-cart\"]")));
    }

    @And("Small {string} appears over the cart icon")
    public void smallAppearsOverTheCartIcon(String arg0) {
        Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]")));
        driver.close();
    }

    @Then("Product is not added to the cart")
    public void productIsNotAddedToTheCart() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")));
    }

    @And("Message is shown under size menu")
    public void messageIsShown() {
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"super_attribute[143]-error\"]")));
        driver.close();
    }

    @And("Message is shown under colour menu")
    public void messageIsShownUnderColourMenu() {
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"super_attribute[93]-error\"]")));
        driver.close();
    }

    @And("User changes quantity to {int}")
    public void userChangesQuantityTo(String arg0) {
    }

    @And("A message is shown {string}")
    public void aMessageIsShown(String arg0) {
    }

    @Given("User is on Luma Demo page Men's Tees section with {int} item in cart")
    public void userIsOnLumaDemoPageMenSTeesSectionWithItemInCart(int arg0) {
    }

    @When("User opens the cart from the icon")
    public void userOpensTheCartFromTheIcon() {
    }

    @And("User changes quantity from icon to {int}")
    public void userChangesQuantityFromIconTo(String arg0) {
    }

    @And("User clicks Update button")
    public void userClicks(String arg0) {
    }

    @Then("The quantity is saved as {string}")
    public void theQuantityIsSavedAs(String arg0) {
    }

    @And("Subtotal is tripled")
    public void subtotalIsTripled() {
    }

    @Then("Update button is not visible")
    public void updateButtonIsNotVisible() {
    }

    @And("User clicks the thrash can button")
    public void userClicksTheThrashCanButton() {
    }

    @And("User clicks OK on the pop up")
    public void userClicksOKOnThePopUp() {
    }

    @Then("Item is removed from the cart")
    public void itemIsRemovedFromTheCart() {
    }

    @And("User clicks View and edit cart button")
    public void userClicksViewAndEditCartButton() {
    }

    @And("User clicks the pencil icon")
    public void userClicksThePencilIcon() {
    }

    @And("User changes colour to blue")
    public void userChangesColourToBlue() {
    }

    @And("User changes size to L")
    public void userChangesSizeToL() {
    }

    @And("User clicks Update cart")
    public void userClicksUpdateCart() {
    }

    @Then("A message is shown")
    public void aMessageIsShown() {
    }

    @And("Properties are updated")
    public void propertiesAreUpdated() {
    }
}
