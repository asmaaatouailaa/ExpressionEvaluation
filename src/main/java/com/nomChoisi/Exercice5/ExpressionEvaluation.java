package com.nomChoisi.Exercice5;

import java.util.Objects;

public class ExpressionEvaluation {

    public static int evaluate (String expression)
    {
       if (expression.equals(" ")){
                return 0;}
else{
    return Integer.parseInt(expression);
       }


    }
}
