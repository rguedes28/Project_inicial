package pageObjects;

import elementMapper.ProductBlousePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductBlousePage extends ProductBlousePageElementMapper {
    public ProductBlousePage(){PageFactory.initElements(Browser.getCurrentDriver(), this);}

    public void clickAddCArt(){
        btmaddcard.click();
    }

    public boolean isPageProduct(){ return getAuthereferceProduct().contains("Model demo_2");}

    public String getAuthereferceProduct(){ return subCatNameBlouse.getText(); }

}

