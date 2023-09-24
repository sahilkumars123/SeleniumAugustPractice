package seleniumsessions;

public class MixingWait {

    public static void main(String[] args) {
//
//        Both IW and EW are having different implementation.
//        If element is found with IW, once it will reach at EW, it will try to wait as per EW also.
//
//        There is no gurantee EW will find the element super quick.
//        It's having its own process to wait for the element as per given expected conditions.
//
//        Both IW and EW having different process and implementation.

        //Avoid mixing them together.



        //imp wait = 10 secs -- for all the elements
        //webdriverwait = 15 secs -- for username

        //username :
        //imp:       10 secs ---> 2 secs --> 2 secs
        //WDWait:    15 secs ---> 5 secs --> 5 secs
        //total: 2+5 = 7 secs

        //imp:       10 secs ---> 9 secs --> 9 secs
        //WDWait:    15 secs ---> 14 secs --> 14 secs
        //total: 9+14 = 23 secs

        //imp:       10 secs ---> 10 secs --> 10 secs
        //WDWait:    15 secs ---> 14 secs --> 14 secs
        //total: 10+14 = 24 secs


        //imp:       10 secs ---> 10 secs --> 10 secs
        //WDWait:    15 secs ---> 15 secs --> 15 secs
        //total: 10+15 = 25 secs

        //imp:       10 secs ---> 9 secs --> 9 secs
        //WDWait:    15 secs ---> 1 secs --> 1 secs
        //total: 9+1 = 10 secs



    }

}