package org.epam.exception;

public class Chaining {
    public static void m1() throws Throwable{
        try{
            int a=10/0;
        }catch (ArithmeticException ae){
           // ae.printStackTrace();
            throw ae.initCause(new NullPointerException("Divided by 0 lead to infinity"));
        }
    }
    public static void main(String[] args) {

       try {
           m1();
       }
       catch (Throwable t){
           System.out.println(t.getCause());
       }
    }

}

