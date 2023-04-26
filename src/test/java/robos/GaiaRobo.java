package robos;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GaiaRobo {

    public void abrirChrome() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver julioDriver = new ChromeDriver(option);


        julioDriver.get("http://www.juliodelima.com.br/taskit/");


    }


}
