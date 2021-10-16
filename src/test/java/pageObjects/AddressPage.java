package pageObjects;

import elementMapper.AddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressPage extends AddressPageElementMapper {
    public AddressPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

   public void clickBtnProcessShip() {
       btnprocess.click();
   }

    public boolean isAddressPage(){ return getAthenticAddressPage().contains("Addresses");}

    public String getAthenticAddressPage(){ return addressAtheticPage.getText();}



}
