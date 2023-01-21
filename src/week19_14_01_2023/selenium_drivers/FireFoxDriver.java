package week19_14_01_2023.selenium_drivers;

public class FireFoxDriver extends RemoteWebDriver{

    @Override
    public String getScreenshots() {
        return "TIFF";
    }
}
