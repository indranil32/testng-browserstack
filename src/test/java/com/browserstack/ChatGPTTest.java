package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class ChatGPTTest extends SeleniumTest {

  @Test
  public void testHomePage() {
    // navigate to the home page
    driver.get("https://8080-springproje-springpetcl-n727riuuaja.ws-us82.gitpod.io/");

    // assert that the page title is correct
    assertTrue(driver.getTitle().equals("PetClinic :: a Spring Framework demonstration"));
  }

  @Test
  public void testMenuLinks() {
    // navigate to the home page
    driver.get("https://8080-springproje-springpetcl-n727riuuaja.ws-us82.gitpod.io/");

    // assert that the Home, Find Owners, Veterinarians, and Error links are available
    assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
    assertTrue(driver.findElement(By.linkText("Find Owners")).isDisplayed());
    assertTrue(driver.findElement(By.linkText("Veterinarians")).isDisplayed());
    assertTrue(driver.findElement(By.linkText("Error")).isDisplayed());
  }

  @Test
  public void testFindOwners() {
    // navigate to the home page
    driver.get("https://8080-springproje-springpetcl-n727riuuaja.ws-us82.gitpod.io/");

    // click on the Find Owners link
    driver.findElement(By.linkText("Find Owners")).click();

    // assert that the Last Name input box, Find Owner button, and Add Owner button are available
    assertTrue(driver.findElement(By.id("lastName")).isDisplayed());
    assertTrue(driver.findElement(By.cssSelector("button[type='submit']")).isDisplayed());
    assertTrue(driver.findElement(By.linkText("Add Owner")).isDisplayed());
  }

  @Test
  public void testAddOwner1() {
    // navigate to the find owners page
    driver.get("https://8080-springproje-springpetcl-n727riuuaja.ws-us82.gitpod.io/owners/find");

    // click on the Add Owner button
    driver.findElement(By.linkText("Add Owner")).click();

    // assert that the First Name, Last Name, Address, City, Telephone input boxes and Add Owner button are available
    assertTrue(driver.findElement(By.id("firstName")).isDisplayed());
    assertTrue(driver.findElement(By.id("lastName")).isDisplayed());
    assertTrue(driver.findElement(By.id("address")).isDisplayed());
    assertTrue(driver.findElement(By.id("city")).isDisplayed());
    assertTrue(driver.findElement(By.id("telephone")).isDisplayed());
    assertTrue(driver.findElement(By.cssSelector("button[type='submit']")).isDisplayed());
  }
}
