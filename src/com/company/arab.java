package com.company;

public class arab {
    public static int mainarab(String oper, int number, int number2) {

        switch (oper) {
            case "+":
                int a = number + number2;
                return(a);

            case "-":
                int b = number - number2;
                return(b);

            case "*":
                int c = number * number2;
                return(c);

            case "/":
                int v = number / number2;
                return (v);

        }
        return number;
    }
}