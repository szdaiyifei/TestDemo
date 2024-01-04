package org.example;

import java.util.Arrays;

public class DataGroup {
    public static void main(String[] args) {
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = "hello world";
        }
//
//        for(String s:str){
//            System.out.println(s);
//        }

        System.out.println(Arrays.toString(str));
    }

}
