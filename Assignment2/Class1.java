package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Class1 {

    WebDriver driver;

    public void di() {
        driver = new ChromeDriver();
    }

    public void launchBrowser(String url) {
        String a = url;
        driver.get(a);
    }

    public void addRemoveElements() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        Thread.sleep(2000);
        driver.navigate().back();

    }

    public void auth() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
        /*driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.name("Sign in")).click();*/
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void checkboxes() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        Thread.sleep(2000);
        WebElement e= driver.findElement(By.xpath("//div[@class='example']//child::input[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(e);
        actions.perform();
        driver.findElement(By.xpath("//div[@class='example']//child::input[1]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void contextMenu() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
        WebElement e=driver.findElement(By.id("hot-spot"));
        Actions actions= new Actions(driver);
        actions.contextClick(e).build().perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).keyDown(Keys.ALT).sendKeys(Keys.ARROW_LEFT).build().perform();
        driver.navigate().back();
    }

    public void abTesting() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/abtest']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void dropdown() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Thread.sleep(2000);
        WebElement ddown=driver.findElement(By.id("dropdown"));
        Select select= new Select(ddown);
        select.selectByValue("1");
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void dragAndDrop() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/drag_and_drop']")).click();
        WebElement drag= driver.findElement(By.id("column-a"));
        WebElement drop= driver.findElement(By.id("column-b"));
        Actions actions= new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDrop(drag,drop).perform();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void hover() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/hovers']")).click();
        WebElement element= driver.findElement(By.xpath("//div[@class='example']/child::div[1]"));
        Actions actions= new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(element).build().perform();
        Thread.sleep(5000);
        driver.navigate().back();
    }

    public void dynamicContent() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/dynamic_content']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    public void dynamicControls() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}
