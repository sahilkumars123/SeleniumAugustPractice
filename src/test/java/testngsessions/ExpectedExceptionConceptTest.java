package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConceptTest {

    String name;



    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void searchTest() {
        System.out.println("searchTest");
        int i = 9/0;//AE

        ExpectedExceptionConceptTest obj = new ExpectedExceptionConceptTest();
        obj = null;
        obj.name = "Sahil"; //NPE
    }

}

//100 tcs -- NSE, STALEREFEXCEP,
//PASSED