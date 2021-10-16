package pageObjects;

import elementMapper.TopCategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class TopCategoryPage extends TopCategoryPageElementMapper {

    public TopCategoryPage(){PageFactory.initElements(Browser.getCurrentDriver(), this);
            }
    public void subblouseCatclick(){btnSubBlousesCat.click();}

    public boolean isTopPage(){ return getAuthenticTopPage().contains("TOPS");

    }

    public String getAuthenticTopPage(){ return topPage.getText();

    }





}
