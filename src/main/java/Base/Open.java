package Base;

import org.openqa.selenium.WebDriver;

public class Open extends DriverInit {

    WebDriver driver;

    public Open(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }
}
