import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelIntroduction {
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
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());




    }
}
