package AutomacaoXavier.pages;


import AutomacaoXavier.core.Driver;
import AutomacaoXavier.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void  clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void setInpUserName(String userName) {
        if (userName != null) {
            loginMap.inpUserName.sendKeys(userName);
        }
    }

    public void setInpPassword(String password){
        if (password != null){
                loginMap.inpPassword.sendKeys(password);


            }
        }
    public String getUsuariologado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public void clickbtnAvancado(){
        loginMap.btnAvancado.click();
    }
    public void clicklinkIrJira(){
        loginMap.linkIrJira.click();
    }

    }


