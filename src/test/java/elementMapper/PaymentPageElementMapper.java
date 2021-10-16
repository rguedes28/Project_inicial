package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageElementMapper {
    @FindBy(className = "bankwire")
    public WebElement paymentBtn;

    @FindBy(className = "navigation_page")
    public WebElement paymentAuthentic;

}
