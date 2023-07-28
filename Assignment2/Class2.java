package Assignment2;

public class Class2 {
    public static void main(String[] args) throws InterruptedException {

        Class1 o= new Class1();
        o.di();
        o.launchBrowser("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        /*o.addRemoveElements();
        Thread.sleep(3000);
        //o.auth();
        //Thread.sleep(3000);
        o.checkboxes();
        Thread.sleep(3000);*/
        o.contextMenu();
        Thread.sleep(3000);
        /*o.abTesting();
        Thread.sleep(3000);
        o.dropdown();
        Thread.sleep(3000);
        //o.dragAndDrop();
        //Thread.sleep(3000);
        o.hover();
        Thread.sleep(10000);
        o.dynamicContent();
        Thread.sleep(3000);
        o.dynamicControls();
        Thread.sleep(3000);*/
    }
}
