package TestsFracticeForm;

import Base.DriverInit;
import Base.Open;
import PageObgect.PracticeForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PracticeTest {

    WebDriver driver;

    @BeforeEach
    public void setUP() {
        driver = DriverInit.getDriver();
        new Open(driver).open();
    }

    @Test
    public void fieldForm() {
        new PracticeForm(driver)
                .fillFirstName()
                .fillLastName()
                .fillEmail()
                .fillMobile()
                .fillSubject();
        assertEquals(new PracticeForm(driver).getSubject(), "English");
    }

    @AfterEach
    public void closePage() {
        DriverInit.quit();
    }
}
