package robos;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GaiaRobo {

    private ChromeDriver roboDriver;

    public void abrirChrome() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        roboDriver = new ChromeDriver(option);
    }

    public void acessarSite() {
        roboDriver.get("http://www.juliodelima.com.br/taskit/");
    }

    public void fazerLogin() {

    }


}
