package AutomacaoXavier.steps;

import AutomacaoXavier.core.Driver;
import AutomacaoXavier.enuns.Browser;
import AutomacaoXavier.pages.LoginPage;
import AutomacaoXavier.pages.PaginaDeSegurancaPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;
    String username;

    @Before
    public void iniciaNavegador() {
        new Driver(Browser.EDGE);
    }

    @Dado("que a pagina de seguranca esteja aberta")
    public void queAPaginaDeSegurancaEstejaAberta() {
        Driver.getDriver().get("https://corp-sw-jira/login.jsp?permissionViolation=true&os_destination=%2Fbrowse%2FSI-305&page_caps=&user_role=");
        //loginPage = new LoginPage;
       //loginPage.clicklinkIrJira();
    }
    @Entao("pagina de seguranca e exibida com sucesso")
    public void paginaDeSegurancaEExibidaComSucesso() {
        PaginaDeSegurancaPage paginaDeSegurancaPage = new PaginaDeSegurancaPage();
        Assert.assertEquals("Sua conexão não é particular", paginaDeSegurancaPage.gettextPgParticular());
        loginPage.clickbtnAvancado();
    }


    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) {
        username = map.get("login");
        String password = map.get("password");
        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);

    }

    @Quando("for realizado o clique no botao log In")
    public void forRealizadoOCliqueNoBotaoLogIn() {
        loginPage.clickBtnLogin();
    }

    @Então("sistema deve exibir mensagem de erro")
    public void sistemaDeveExibirMensagemDeErro() {
        throw new io.cucumber.java.PendingException();
    }

    @Então("sistema loga com sucesso")
    public void sistemaLogaComSucesso() {
        Assert.assertEquals(username, loginPage.getUsuariologado());

    }

}
