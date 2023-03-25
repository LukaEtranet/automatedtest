import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main (String[] args) {
        //Invoking browser
        //Chrome - ChromeDriver exten -> Methods close get
        //safari SaariDrier -> methods close get
        // WebDriver close get
        //WebDriver methods + class methhods
        //chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        //webdriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.omnistore.kdev.billy.hr");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());




    }
}
