package auto.pages;

import auto.utility.Services;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static org.apache.logging.log4j.LogManager.getLogger;

public class BasicAuthPage {
    private static Logger logger = getLogger(BasicAuthPage.class);
    Services services;

//    <a href="javascript:;" title="Hello, Login" class="userlink"></a>

    public static final String HEADING = "Hello, Login";
    String xpathHeading = "//a[@class='userlink']";

    public BasicAuthPage(WebDriver driver) {
        this.services = new Services(driver);
    }

    public String getHeading() {
        String heading = services.getText(xpathHeading);
        logger.info("Heading: " + heading);
        return heading;
    }
}
