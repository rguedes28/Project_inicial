package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPageElementMapper {

    //botao para prosseguir
    @FindBy(xpath= "//*[@id=\"cart_navigation\"]/button")
    public WebElement btnFinalOrder;

    //confirmacao de pagina
    @FindBy(className = "navigation_page")
    public WebElement orderSummaryAuthentic;

}
