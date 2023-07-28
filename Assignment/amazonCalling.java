package Assignment;

import org.testng.annotations.Test;

@Test
public class amazonCalling {

    public static void main(String[] args) throws InterruptedException {

        amazonCalled ob= new amazonCalled();
        ob.wd();
        ob.launchbrowser("https://www.amazon.in/");
        Thread.sleep(3000);
        ob.addresschange("560006");
        Thread.sleep(3000);
        ob.hamMenu();
        Thread.sleep(3000);
        ob.search("iphone 13 pro 128gb");
        Thread.sleep(3000);
        ob.homepage();


    }
}
