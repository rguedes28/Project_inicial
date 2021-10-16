package pageObjects;

import elementMapper.OrderConfirmationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderConfirmationPage extends OrderConfirmationPageElementMapper {
    public OrderConfirmationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isOrderConfirmationPage(){ return getOrderConfitmationAuthrnticPage().contains("Order confirmation");}

    public String getOrderConfitmationAuthrnticPage(){ return orderConfirmationAuthentic.getText();}

    public boolean isOrderCompleteTxtInPage(){ return getOrderCompleteText().contains("Your order on My Store is complete.");}

    public String getOrderCompleteText(){ return orderComplete.getText();}



}
