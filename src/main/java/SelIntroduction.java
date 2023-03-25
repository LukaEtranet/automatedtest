import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.apache.log4j.Level.INFO;


public class SelIntroduction {

    private static final Logger LOGGER = Logger.getLogger(SelIntroduction.class);
    public static void main (String[] args) {
        //Invoking browser
        //Chrome - ChromeDriver exten -> Methods close get
        //safari SaariDrier -> methods close get
        // WebDriver close get
        //WebDriver methods + class methhods
        //chromedriver.exe

        // !!! ne treba jer selenium iz mavena vec dolazi s chrome driverom !!!
//        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        //webdriver.chrome.driver -> value of path
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://app.omnistore.kdev.billy.hr");
        driver.getTitle();

        // Direktno printanje na standardni output je ok kao privremeno brzo rjesenje
        // ali dugorocno ne valja jer nije nimalo fleksibilno
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

        // Puno bolje je koristiti neki logger framework, koji ti omogucuje da
        // filtriras po log levelu, zapisujes u file ili saljes na neko udaljeno mjesto
        // i jos hrpa drugih lijepih stvari, i to sve samo promjenom konfiguracije,
        // bez mijenjanja koda.
        //
        // Slozio sam ti logging framework log4j i gore inicijalizirao konstantu LOGGER
        // To onda koristis ovako nekako:

        LOGGER.log(INFO, "Naslov stranice: " + driver.getTitle());
        LOGGER.log(INFO, "URL: " + driver.getCurrentUrl());



    }
}
