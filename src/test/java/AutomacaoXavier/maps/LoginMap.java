package AutomacaoXavier.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {


    @FindBy (xpath = "//*[@id=\"login-form-submit\"]")
    public WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"login-form-username\"]")
    public WebElement inpUserName;
    @FindBy(xpath = "//*[@id=\"login-form-password\"]")
    public WebElement inpPassword;

   @FindBy(xpath = "//*[@id=\"summary-val\"]")
   public WebElement textLogado;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div[1]/p")
    public WebElement textErroLogin;

}
