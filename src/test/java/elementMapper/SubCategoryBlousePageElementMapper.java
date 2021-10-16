package elementMapper;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Browser.driver;

public class SubCategoryBlousePageElementMapper {

   @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
   public WebElement productBlouse;



    @FindBy(className = "cat-name")
    public WebElement subCatNameBlouse;



}
