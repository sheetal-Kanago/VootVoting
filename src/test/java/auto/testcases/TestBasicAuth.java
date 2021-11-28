package auto.testcases;

import auto.pages.BasicAuthPage;
import auto.utility.Init;
import org.testng.annotations.Test;

import static auto.pages.BasicAuthPage.HEADING;
import static org.testng.Assert.assertEquals;

public class TestBasicAuth extends Init {

    @Test
    public void testBasicAuth() throws InterruptedException {
        driver.get("https://www.moneycontrol.com/");

        BasicAuthPage basicAuthPage = new BasicAuthPage(driver);
        String actual = basicAuthPage.getHeading();
        assertEquals(actual, HEADING);
    }
}
