package org.epam.string;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        String str1="amresh";
        String str2="amresh";
        String str3= new String("amresh");
        String str4=new String("amresh");
        System.out.println(str1==str2); // both pointing to the same memory location
        System.out.println(str3==str4); // two different objects

        String s="Learn Share learn";
        System.out.println(s.indexOf("learn"));
        System.out.println(s.indexOf("ea",5));
        System.out.println(s.indexOf("rs",2));

        String s1="amreshranjan";
        System.out.println(s1.startsWith("amre"));
        System.out.println(s1.endsWith("n"));
        String s2=s1.trim();
        String s3=s2.replace("a","#");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.length());

        char[] s4=s3.toCharArray();
        System.out.println(s4);
        // String to intger

        String num1="23456";
        int num2=Integer.valueOf(num1);
        System.out.println(num2+4);


    }
}
