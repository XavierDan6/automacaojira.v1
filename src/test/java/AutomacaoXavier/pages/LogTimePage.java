package AutomacaoXavier.pages;

import AutomacaoXavier.core.Driver;
import AutomacaoXavier.maps.LogTimeMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogTimePage {
    LogTimeMap logTimeMap;

    public LogTimePage(){
        logTimeMap = new LogTimeMap();
        PageFactory.initElements(Driver.getDriver(), logTimeMap);

    }
    public String gettextLogTime(){
        Driver.visibilityOf(logTimeMap.textLogTime);
        return logTimeMap.textLogTime.getText();
    }

    public void InpDescription(String Description){
        logTimeMap.InpDescription.sendKeys(Description);
    }

    public void selectTipoLanc(String selectTipoLanc){
        Select select = new Select(logTimeMap.selectTipoLanc);
        select.selectByVisibleText(selectTipoLanc);
    }

    public void clickInpCheckPeriod(){
        logTimeMap.InpCheckPeriod.click();

    }

    public void InpDate(String InpDate){
        logTimeMap.InpDate.sendKeys(InpDate);
    }

    public void inpEndDate(String inpEndDate){
        logTimeMap.inpEndDate.sendKeys(inpEndDate);

    }

    public void inpFrom(String inpFrom){
        logTimeMap.inpFrom.sendKeys(inpFrom);
    }

    public void inpTo(String inpTo){
        logTimeMap.InpTo.sendKeys(inpTo);
    }

    public void clickBtnLogTime(){
        logTimeMap.btnLogTime.click();

    }

    public void clickBtnLogTime2(){
        logTimeMap.btnLogTime2.click();

    }






}
