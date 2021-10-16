package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingfPageElemmentMapper {

    public WebElement cgv;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    public WebElement btnprocessfinali;

    @FindBy(className = "navigation_page")
    public WebElement shipPageAuhtentic;



    }
