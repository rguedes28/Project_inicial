package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentPageElementMapper {
    public PaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickpaymentBtn() { paymentBtn.click();}

    public boolean isPaymentPage(){ return getAuthenticPaymentPAge().contains("Your payment method");}

    public String getAuthenticPaymentPAge(){ return paymentAuthentic.getText();}



}
