package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {



    @Test(priority = -11)
    public void searchTest() {
        System.out.println("searchTest");
        Assert.assertEquals("Google", "Google");
    }

    @Test(priority = 0)
    public void sahilTest() {
        System.out.println("sahilTest");
        Assert.assertEquals("macbook", "macbook");
    }

    @Test()
    public void cartTest() {
        System.out.println("cartTest");
        Assert.assertEquals("macbook", "macbook");
    }


    @Test(priority = 3)
    public void orderTest() {
        System.out.println("orderTest");
        Assert.assertEquals(1000, 1000);
    }

//    @Test(priority = 30)
//    public void paymentTest() {
//        System.out.println("paymentTest");
//        Assert.assertEquals("300", "300");
//    }
//
//    @Test(priority = 31)
//    public void emailTest() {
//        System.out.println("emailTest");
//        Assert.assertEquals("email is sent", "email is sent");
//    }

}