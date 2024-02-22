package com.misc;

import java.util.HashMap;

public class pointers {


    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        /* HashMap expect two args, in this case im passing a string and an integer*/
        HashMap<String, Integer> map2 = new HashMap<>();
        /* The hashmap has methods similar to http protocol, Get,Put,Replace,Remove  */


        map1.put("va", 1);
        map2 = map1;


        map1.put("va", 3);


        System.out.println(map1 + " " + map2);
    }
}
