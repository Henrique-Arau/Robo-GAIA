package robos;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GaiaRobo {

    private ChromeDriver roboDriver;

    public GaiaRobo() {
        //O que estiver aqui sera executado no new
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        roboDriver = new ChromeDriver(option);
    }

    public void acessarUmSiteChamado(String url) {

        roboDriver.get(url);
    }

    public String pegarOTituloDaPagina() {
        return roboDriver.getTitle();
    }
    public void fazerLogin(String login, String senha) {

    }

    public void lancarNota() {

    }


}
