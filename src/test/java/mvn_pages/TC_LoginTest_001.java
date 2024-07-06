package mvn_pages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
    
    @Test
    public void LoginTest() {
        driver.get(baseURL);
        LoginPage lp = new LoginPage(driver);
        lp.setUsername(username);
        lp.setPassword(password);
        lp.clickSubmit();
     
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Guru99 Bank Manager HomePage", "Login test failed!");
    }
}
