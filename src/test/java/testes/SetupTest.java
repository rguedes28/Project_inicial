package testes;


import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
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

        home.clickBtSignIn();
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
        System.out.println("Validou My Account Page");
    }
   /* @Test
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
    }*/

    @Test
    public void testHomePage() {
            testLogin();

         HomePage home = new HomePage();
        System.out.println("Entrou na home");

        WomenCategoryPage women = new WomenCategoryPage();


        home.clickWomenCategory();
        System.out.println("clicou no botao Women");

        assertTrue(women.isPageWomen());
        System.out.println("Validou o link Women Page");

    }

   @Test
    public void testWomanCategry(){

        testHomePage();

        WomenCategoryPage wom = new WomenCategoryPage();

        TopCategoryPage top = new TopCategoryPage();

        wom.clickTopWoman();
        System.out.println("clicou na top cat");

        //assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?id_category=4&controller=category")));
        assertTrue(top.isTopPage());
        System.out.println("validou a pagina Top CAtegoria");
    }

    @Test
    public void testTopCategory() {

        testWomanCategry();

        TopCategoryPage top = new TopCategoryPage();

        SubCategoryBlousePage subBlouse = new SubCategoryBlousePage();
        top.subblouseCatclick();
        System.out.println("Clicou no botao blouse");

        assertTrue(subBlouse.isSubBlousePage());
        System.out.println("Validou o pagina SubBlouses");
    }

    @Test
    public void testSubBlousesCat(){
        testTopCategory();

        SubCategoryBlousePage subB = new SubCategoryBlousePage();

        ProductBlousePage prdctBlouse = new ProductBlousePage();

        subB.clickProductBlouse();
        System.out.println("Clicou em  blusa");

        assertTrue(prdctBlouse.isPageProduct());
        System.out.println("validou a Product page");
    }

    @Test
    public void testProductPage(){
        testSubBlousesCat();

        ProductBlousePage prdctBlouse = new ProductBlousePage();

        ModelCheckOutPage model = new ModelCheckOutPage();


        prdctBlouse.clickAddCArt();
        System.out.println("clicou no add cart");
    }

        @Test
        public void testmodelPage(){
            testProductPage();

            ModelCheckOutPage model = new ModelCheckOutPage();

            SummaryPage summary = new SummaryPage();

            model.clickProsToCheckOut();
            System.out.println("Clicou no botao process to chek out");

            assertTrue(summary.isSummaryPage());
            System.out.println("Validou a page summer");
        }

        @Test
        public void testSummaryPage(){
            testmodelPage();

            SummaryPage summary = new SummaryPage();

            AddressPage address = new AddressPage();

            summary.clickBtnContinueSummaryProcesed();
            System.out.println("clicou e seguiu o processo");

           assertTrue(address.isAddressPage());
           System.out.println("Validou address Page");
        }

        @Test
        public void testAddressPage(){
            testSummaryPage();

            AddressPage address = new AddressPage();

            ShippingfPage shipping = new ShippingfPage();

            address.clickBtnProcessShip();
            System.out.println("clicou process ship");

            assertTrue(shipping.isShipingPage());
            System.out.println("validou a ship page");
        }

        @Test
        public void testShippingPage(){
            testAddressPage();

            ShippingfPage shipping = new ShippingfPage();

            PaymentPage payment = new PaymentPage();

            shipping.clickContractBox();
            System.out.println("validou o contrato");

            shipping.clickBtnProcess();
            System.out.println("clicou em ir para pagamento");

            assertTrue(payment.isPaymentPage());
            System.out.println("validou a payment page");
        }

        @Test
        public void testPaymentPage(){
            testShippingPage();

            PaymentPage payment = new PaymentPage();

            OrderSummaryPage orderS = new OrderSummaryPage();

            payment.clickpaymentBtn();
            System.out.println("clicou no cofirme pagamento");

            assertTrue(orderS.isOrderSummaryPage());
            System.out.println("validou a order page");

        }
        @Test
        public void testOrderPage(){
            testPaymentPage();

            OrderSummaryPage orderS = new OrderSummaryPage();

            OrderConfirmationPage oConfirmation = new OrderConfirmationPage();

            orderS.clickFinalOrderShop();
            System.out.println("Clicou em confirmar bank order");

            assertTrue(oConfirmation.isOrderConfirmationPage());
            System.out.println("Validou a order confirmation page");


       }

       @Test
       public void testFluxoDeCompra(){
           testOrderPage();

           OrderConfirmationPage oConfirmation = new OrderConfirmationPage();

           assertTrue(oConfirmation.isOrderCompleteTxtInPage());
           System.out.println("Compra Finalizada com sucesso");

       }



}













