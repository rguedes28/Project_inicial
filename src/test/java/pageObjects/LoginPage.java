package pageObjects;

import elementMapper.LoginElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("rafaelpguedes@gmail.com");
    }
    public void fillPasswd(){
        passwd.sendKeys("reset28");
    }
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }
}
