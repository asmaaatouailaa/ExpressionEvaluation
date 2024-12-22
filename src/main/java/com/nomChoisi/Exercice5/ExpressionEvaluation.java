package com.nomChoisi.Exercice5;

import java.util.Objects;

public class ExpressionEvaluation {

    public static int evaluate (String expression) {
        int sum=0;
        if (expression.equals(" ")) {
            return 0;
        } else if (!expression.contains(",")) {
            return Integer.parseInt(expression);
        } else if (expression.split(",").length == 2) {
            String[] tab = expression.split(",");

             sum = Integer.parseInt(tab[0]) + Integer.parseInt(tab[1]);
            return sum;
        } else if(expression.split(",").length == 2) {
            String[] tab = expression.split(",");
             sum = Integer.parseInt(tab[0]) + Integer.parseInt(tab[1]) + Integer.parseInt(tab[2]);


        }else {
            String[] tab = expression.split(",");
            for(int i=0;i<tab.length;i++){


             sum=sum+Integer.parseInt(tab[i]);


            }


    }


        return sum;
    }


}