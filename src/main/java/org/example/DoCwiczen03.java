package org.example;

import java.util.HashMap;
import java.util.Map;

public class DoCwiczen03 {

    public static void main(String[] args) {

        String string01 = "abbbc";
        String string02 = "c";
        HashMap<Character, Integer> map = new HashMap<>();

        int cons = 1;

        for (int i = 0; i < string01.length(); i++) {

            //System.out.println(i + ": " + string01.charAt(i) + " - " + cons);

            for (int j = 0; j < string02.length(); j++) {

                //System.out.println(j + ": " + string02.charAt(j) + " - " + cons);

                if(string01.charAt(i) != string02.charAt(j)){

                    //System.out.println(j + ": " + string02.charAt(j) + " - " + cons);

                    char charAt = string02.charAt(j);
                    map.put(charAt, cons);

                }else{

                    char charAt2 = string02.charAt(j);

                    Integer integer = map.get(string02.charAt(j));
                    System.out.println(integer);
                    //int i1 = 0;
                    //i1++;
                    //System.out.println("i1: " + i1);
                    map.put(charAt2, ++integer);
                }

            }

        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.print(m.getKey() + ":" + m.getValue());
        }

    }




}
