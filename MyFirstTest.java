
package com.tester;
        import org.junit.Assert;
        import org.junit.Test;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertTrue;

public class MyFirstTest {
@Test
    public void startWebDriver(){
    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://seleniumsimplified.com");
    assertTrue("title should start with Selenium Simplified", driver.getTitle().startsWith("Selenium Simplified"));
driver.close();
    driver.quit();
}}
