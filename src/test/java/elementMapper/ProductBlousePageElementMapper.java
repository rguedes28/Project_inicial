package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductBlousePageElementMapper {

    @FindBy(css = "button.exclusive")
    public WebElement btmaddcard;

    @FindBy(id = "product_reference")
    public WebElement subCatNameBlouse;


}
