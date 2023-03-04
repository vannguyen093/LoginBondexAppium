package bondex.Mon;

import data.CustomerData;
import data.UserDataMapper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AlreadyLogin {

    AndroidDriver driver;
    WebDriverWait wait;
    CustomerData[] userData;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MemuPlay");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2");
        capabilities.setCapability("appPackage", "com.bondex.origin");
        capabilities.setCapability("appActivity", "com.bondex.origin.MainActivity");
        capabilities.setCapability("noReset", true);

        // Create a new AndroidDriver instance to connect to MemuPlay
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        userData = UserDataMapper.getUserData("D:\\01 - LEARN TESTER\\02 - AUTOMATION\\08 - Live Coding\\LoginBondex\\src\\test\\resources\\AlreadyLoginMon.json");
    }

    @Test
    public void AlreadyLogin() throws InterruptedException {
        for (CustomerData user : userData) {
            Thread.sleep(3000);
            System.out.println("Dang chay acc: " + user.getEmail());

            //Click Login button
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
            driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();

            //Nhap emil + password
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email')]")));
            driver.findElement(By.xpath("//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email')]")).sendKeys(user.getEmail());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password')]")));
            driver.findElement(By.xpath("//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password')]")).sendKeys(user.getPassword());


            //Click nut Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")));
            driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")).click();

            //Click nut Start
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")));
            driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();

            //Click nut Close
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")));
            driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")).click();

            //Click nut Setting
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")));
            driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")).click();

            //Click nut Logout
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Log out' or . = 'Log out')]")));
            driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Log out' or . = 'Log out')]")).click();

            //Click nut Yes
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Yes' or . = 'Yes')]")));
            driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Yes' or . = 'Yes')]")).click();
        }
    }
}
