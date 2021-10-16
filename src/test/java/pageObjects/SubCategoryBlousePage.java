package pageObjects;

import elementMapper.SubCategoryBlousePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SubCategoryBlousePage extends SubCategoryBlousePageElementMapper {
    public SubCategoryBlousePage(){PageFactory.initElements(Browser.getCurrentDriver(), this);}

    public void clickProductBlouse(){
       productBlouse.click();
    }

    public String getAuthenticationSubCatBlousePage(){ return subCatNameBlouse.getText();}

    public boolean isSubBlousePage(){
        return getAuthenticationSubCatBlousePage().contains("BLOUSES");
    }

}
