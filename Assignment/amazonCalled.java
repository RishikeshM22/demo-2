package Assignment;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class amazonCalled {

    WebDriver driver;
    public void wd(){
        driver = new EdgeDriver();

    }

    public void launchbrowser(String url){
        String a= url;
        driver.get(a);
    }

    public void addresschange(String Zc){
        String Zipcode= Zc;
        driver.findElement(By.id("glow-ingress-line2")).click();
        driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys(Zipcode);
        driver.findElement(By.xpath("//span[text()='Apply']")).click();
    }

    public void hamMenu(){
        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
        driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=508510&ref_=nav_em_cs_help_0_1_1_32']")).click();
    }

    public void search(String find){
        String sear= find;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(sear);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void homepage() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/ref=nav_logo']")).click();
        Thread.sleep(3000);
        driver.close();
    }


}
