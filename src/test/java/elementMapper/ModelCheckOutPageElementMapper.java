package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelCheckOutPageElementMapper {

    @FindBy(xpath= "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement btnModelProcessedToChkOut;
}