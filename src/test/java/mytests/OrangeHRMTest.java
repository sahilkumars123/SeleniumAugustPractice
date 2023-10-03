package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

    @Test(priority = 1)
    public void TitleTest() {
        //driver.get("http://opencart.com");
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    @Test(priority = 2)
    public void URLTest() {
        Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));
    }

}