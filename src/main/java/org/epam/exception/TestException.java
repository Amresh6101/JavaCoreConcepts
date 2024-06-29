package org.epam.exception;

public class TestException {
//    public static void main(String[] args) throws AgeExecption {
////        int age=6;
////        if(age >10){
////            System.out.println("Good");
////        }
////        else {
////            throw  new AgeExecption("Sorry not eligible");
////        }
//    }
public static void main(String[] args) {
    // with the help of try and catch we can  handled this thread.sleep
    // otherwise we have to use throws keyword
//    try{
//        Thread.sleep(100);
//    }
//    catch (Exception e){
//        System.out.println("Thread exception handled");
//    }
//    System.out.println("hello Amresh");


    try {
        throw  new AgeExecption("Age is invalid");
    }
    catch (AgeExecption exAge){
        System.out.println("Exception catched in catch block");
        System.out.println(exAge.getMessage());
    }
}
}
