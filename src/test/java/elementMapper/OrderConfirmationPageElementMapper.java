package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPageElementMapper {

    @FindBy(className = "navigation_page")
    public WebElement orderConfirmationAuthentic;

    @FindBy(css = "#center_column > div > p > strong")
    public WebElement orderComplete;

}
