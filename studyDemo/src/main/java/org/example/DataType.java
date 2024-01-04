package org.example;

public class DataType {
    public static void main(String[] args) {

        String str = "hello world";
        str.substring(0,3);//产生了新的字符串，原字符串对象不可变
        String s = str.substring(0,3);
        System.out.println(str);
        System.out.println(s);

        String all =String.join(",", "hello", "world");
        System.out.println(all);
    }

}
