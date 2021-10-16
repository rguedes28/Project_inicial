package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopCategoryPageElementMapper {

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    public WebElement btnSubBlousesCat;


    @FindBy(className = "cat-name")
    public WebElement topPage;

    }
