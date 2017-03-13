package classes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by USER on 19-Dec-16.
 */
public class DeviceHandler {
    String deviceName, platformVersion, plaformName, browserName;
    File app;

    public DeviceHandler(String deviceName, String platformVersion, String plaformName) {
        this.deviceName = deviceName;
        this.platformVersion = platformVersion;
        this.plaformName = plaformName;
}

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getPlaformName() {
        return plaformName;
    }

    public void setPlaformName(String plaformName) {
        this.plaformName = plaformName;
    }

    public File getApp() {
        return app;
    }

    public void setApp(File apk) {
        this.app = apk;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public AppiumDriver CreateDevice() throws Exception {
        AppiumDriver driver = null;

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", getDeviceName());
            capabilities.setCapability("platformVersion", getPlatformVersion());
            capabilities.setCapability("platformName", getPlaformName());

            if(getApp() != null)
                capabilities.setCapability("app", getApp().getAbsolutePath());
            if(getBrowserName() != null)
                capabilities.setCapability(CapabilityType.BROWSER_NAME, getBrowserName());

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            return driver;
        }catch(Exception ex){
            throw new Exception("Error creating device : " + ex.getMessage());
        }
    }

}
