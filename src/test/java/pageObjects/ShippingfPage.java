package pageObjects;

import elementMapper.ShippingfPageElemmentMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingfPage extends ShippingfPageElemmentMapper {
    public ShippingfPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickContractBox(){ cgv.click();}

    public void clickBtnProcess(){ btnprocessfinali.click();}

    public boolean isShipingPage(){ return getAthenticShipPage().contains("Shipping");}

    public String getAthenticShipPage(){ return shipPageAuhtentic.getText();}



}
