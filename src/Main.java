
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

    
    public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.booking.com/");
        driver.manage().window().maximize();
        
        WebElement searchField = driver.findElement(By.id("ss"));
        searchField.click();
        searchField.sendKeys("Belgrade");
        
        WebElement searchBox = driver.findElement(By.className("xp__button"));
        searchBox.click();
        
        WebElement checkInDateButton = driver.findElement(By.className("c2-day-s-today"));
        checkInDateButton.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        WebElement checkOutDate = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[1]"));
        checkOutDate.click();
        
        WebElement selectCheckOutDate = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]/span"));
        selectCheckOutDate.click();
        
        WebElement groupAdults = driver.findElement(By.id("group_adults"));
        groupAdults.click();
        
        Select numberOffAdults = new Select (driver.findElement(By.id("group_adults")));
        numberOffAdults.selectByValue("8");
        
        WebElement numberOffChildren = driver.findElement(By.id("group_children"));
        numberOffChildren.click();
        
        Select numberOffChildren1 = new Select(driver.findElement(By.id("group_children")));
        numberOffChildren1.selectByValue("2");
        
        WebElement childrenAge1 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div[1]/div/select"));
        childrenAge1.click();
        
        Select childrenAgeS1 = new Select(driver.findElement(By.xpath("//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div[1]/div/select")));
        childrenAgeS1.selectByValue("12");
        
        WebElement childrenAge2 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div[2]/div/select"));
        childrenAge2.click();
        
        Select childrenAgeS2 = new Select(driver.findElement(By.xpath("//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div[2]/div/select")));
        childrenAgeS2.selectByValue("12");
        
        WebElement noRooms = driver.findElement(By.id("no_rooms"));
        noRooms.click();
        
        Select noRooms1 = new Select(driver.findElement(By.xpath("//*[@id=\"no_rooms\"]")));
        noRooms1.selectByValue("4");
        
        WebElement searchButton = driver.findElement(By.className("sb-searchbox__button  "));
        searchButton.click();
        
        
        
        
        
        
        
        
        
         
         
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
