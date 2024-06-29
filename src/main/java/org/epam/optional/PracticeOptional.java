package org.epam.optional;

import java.util.Optional;

public class PracticeOptional {
    public static void main(String[] args) {
//        Optional<String> opt1=Optional.of(null);
//        System.out.println(opt1);
        // chance to get nullpointer Exception

        Optional<String> ot2 = Optional.ofNullable(null);
        //System.out.println(ot2.isPresent()); isPresent return true and false
        // ot2.ifPresent((str)-> System.out.println(str)); // return content if available otherwise it will return empty objects

        String str1 = ot2.orElse(null);
        System.out.println(str1);
        //  String str2=ot2.orElseThrow(()-> new RuntimeException("Hello error"));


    }
}
