package pageObjects;

import elementMapper.WomenCategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class WomenCategoryPage extends WomenCategoryPageElementMapper {

    public WomenCategoryPage(){PageFactory.initElements(Browser.getCurrentDriver(), this);}


    public String getTextNameCat(){ return womam_navegation_page.getText(); }

    public boolean isPageWomen(){ return getTextNameCat().equals("Women");}

    public void clickTopWoman(){ subCatTop.click();}
}

