/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author madhu
 */
public class NewtoursTest {

    private WebDriver driver;
    private String baseUrl;
    private String firstname;
    private String lastname;
    private String meal;
    private String cardtype;
    private String fname;
    private String lname;
    private String add;
    private String city;
    private String state;

    private String country;

    public NewtoursTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testNewtours() throws Exception {

        FileInputStream inputStream = new FileInputStream(new File("c:\\data\\newtours.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Row r = firstSheet.getRow(1);
        Cell c = r.getCell(0); //username value
        firstname = c.getStringCellValue();
        c = r.getCell(1); //username value
        lastname = c.getStringCellValue();
        c = r.getCell(2);
        meal = c.getStringCellValue();
        c = r.getCell(3);
        cardtype = c.getStringCellValue();
        c = r.getCell(4); //username value
        fname = c.getStringCellValue();
        c = r.getCell(5); //username value
        lname = c.getStringCellValue();
        c = r.getCell(6);
        add = c.getStringCellValue();
        c = r.getCell(7);
        state = c.getStringCellValue();
        c = r.getCell(8);
        country = c.getStringCellValue();
        
        System.out.println("firstname = " + firstname);
        System.out.println("lastname= " + lastname);
        System.out.println("meal =" + meal);
        System.out.println("cardtype = " + cardtype);
        System.out.println("fname= " + fname);
        System.out.println("lname= " + lname);
        System.out.println("add =" + add);
        System.out.println("state= " + state);
        System.out.println("country= " + country);

        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).click();
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("userName")).sendKeys(Keys.DOWN);
        driver.findElement(By.name("userName")).sendKeys(Keys.DOWN);
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.xpath("//div")).click();
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.xpath("//div")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("tripType")).click();
        driver.findElement(By.name("passCount")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Passengers:'])[1]/following::option[1]")).click();
        driver.findElement(By.name("fromPort")).click();
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Passengers:'])[1]/following::option[6]")).click();
        driver.findElement(By.name("fromDay")).click();
        new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("5");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='On:'])[1]/following::option[17]")).click();
        driver.findElement(By.name("toPort")).click();
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='On:'])[1]/following::option[46]")).click();
        driver.findElement(By.name("toDay")).click();
        new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("9");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Returning:'])[1]/following::option[21]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/preceding::input[2]")).click();
        driver.findElement(By.name("airline")).click();
        new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Airline:'])[1]/following::option[2]")).click();
        driver.findElement(By.name("findFlights")).click();
        driver.findElement(By.xpath("//div")).click();
        driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).click();
        driver.findElement(By.name("passFirst0")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input")).sendKeys(firstname);
        driver.findElement(By.name("passLast0")).click();
        driver.findElement(By.name("passLast0")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(lastname);
        driver.findElement(By.name("pass.0.meal")).click();
        new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select"))).selectByVisibleText(meal);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meal:'])[1]/following::option[10]")).click();
        driver.findElement(By.name("creditCard")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]/select")).click();
        driver.findElement(By.name("creditnumber")).click();
        driver.findElement(By.name("creditnumber")).clear();
        driver.findElement(By.name("creditnumber")).sendKeys("7890");
        driver.findElement(By.name("creditnumber")).clear();
        driver.findElement(By.name("creditnumber")).sendKeys("789076235");
        driver.findElement(By.name("cc_exp_dt_mn")).click();
        new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("12");
        driver.findElement(By.name("cc_exp_dt_mn")).click();
        driver.findElement(By.name("cc_exp_dt_yr")).click();
        new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2010");
        driver.findElement(By.name("cc_exp_dt_yr")).click();
        driver.findElement(By.name("cc_frst_name")).click();
        driver.findElement(By.name("cc_frst_name")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[1]/input")).sendKeys(fname);
        driver.findElement(By.name("cc_last_name")).click();
        driver.findElement(By.name("cc_last_name")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/input")).sendKeys(lname);
        driver.findElement(By.name("billAddress1")).click();
        driver.findElement(By.name("billAddress1")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(add);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::tbody[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='City:'])[1]/following::tr[1]")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/input[1]")).sendKeys(state);
        driver.findElement(By.name("billZip")).clear();
        driver.findElement(By.name("billZip")).sendKeys("7890");
        driver.findElement(By.name("billCountry")).click();
        new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[2]/select"))).selectByVisibleText(country);
        driver.findElement(By.name("billCountry")).click();
        driver.findElement(By.xpath("//div")).click();
        driver.findElement(By.name("buyFlights")).click();

        try {
            assertEquals("Your itinerary has been booked!", driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText());
        } catch (Error e) {
            fail(e.toString());
        }
        driver.close();

    }

}
