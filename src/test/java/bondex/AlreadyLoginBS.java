package bondex;
import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class AlreadyLoginBS {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "lvnnguyn_hyX8wI");
        caps.setCapability("browserstack.key", "5MsZewMCTeeDWxfbYqGi");

        // Set URL of the application under test
        caps.setCapability("app", "bs://57f82a289ce574df7c7779cf83986b031a24c9e6");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy S22 Ultra");
        caps.setCapability("os_version", "12.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);

        // Write your test case statements here

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }
}
