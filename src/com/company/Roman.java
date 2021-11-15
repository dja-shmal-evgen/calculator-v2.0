package com.company;

import java.util.Map;
import java.util.*;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Roman extends arab {
    public static int romanToInteger(String roman)
    {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);

        int result = 0;

        for(int i = 0; i < roman.length(); i++)
        {
            char ch = roman.charAt(i);

            if(i > 0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i - 1)))
            {
                result += numbersMap.get(ch) - 2*numbersMap.get(roman.charAt(i - 1));
            }

            else
                result += numbersMap.get(ch);
        }

        return result;
    }
    public static String getRomanNumber(int c) {
        return join("", nCopies(c, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C");

    }

    public static String mainrim(String oper, String number99, String number98) {


        int number = romanToInteger(number99);


        int number2 = romanToInteger(number98);
        int m = mainarab (oper, number, number2);
        String q = getRomanNumber(m);
        return (q);
    }

}