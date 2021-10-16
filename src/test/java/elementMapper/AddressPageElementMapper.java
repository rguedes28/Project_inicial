package elementMapper;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageElementMapper {


    //botao para proceguir
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    public WebElement btnprocess;

    //Confirmacao de pagina
    @FindBy(className = "navigation_page")
    public WebElement addressAtheticPage;



}
