package pageObjects;

import elementMapper.ModelCheckOutPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ModelCheckOutPage extends ModelCheckOutPageElementMapper {

    public ModelCheckOutPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);}

    public void clickProsToCheckOut(){ btnModelProcessedToChkOut.click(); }

    }







