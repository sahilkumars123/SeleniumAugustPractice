package seleniumsessions;

import org.openqa.selenium.support.ui.*;

public class ExplicitWaitConcept {

    public static void main(String[] args) {


        //ExplicitWait:
        //1. WebDriverWait
        //2. FluentWait



        //WebDriverWait(C) --> FluentWait(C) --> Wait(I): until();
        //inherit from FW		//until(){}
        //No indv methods		//+other methods

        //exp wait:
        //not a global wait
        //will be applied for the specific element
        //un - 10 --> 5 = 5
        //pwd = 0 wait
        //logn = 0 wait
        //can be applied for non web elements: url, title, alerts
        //expectedconditions ---> various conditons

    }

}