package stepDefinition;

import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.RenderingHints.Key;

import java.awt.Window;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.CharMatcher;
import com.mongodb.assertions.Assertions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.bys.builder.ByChained;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import static java.time.Duration.ofMillis;

public class Steps {

    public static WebDriver driver; // = new ChromeDriver();
    static Properties prop = new Properties();
    public static String ExcelFilepath;
    public static String APIUsage;
    public static String otp;

    //API  Functions  Example 1
    public static String Token_path;
    public static String Url_path;
    public static String BASE_URL;
    public static String User_name_contact;
    public static String User_Email_contact;
    public static String User_Phone_contact;
    public static String parentWindow;

    private Response response;
    public static boolean All_the_flags;
    public static String Book_name;
    public static int Book_price;
    public static String Book_category;
    public static int Book_Inventory;
    public static int Book_discount;
    public static String Book_weight;
    public static String Book_color;
    public static String Book_manufacture;
    public static String Book_moreAtr;
    public static Connection conn;
    public static Connection list;


    @Given("^I login to the app with manager$")
    public void i_login_to_the_app() throws Throwable {

        try {

            // Open the config file to read and use data
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream("config/Configuration.properties");
            prop.load(input);

            String Web_Page = prop.getProperty("Web_page");
            String User1 = prop.getProperty("User1");
            String Pass = prop.getProperty("Pass");

            //  Open the saucedemo.com site

            driver.get(Web_Page);
            Thread.sleep(2000);
            driver.navigate().refresh();

            // Do login - insert the values to the fields on Site
            // Enter User Name
            WebDriverWait wait = new WebDriverWait(driver,  30);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("user-name")));
            driver.findElement(By.id("user-name")).sendKeys(User1);
            System.out.println("User Enter UserName");

            // Enter Password
            driver.findElement(By.id("password")).sendKeys(Pass);
            System.out.println("User Enter Password");
            Thread.sleep(Integer.parseInt("3000"));
            // Press login Button
            driver.findElement(By.id("login-button")).click();
            System.out.println("User press the login button");
            Thread.sleep(Integer.parseInt("3000"));
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Given("^I have a new product with \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\" And \"(.*?)\"$")
    public void I_have_a_new_product_with(String name, int price, String category, int Inventory, int discount, String weight, String color, String manufacture, String moreAtr) throws Throwable {

        Book_name = name;
        Book_price = price;
        Book_category = category;
        Book_Inventory = Inventory;
        Book_discount = discount;
        Book_weight = weight;
        Book_color = color;
        Book_manufacture = manufacture;
        Book_moreAtr = moreAtr;

        if (Book_name == null || Book_price == 0 || Book_category == null || Book_Inventory == 0 || Book_discount == 0 || Book_price == 0 || Book_weight == null || Book_color == null || Book_manufacture == null || Book_moreAtr == null) {
            Assert.fail("Query result is null.");
            All_the_flags = false;
        } else {
            All_the_flags = true;
        }
        System.out.println("After Validating all values");
    }


    @And("^I check if the product exists through API Jsonfile \"(.*?)\" if not than create \"(.*?)\"$")
    public void I_check_if_the_product_exists_through_API_if_not_than_create(String jsonFile, String Bookname) throws Throwable {

        String API_URL = BASE_URL;
        String validRequest = new String(Files.readAllBytes(Paths.get("src/main/resources/config/DataForAPI_Tests/" + jsonFile)));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(validRequest).post(API_URL);

        if (response.statusCode() == 200) {
            All_the_flags = true;

            //  If we didnt find the product with API get then we need to create it as a new product:
        } else {

            BASE_URL = BASE_URL;

            validRequest = "{\n    \"Book name\": \"" + Bookname + "\",\n}";

            RestAssured.baseURI = BASE_URL;
            //RequestSpecification request = RestAssured.given();

            request.header("Content-Type", "application/json");
            request.header("X-DEVICE-ID", "d43fb20f94706af793613cac923d4d85");

            response = request.body(validRequest).post(BASE_URL);
            System.out.println(response.statusCode());


        }
        System.out.println("After product detaill validation");
    }


