package org.example.StringDemo;

import org.example.DataType;

import java.util.Arrays;

/**
 * @author 小火龙
 * @date 2023/12/14
 */
public class StringSecurity {

    public static void main(String[] args) {
        String username = "小火龙";
        String password = "123456";
        User user = new User(username, password);

        String[] modify = getUserModify(user);
        System.out.println(Arrays.toString(modify));

        modify[0] = "杰尼龟";
        modify[1] = "11234235";

        System.out.println(Arrays.toString(modify));

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());



    }


    public static String[] getUserModify(User user) {
        String[] modify = new String[2];
        modify[0] = user.getUsername();
        modify[1] = user.getPassword();
        return modify;
    }
}