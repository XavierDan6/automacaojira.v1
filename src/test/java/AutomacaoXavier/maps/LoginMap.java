package AutomacaoXavier.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {


    @FindBy (css = "*[name= 'os_username']")
    public WebElement btnLogin;
    @FindBy(css = "#login-form-submit")
    public WebElement inpUserName;
    @FindBy(css = "*[type= 'password']")
    public WebElement inpPassword;

    @FindBy(css = "//*[@id=\"summary-val\"]")
    public WebElement textLogado;

    @FindBy (css = "//*[@id=\"details-button\"]")
    public WebElement btnAvancado;
    @FindBy (css = "Ir para corp-sw-jira (não seguro)")
    public WebElement linkIrJira;

}
