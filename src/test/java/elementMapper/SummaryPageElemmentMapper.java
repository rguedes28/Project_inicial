package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPageElemmentMapper {

    @FindBy(className = "navigation_page")
    public WebElement summaryAuthetc;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement btncontinuePrcCgkOut;


}
