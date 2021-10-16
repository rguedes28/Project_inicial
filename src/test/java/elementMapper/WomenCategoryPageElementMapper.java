package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategoryPageElementMapper {


   @FindBy(css = "a.subcategory-name")
    public WebElement subCatTop;

    @FindBy(className = "navigation_page")
    public WebElement womam_navegation_page;



}
