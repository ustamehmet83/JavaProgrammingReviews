package week19_14_01_2023.selenium_drivers;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecutor {
    @Override
    public void executeScript(String script) {
        System.out.println("I will execute that " + script);
    }

    @Override
    public void method2() {

    }

    @Override
    public void findElement() {
        System.out.println("Find the element by " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("Find the elements by " + getClass().getSimpleName());
    }

    @Override
    public String getScreenshots() {
        return "PNG";
    }

    @Override
    public void get(String url) {
        System.out.println("Open the "+ url+ " in "+ getClass().getSimpleName());
    }

    @Override
    public void close() {
        System.out.println("close the " + getClass().getSimpleName());

    }

    @Override
    public void quit() {
        System.out.println("quit the " + getClass().getSimpleName());
    }
}
