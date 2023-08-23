package AutomacaoXavier.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogTimeMap {
    @FindBy(xpath = "//*[@id=\"summary-val\"]")
    public WebElement textLogTime;
    @FindBy(xpath = "//*[@id=\"tempoIssueViewPanel\"]/div[1]/span[2]/div/div/button[1]")
    public WebElement btnLogTime;

    @FindBy(xpath = "//*[@id=\"comment\"]")
    public WebElement InpDescription;

    @FindBy(xpath = "//*[@id=\"periodCheckbox\"]")
    public WebElement InpCheckPeriod;

    @FindBy(xpath = "//*[@id=\"started\"]")
    public WebElement InpDate;

    @FindBy(xpath = "//*[@id=\"endDate\"]")
    public WebElement inpEndDate;

    @FindBy(xpath = "//*[@id=\"from\"]")
    public WebElement inpFrom;

    @FindBy(xpath = "//*[@id=\"to\"]")
    public WebElement InpTo;

    @FindBy(xpath = "//*[@id=\"_TipoLançamento_\"]/div/div[2]/div/span")
    public WebElement selectTipoLanc;

    @FindBy(xpath = "//*[@id=\"tempo-global-dialog-bundled\"]/div/div/div[3]/div/div/div[2]/footer/div[2]/button[1]/span/span")
    public WebElement btnLogTime2;


}
