package mytests;

import org.testng.annotations.Test;

public class DependsOnAttribute {


    @Test(priority = 2)
    public void getLogin(){ // I > Url > login
        System.out.println("this is my login method");
        int a = 9/0;
        System.out.println("sahil");
    }

    @Test(dependsOnMethods = "getLogin", priority = 1)
    public void searchProduct(){ // I > url > Login > search
        System.out.println("this is my search method");
    }

    @Test(dependsOnMethods = "searchProduct", priority = 3)
    public void checkout(){// I > url > Login > search > Add to cart > Checkout
        System.out.println("this is my checkout method");
    }
}
