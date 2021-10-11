package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper{

    public SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public String getTextNavigation_Page(){
        return navigation_page.getText();
    }

    public String getTextLighter(){
        return lighter.getText();
    }

    public String getTextHeading_Counter(){
        return heading_counter.getText();
    }

    public boolean isSearchPage(){
        return getTextNavigation_Page().equals("Search");
    }
}


