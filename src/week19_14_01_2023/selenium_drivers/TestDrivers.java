package week19_14_01_2023.selenium_drivers;

public class TestDrivers {


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");

        WebDriver driver1= new FireFoxDriver();
        driver1.get("https://google.com");

        ((TakeScreenShot)driver).getScreenshots();

        ((JavaScriptExecutor)driver).executeScript("Script");










    }
}
