package SeleniumBcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class selebas
{
    @Test
    public void launchBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        String h;
        h=driver.getTitle();
        System.out.println(h);
        driver.close();
    }
}
