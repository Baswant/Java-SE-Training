package com.se.training.generics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by baswantdasari on 5/25/17.
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();//new Hashtable <String,String>();

        map.put("101", "Rama");
        map.put("102", "John");
        map.put("103", "Ron");

        System.out.println("Map Values" + map);
        System.out.println(" 101 value is "  +map.get("101"));

        Set<String> set = map.keySet();

        for(String key : set){
            System.out.println("Key " +key+ "value is " +map.get(key));
        }
    }
}
