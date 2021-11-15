package com.company;

import com.company.arab;

public class chek extends Roman {
    public static boolean IsArab(String num) {
        for (int i = 0; i < num.length(); i++) {
            if ((int)num.charAt(i) < 58 && (int)num.charAt(i) > 48){continue;}
            else {return false;}}
        return true;
    }
    public static boolean IsRome(String num) {
        for (int i = 0; i < num.length(); i++) {
            int Ni = (int)num.charAt(i);
            if (Ni == 73 || Ni == 86 || Ni == 88){continue;}
            else {return false;}}
        return true;
    }
    public static String MainCheck(String number99, String number98){
        if (IsArab(number99) && IsArab(number98)){
            return("ARAB!");
        }
        else if (IsRome(number99) && IsRome(number98)){
            return("ROME!");
        }
        else {
            return("UNKNOWN!");
        }
    }
}