package testes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.WomenCategory;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

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
    }
    @Test
    public void testSarch(){

        String quest = "T-SHIRT";
        String questResultQtd = "1";

        //iniciar paginas
        HomePage home = new HomePage();
        System.out.println("Entrou na home");

        SearchPage search = new SearchPage();
        System.out.println("buscando");

        home.doSearch("T-SHIRT");
        System.out.println("Entrou Em Search, Clicou o Btn e Buscou o Item");

        //validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_Counter(), CoreMatchers.containsString(questResultQtd));

    }

    @Test
    public void testWomanCategry() {

        HomePage home = new HomePage();
        System.out.println("Entrou na home");

        WomenCategory women = new WomenCategory();


        home.clickWomenCategory();
        System.out.println("clicou no botao");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?id_category=3&controller=category")));
        System.out.println("Validdou o link");

    }








}
