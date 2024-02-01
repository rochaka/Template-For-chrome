package Setup_The_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class loging_data {
    @Test
    public void loging() throws InterruptedException, IOException {
        String filePath = "Username_password"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();


        driver.findElement(By.id("username")).sendKeys(userData.get(0));
        driver.findElement(By.id("pass")).sendKeys(userData.get(1));
        Thread.sleep(1000);


        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/div/form/div[4]/button"));
        submitButton.click();
    }

    public void loging_data() {
    }
}