    @And("^I verify the product exists in database \"(.*?)\"$")
    public void get_string_from_query(String sqlinput) throws Throwable {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoDemo", "root", "Garaso11");
        //List<String[]> getStringListFromQuery(String sql, boolean allowNull) throws Exception {
        List<String[]> list = new ArrayList<String[]>();
        ResultSet rs = null;
        Statement statement = null;
        String str = null;
        int elapsedTimeInSec = 0;
        boolean allowNull = true;

        // report.report("connected");
        if (conn.isClosed() == false) {
            //report.report("connection is closed");


            outerloop:
            while (elapsedTimeInSec < 60) {
                statement = conn.createStatement();
                rs = statement.executeQuery(sqlinput);

                ResultSetMetaData rsmd = rs.getMetaData();
                int columns = rsmd.getColumnCount();

                while (rs.next()) {

                    String[] strArr = new String[columns];
                    for (int i = 1; i <= columns; i++) {
                        strArr[i - 1] = rs.getString(i);
                        System.out.println("The response is:" + strArr[i - 1]);
                    }
                    list.add(strArr);
                }
                if (list.size() == 0) {
                    elapsedTimeInSec++;
                    Thread.sleep(1000);
                    list = null;
                    break outerloop;

                } else {
                    break outerloop;
                }
            }

            conn.close();


            if (rs == null && allowNull == false) {
                Assert.fail("Query result is null. Query was: " + sqlinput);
            } else if (rs == null && allowNull == true) {
                conn.close();
                statement.close();

            }


            if (statement != null) {
                All_the_flags = true;
                statement.close();
            } else {
                All_the_flags = false;
            }
        }
        conn.close();
        System.out.println("After DB Validation");
    }


    @And("^I check the product details via API \"(.*?)\"$")
    public void check_product_ifnot_then_create(String jsonFile, String Endpoint) throws IOException {
        String API_URL = Endpoint;
        String validRequest = new String(Files.readAllBytes(Paths.get("src/main/resources/config/DataForAPI_Tests/" + jsonFile)));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(validRequest).post(API_URL);

        if (response.statusCode() == 200) {
            All_the_flags = true;
        }
        System.out.println("After product detaill validation");
    }

    @And("^the product should be created successfully$")
    public void the_product_should_be_created_successfully() throws IOException {
        // if (All_the_flags) {
        assertEquals("Error: The product has not created.", All_the_flags);
        System.out.println("After All validation");
        //  }

        System.out.println("After All validation");
    }

    // XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Given("^I have an active order$")
    public void I_have_an_active_order() throws IOException {

        // User Create order by adding items to the order
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("add-to-cart-sauce-labs-backpack")));
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        System.out.println("User create order");
    }

        @Given("^I process the order$")
        public void I_process_the_order() throws IOException {


            // Open the config file to read and use data
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream("config/Configuration.properties");
            prop.load(input);

            String First_Name = prop.getProperty("User1_First_Name");
            String Last_Name = prop.getProperty("User1_Last_Name");
            String Zip = prop.getProperty("User1_Zip");


            // User press the cart item to process his order
            driver.findElement(By.id("#shopping_cart_container > a")).click();
            System.out.println("User press the cart symbol");
            //Thread.sleep(Integer.parseInt("3000"));

            // User press checkout Button
            driver.findElement(By.id("checkout")).click();
            System.out.println("User press the checkout button");
            // Thread.sleep(Integer.parseInt("3000"));

            // User Enter his First Name
            WebDriverWait wait = new WebDriverWait(driver,  30);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("first-name")));
            driver.findElement(By.id("first-name")).sendKeys(First_Name);
            System.out.println("User Enter First Name");

            // User Enter his Last Name
            driver.findElement(By.id("last-name")).sendKeys(Last_Name);
            System.out.println("User Enter Last Name");

            // User Enter his Zip code
            driver.findElement(By.id("postal-code")).sendKeys(Zip);
            System.out.println("User Enter ZIP Code");

            //User press the Continue button
            driver.findElement(By.id("continue")).click();
            System.out.println("User press the continue button");

            // Validate Checkout page
            String heading_text = driver.findElement(By.id("#header_container > div.header_secondary_container > span")).getText();
            //String heading_text = driver.findElement(By.xpath(input)).getAttribute("value");
            System.out.println("Validating A value on the page:    " + heading_text + " ");

            if (!heading_text.equals("Checkout: Overview")) {
                throw new IllegalStateException("The validation has failed");
            }

            //User press the Finish button
            driver.findElement(By.id("finish")).click();
            System.out.println("User press the finish button");

           // Validate CheckOut complete page
            heading_text="";
            heading_text = driver.findElement(By.id("#header_container > div.header_secondary_container > span")).getText();
            //String heading_text = driver.findElement(By.xpath(input)).getAttribute("value");
            System.out.println("Validating A value on the page:    " + heading_text + " ");

            if (!heading_text.equals("Checkout: Complete!")) {
                throw new IllegalStateException("The validation has failed");
            }


            input.close();

        }
    @And("^I logout from the system$")
    public void I_logout_from_the_system() throws IOException {

        //User press the Menu button
        driver.findElement(By.id("react-burger-menu-btn")).click();
        System.out.println("User press the menu button");

        //User press the Logout button
        driver.findElement(By.id("logout_sidebar_link")).click();
        System.out.println("User press the Logout button");

    }
    }



