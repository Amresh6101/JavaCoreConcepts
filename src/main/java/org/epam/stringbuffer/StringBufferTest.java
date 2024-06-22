package org.epam.stringbuffer;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default- 16 hota hai
        // after reaching to 16 new size will be  (16*2)+2 =34
        // remember it
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb);

    }
}
