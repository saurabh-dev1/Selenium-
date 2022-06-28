import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\web driver\\chromedriver.exe");

    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/railways/");
        String curl = driver.getCurrentUrl();
        System.out.println("URL is --> "+ curl);

        //Title
        String title = driver.getTitle();
        System.out.println("tittle of the page is-->  "+title);
        Thread.sleep(2000);

        //From
        driver.findElement(By.xpath("(//label)[1]")).click();
        Thread.sleep(2000);

        //Input Delhi

        driver.findElement(By.xpath("//div/div/input")).sendKeys("DELHI");
        driver.findElement(By.xpath("(//span[text()='Delhi'])[1]")).click();

        driver.findElement(By.xpath("//span[.='To']")).click();

        //Input Lucknow
        driver.findElement(By.xpath("//div/input")).sendKeys("LUCKNOW");
        driver.findElement(By.xpath("(//span[.='Lucknow'])[1]")).click();

        //Date
        driver.findElement(By.xpath("(//label)[3]")).click();
        driver.findElement(By.xpath("(//div/div[.='20'])[1]")).click();
        driver.findElement(By.xpath("(//div/label)[4]")).click();
        // 3rd AC
        driver.findElement(By.xpath("//ul/li[.='Third AC']")).click();
        driver.findElement(By.xpath("//a[.='Search']")).click();


    }

}

