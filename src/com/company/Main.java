package com.company;

import java.util.Scanner;
import com.company.Roman;
import com.company.arab;

public class Main extends chek{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String number99 = scan.next();
        String oper = scan.next();
        String number98 = scan.next();
        if (MainCheck(number99, number98) == "ROME!"){
            System.out.println(mainrim(oper, number99, number98));
        }
        else if (MainCheck(number99, number98) == "ARAB!"){
            System.out.println(mainarab(oper, Integer.parseInt(number99), Integer.parseInt(number98)));
        }
        else if (MainCheck(number99, number98) == "UNKNOWN!"){
            System.out.println("throws Exception");
        }

    }
}