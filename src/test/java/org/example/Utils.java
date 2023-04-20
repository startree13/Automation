package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Utils {
    // Waits for an element to load for a specified period of time.
    public static void waitForElementToLoad(int timeUnit) {
        try { TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Scrolls into view and waits for element to lad.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);
    }

   // Select dropdown = new Select(driver.findElement(By.xpath("xpath"))); //xpath "se baga copy paste"
   // dropdown.selectByIndex(6); // aici 6 reprezinta luna iunie, vezi nr index din lista dropdown
}
