package testes;

import utils.Browser;
import utils.Utils;
import org.junit.After;
import org.junit.Before;

public class BaseTests {
    @Before
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }
    @After
    public void tearDown(){
        Browser.close();

        }
    }

