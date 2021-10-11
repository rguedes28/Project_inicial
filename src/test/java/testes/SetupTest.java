package testes;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.Browser;
import utils.Utils;


import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{
    @Test
    public void testOpenBrowserAndLoadPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrirmos o navegador e carregamos a url!");
    }

    @Test
    public void testLogin() {

        //Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtLogin();
        System.out.println("Clicou em Sign In e Direcionou Para a Pagina De Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Prencheu o email");
        login.fillPasswd();
        System.out.println(" Prencheu a Senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no Site");

        /*  Browser.getCurrentDriver().findElement(By.className("login")).click();
        System.out.println("Clicou em Sign In e Direcionou Para a Pagina De Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("rafaelpguedes@gmail.com");
        System.out.println("Prencheu o email");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("reset28");
        System.out.println(" Prencheu a Senha");
        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("Clicou em Sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no Site");*/

    }




}
