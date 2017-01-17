package core;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
 
public class SignUp {
       public static void main(String[] args) throws InterruptedException {
              Logger logger = Logger.getLogger("");
              logger.setLevel(Level.OFF);
              System.setProperty("webdriver.gecko.driver", "./src/main/resources/browsers/gecko");
              String url = "http://alex.academy/exercises/signup/v1/";
             
              WebDriver driver = new FirefoxDriver();
              WebDriverWait wait = new WebDriverWait(driver, 10);
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              String text_case_id_01 = "TC-01.01.01";
      		  String text_case_id_02 = "TC-01.01.02";
      		  String text_case_id_03 = "TC-01.01.03";
      		  String text_case_id_04 = "TC-01.01.04";
      		  String text_case_id_05 = "TC-01.01.05";
      		  String text_case_id_06 = "TC-01.01.06";
      		  String text_case_id_99 = "TC-01.01.99";
      		  String text_case_id_100 = "TC-01.01.100";
      		  String text_case_id_101 = "TC-01.01.101";
      		  String text_case_id_102 = "TC-01.01.102";
      		 
              driver.get(url);
              String title_sign_up_expected = "Welcome to Sign Up v1";
              String error_fname_empty_expected = "Please enter First Name";
              String error_lname_empty_expected = "Please enter Last Name";
              String error_email_empty_expected = "Please enter Email Address";
              String error_phone_empty_expected = "Please enter Phone Number";
              
              String fname = "Irina";
      		  String lname = "Petrova";
      		  String email = "irinasun@gmail.com";
      		  String phone = "4295671212";
      		
      		  // TC-01.01.01

      		driver.get(url);
      		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      		String title_sign_up_actual = driver.getTitle();

      		if (title_sign_up_expected.equals(title_sign_up_actual)) {
      			System.out.println("Test Case ID: \t\t" + text_case_id_01
      					+ " - PASSED");
      			System.out.println("Title Expected/Actual: \t"
      					+ title_sign_up_expected + "/" + title_sign_up_actual);
      			System.out.println("=======================================");
      		} else {
      			System.out.println("Test Case ID: \t\t" + text_case_id_01
      					+ " - FAILED");
      			System.out.println("Title Expected/Actual: \t"
      					+ title_sign_up_expected + "/" + title_sign_up_actual);
      			System.out.println("=======================================");
      		}
      		
      		// TC-01.01.02
      		
      	        String application_title_expected = "Sign Up";
                String application_title_actual = driver.findElement(By.id("id_f_title")).getText();
      	        
                if (application_title_expected.equals(application_title_actual)) {
          			System.out.println("Test Case ID: \t\t" + text_case_id_02
          					+ " - PASSED");
          			System.out.println("Title Expected/Actual: \t"
          					+ application_title_expected + "/" + application_title_actual);
          			System.out.println("=======================================");
          		} else {
          			System.out.println("Test Case ID: \t\t" + text_case_id_02
          					+ " - FAILED");
          			System.out.println("Title Expected/Actual: \t"
          					+ application_title_expected + "/" + application_title_actual);
          			System.out.println("=======================================");
          		} 
      	        
               // TC-01.01.03 
                
                driver.findElement(By.id("id_quotes")).getText();
        		String quote = driver.findElement(By.id("id_quotes")).getText();
        		if (quote != null && quote.length() < 103 && quote.length() > 36) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_03
        					+ " - PASSED");
        			System.out.println("Quote length: " + quote.length());
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_03
        					+ " - FAILED");
        			System.out.println("Quote length: " + quote.length());
        			System.out.println("=======================================");
        		}
        		
        		// TC-01.01.04
        		
        		driver.findElement(By.id("id_current_location")).getText();
        		String location = driver.findElement(By.id("id_current_location")).getText();
        		if (location != null && location.length() < 103 && location.length() > 3) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_04
        					+ " - PASSED");
        			System.out.println("Location length: " + location.length());
        			System.out.println("Location is: " + location);
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_04
        					+ " - FAILED");
        			System.out.println("Location length: " + location.length());
        			System.out.println("=======================================");
        		}
        		
        		// TC-01.01.05
        		
        		String first_name_expected = "First Name";
        		String first_name_actual = driver.findElement(By.id("id_f_label_fn")).getText();

          		if (first_name_expected.equals(first_name_actual)) {
          			System.out.println("Test Case ID: \t\t" + text_case_id_05
          					+ " - PASSED");
          			System.out.println("First Name Label Expected/Actual: \t"
          					+ first_name_expected + "/" + first_name_actual);
          			System.out.println("=======================================");
          		} else {
          			System.out.println("Test Case ID: \t\t" + text_case_id_05
          					+ " - FAILED");
          			System.out.println("First Name Label/Actual: \t"
          					+ first_name_expected + "/" + first_name_actual);
          			System.out.println("=======================================");
          		}
          		
        		// TC-01.01.06
          		
          		String last_name_expected = "Last Name";
        		String last_name_actual = driver.findElement(By.id("id_f_label_ln")).getText();

          		if (last_name_expected.equals(last_name_actual)) {
          			System.out.println("Test Case ID: \t\t" + text_case_id_06
          					+ " - PASSED");
          			System.out.println("Last Name Label Expected/Actual: \t"
          					+ last_name_expected + "/" + last_name_actual);
          			System.out.println("=======================================");
          		} else {
          			System.out.println("Test Case ID: \t\t" + text_case_id_06
          					+ " - FAILED");
          			System.out.println("Last Name Label/Actual: \t"
          					+ last_name_expected + "/" + last_name_actual);
          			System.out.println("=======================================");
          		}
          		
        		// TC-01.01.99
          		
          		driver.findElement(By.id("id_submit_button")).click();
        		String error_fname_empty_actual = driver
        				.findElement(By.id("ErrorLine")).getText();

        		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_99
        					+ " - PASSED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_fname_empty_expected + "/"
        					+ error_fname_empty_actual);
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_99
        					+ " - FAILED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_fname_empty_expected + "/"
        					+ error_fname_empty_actual);
        			System.out.println("=======================================");
        		}
        		
        		// TC-01.01.100
        		
        		driver.findElement(By.id("id_fname")).sendKeys(fname);
        		
        		driver.findElement(By.id("id_submit_button")).click();
        		String error_lname_empty_actual = driver
        				.findElement(By.id("ErrorLine")).getText();

        		if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_100
        					+ " - PASSED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_lname_empty_expected + "/"
        					+ error_lname_empty_actual);
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_100
        					+ " - FAILED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_lname_empty_expected + "/"
        					+ error_lname_empty_actual);
        			System.out.println("=======================================");
        		}
        		
        			// TC-01.01.101
        		
        		driver.findElement(By.id("id_fname")).sendKeys(fname);
        		driver.findElement(By.id("id_lname")).sendKeys(lname);
        		
        		driver.findElement(By.id("id_submit_button")).click();
        		String error_email_empty_actual = driver
        				.findElement(By.id("ErrorLine")).getText();

        		if (error_email_empty_expected.equals(error_email_empty_actual)) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_101
        					+ " - PASSED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_email_empty_expected + "/"
        					+ error_email_empty_actual);
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_101
        					+ " - FAILED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_email_empty_expected + "/"
        					+ error_email_empty_actual);
        			System.out.println("=======================================");
        		}
        		
        		
        		// TC-01.01.102
        		
        		driver.findElement(By.id("id_fname")).sendKeys(fname);
        		driver.findElement(By.id("id_lname")).sendKeys(lname);
        		driver.findElement(By.id("id_email")).sendKeys(email);
        		
        		driver.findElement(By.id("id_submit_button")).click();
        		String error_phone_empty_actual = driver
        				.findElement(By.id("ErrorLine")).getText();

        		if (error_phone_empty_expected.equals(error_phone_empty_actual)) {
        			System.out.println("Test Case ID: \t\t" + text_case_id_102
        					+ " - PASSED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_phone_empty_expected + "/"
        					+ error_phone_empty_actual);
        			System.out.println("=======================================");
        		} else {
        			System.out.println("Test Case ID: \t\t" + text_case_id_102
        					+ " - FAILED");
        			System.out.println("Error Expected/Actual: \t"
        					+ error_phone_empty_expected + "/"
        					+ error_phone_empty_actual);
        			System.out.println("=======================================");
        		}
              }
       
       }

