package pageObjects;

import elementMapper.SummaryPageElemmentMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SummaryPage extends SummaryPageElemmentMapper {
    public SummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this); }

    public boolean isSummaryPage(){ return getAuthenticSummaryShipping().contains("Your shopping cart");    }

    public String getAuthenticSummaryShipping(){ return summaryAuthetc.getText();

    }

    public void clickBtnContinueSummaryProcesed(){
        btncontinuePrcCgkOut.click();
    }



}
