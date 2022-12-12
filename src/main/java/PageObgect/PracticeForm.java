package PageObgect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeForm{

    WebDriver driver;

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    private final By firstName = By.xpath("//input[@placeholder =\"First Name\"]");
    private final By lastName = By.xpath("//input[@placeholder =\"Last Name\"]");
    private final By email = By.xpath("//input[@placeholder =\"name@example.com\"]");
    private final By mobile = By.xpath("//input[@placeholder =\"Mobile Number\"]");
    private final By subject = By.xpath("//input[@id =\"subjectsInput\"]");
    private final By getSubject = By.xpath("//div[text()='English']");

    public void wait(By element){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
        waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public PracticeForm fillFirstName(){
        wait(firstName);
        driver.findElement(firstName).sendKeys("Vasyl");
        return this;
    }
    public PracticeForm fillLastName(){
        wait(lastName);
        driver.findElement(lastName).sendKeys("Vasyl");
        return this;
    }
    public PracticeForm fillEmail(){
        wait(email);
        driver.findElement(email).sendKeys("test@ts.ts");
        return this;
    }
    public PracticeForm fillMobile(){
        wait(mobile);
        driver.findElement(mobile).sendKeys("+380999999991");
        return this;
    }
    public PracticeForm fillSubject(){
        wait(subject);
        driver.findElement(subject).sendKeys("E");
        driver.findElement(subject).sendKeys(Keys.ENTER);
        return this;
    }

    public String getSubject() {
        return driver.findElement(getSubject).getText();
    }
}
