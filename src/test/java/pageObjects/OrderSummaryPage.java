package pageObjects;

import elementMapper.OrderSummaryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderSummaryPage extends OrderSummaryPageElementMapper {
    public OrderSummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
   }

    public void clickFinalOrderShop(){ btnFinalOrder.click();}

    public boolean isOrderSummaryPage(){ return getAuthenticOrderSummaryPage().contains("Bank-wire payment");}

    public String getAuthenticOrderSummaryPage(){ return orderSummaryAuthentic.getText(); }




}
