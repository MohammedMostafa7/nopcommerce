package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    //variables
    WebDriver driver;
    //locators
    private By currenciesDropDown = By.id("customerCurrency");
    private By Pc = By.cssSelector("a[href=\"/build-your-own-computer\"]");
    private By PcPrice = By.cssSelector("[class=\"price actual-price\"]");
    private By macBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
    private By macbookPrice = By.cssSelector("[class=\"price actual-price\"]");
    private By Htc = By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
    private By HtcPrice = By.cssSelector("[class=\"price actual-price\"]");
    private By giftCard = By.cssSelector("a[href=\"/25-virtual-gift-card\"]");
    private By giftCardPrice = By.cssSelector("[class=\"price actual-price\"]");
    private By searchBox = By.cssSelector("input[id=\"small-searchterms\"]");
    private By searchBtn = By.cssSelector("button[type=\"submit\"]");
    private By computers = By.xpath("//a[@href=\"/computers\"]");
    private By noteBooks = By.cssSelector("[href=\"/notebooks\"]");
    private By iphoneSlider = By.cssSelector("[href=\"https://demo.nopcommerce.com/\"]");
    private By s22Slider = By.cssSelector("[href=\"https://demo.nopcommerce.com/\"]");
    private By facebook = By.cssSelector("[href=\"http://www.facebook.com/nopCommerce\"]");
    private By twitter = By.cssSelector("[href=\"https://twitter.com/nopCommerce\"]");
    private By Rss = By.cssSelector("[href=\"/news/rss/1\"]");
    private By youtube = By.cssSelector("[href=\"http://www.youtube.com/user/nopCommerce\"]");
    private By addToWishList = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
    private By WishListMsg = By.cssSelector("[class=\"bar-notification success\"]");
    private By wishListBtn = By.cssSelector("[href=\"/wishlist\"]");
    private By productList = By.cssSelector("[class=\"wishlist-qty\"]");

    //constructor

    public P03_homePage(WebDriver driver) {

        this.driver = driver;
    }

    //action
    public void chooseCurrencies(String currencies) {
        Select selectEuro = new Select(driver.findElement(currenciesDropDown));
        selectEuro.selectByValue(currencies);
    }

    public List<WebElement> checkEuroInPc() {
        return driver.findElements(RelativeLocator.with(PcPrice).below(Pc));
    }

    public List<WebElement> checkEuroInMacBook() {
        return driver.findElements(RelativeLocator.with(macbookPrice).below(macBook));
    }

    public List<WebElement> checkEuroInHtc() {
        return driver.findElements(RelativeLocator.with(HtcPrice).below(Htc));

    }

    public List<WebElement> checkEuroInGiftCard() {
        return driver.findElements(RelativeLocator.with(giftCardPrice).below(giftCard));
    }

    public void insertProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
    }

    public void insertSku(String Sku) {

        driver.findElement(searchBox).sendKeys(Sku);
    }

    public void clickSearchBtn() {

        driver.findElement(searchBtn).click();
    }

    public WebElement hoverOnComputers() {

        return driver.findElement(computers);
    }

    public void clickOnNoteBooks() {
        driver.findElement(noteBooks).click();
    }

    public void clickIphone14() {

        driver.findElement(iphoneSlider).click();
    }

    public void clickS22() {
        driver.findElement(s22Slider).click();
    }

    public void clickOnFacebook() {
        driver.findElement(facebook).click();
    }

    public void clickOnTwitter() {
        driver.findElement(twitter).click();
    }

    public void clickOnRss() {
        driver.findElement(Rss).click();
    }

    public void clickOnYoutube() {

        driver.findElement(youtube).click();
    }

    public void addHtcToWishList() {
        driver.findElement(RelativeLocator.with(addToWishList).below(Htc)).click();
    }

    public WebElement wishListSuccessMsg() {
        return driver.findElement(WishListMsg);
    }

    public void clickWishListBtn() {
        driver.findElement(wishListBtn).click();
    }

    public int countProducts() {
        return driver.findElements(productList).size();
    }
}


