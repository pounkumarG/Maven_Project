package com.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Exa {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pounkumar G\\eclipse-workspace\\Maven_Project\\driver\\chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
			WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
			user.sendKeys("pounkumarg21");

			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("Poun@12345");

			WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
			login.click();

			WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
			Select s = new Select(location);
			s.selectByValue("Melbourne");

			WebElement selecthotel= driver.findElement(By.xpath("//select[@name='hotels']"));
			Select s1 = new Select(selecthotel);
			s1.selectByIndex(2);

			WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
			Select s2 = new Select(roomtype);
			s2.selectByVisibleText("Double");

			Thread.sleep(2000);
			WebElement noofroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
			Select s3 = new Select(noofroom);
			s3.selectByIndex(3);
			Thread.sleep(2000);

			WebElement datein = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			datein.sendKeys("");

			WebElement dateout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			dateout.sendKeys("");

			WebElement adult= driver.findElement(By.xpath("//select[@name='adult_room']"));
			Select s4 = new Select(adult);
			s4.selectByIndex(2);

			WebElement child = driver.findElement(By.id("child_room"));
			Select s5 = new Select(child);
			s5.selectByIndex(1);

			WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
			search.click();

			WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
			radio.click();

			WebElement continu= driver.findElement(By.xpath("//input[@name='continue']"));
			continu.click();

			WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
			name.sendKeys("pounkumar");

			WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
			lname.sendKeys("kumar");

			WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
			address.sendKeys("1,lknger,rkstreet");

			driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("1234567891234567");

			WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
			Select s6 = new Select(cardtype);
			s6.selectByValue("VISA");

			WebElement month = driver.findElement(By.id("cc_exp_month"));
			Select s7 = new Select(month);
			s7.selectByIndex(2);

			WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
			Select s8 =new Select(year);
			s8.selectByVisibleText("2012");

			WebElement cvvno = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
			cvvno.sendKeys("2345");

			WebElement booknow= driver.findElement(By.id("book_now"));
			booknow.click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();

			driver.findElement(By.id("logout")).click();

			Navigation navi= driver.navigate();
			navi.back();
			Thread.sleep(3000);
			driver.close();

			}

}
	


