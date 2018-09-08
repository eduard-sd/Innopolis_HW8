package ru.sayakhov.calculater;

public class CalculaterFunction {
    public static double calcProcces(double a, double b, String func) {
        if (func.equals("+")) {
            return (a+b);
        } else if (func.equals("-")) {
            return (a-b);
        } else if (func.equals("*")) {
            return (a*b);
        } else if (func.equals("/")) {
            return a/b;
        } else if (func.equals("+%")||func.equals("-%")||func.equals("*%")||func.equals("/%")) {
            if(func.equals("+%")){
                //setResult(a+((a / 100)* b));
                return (a+((a / 100)* b));
            }else if(func.equals("-%")){
                //setResult(a-((a / 100) * b));
                return  (a-((a / 100) * b));
            }else if(func.equals("*%")){
                //setResult(a*((a / 100) * b));
                return (a*((a / 100) * b));
            }else if(func.equals("/%")){
                //setResult(a/((a / 100) * b));
                return (a/((a / 100) * b));
            }
        }
        return 1;
    } //метод определения действия пользователя
}