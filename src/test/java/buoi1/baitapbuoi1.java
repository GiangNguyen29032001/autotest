
package buoi1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baitapbuoi1 {

    public static void main(String[] args) {

        // Buoc 1: Khoi tao trinh duyet Chrome
        WebDriver driver = new ChromeDriver();

        // Buoc 2: Phong to cua so Chrome
        driver.manage().window().maximize();

        // Buoc 3: Mo website
        driver.get("https://serenity-bdd.github.io/");

        // Buoc 4: In ra tieu de trang web
        System.out.println("Tieu de: " + driver.getTitle());

        // Buoc 5: Dong trinh duyet
        driver.quit();
    }
}

