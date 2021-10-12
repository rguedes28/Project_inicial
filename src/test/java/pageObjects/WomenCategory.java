package pageObjects;

import elementMapper.WomenCategoryElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class WomenCategory extends WomenCategoryElementMapper {

    public WomenCategory(){PageFactory.initElements(Browser.getCurrentDriver(), this);}


    public String getTextNameCat(){ return subCatTop.getText(); }

    public void clickTopWoman(){ subCatTop.click();}
}

