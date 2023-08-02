package AutomacaoXavier.pages;

import AutomacaoXavier.core.Driver;
import AutomacaoXavier.maps.PaginaDeSegurancaMap;
import org.openqa.selenium.support.PageFactory;

public class PaginaDeSegurancaPage {
    PaginaDeSegurancaMap paginaDeSegurancaMap;
    public PaginaDeSegurancaPage(){
        paginaDeSegurancaMap = new PaginaDeSegurancaMap();
        PageFactory.initElements(Driver.getDriver(), paginaDeSegurancaMap);
    }
    public String gettextPgParticular(){
        Driver.visibilityOf(paginaDeSegurancaMap.textPgParticular);
        return paginaDeSegurancaMap.textPgParticular.getText();
    }
}
