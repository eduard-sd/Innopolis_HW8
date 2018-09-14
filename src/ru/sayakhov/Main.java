package ru.sayakhov;

import ru.sayakhov.ContractAct.Contract;
import ru.sayakhov.ContractAct.Convector;
import ru.sayakhov.calculater.CalculaterFunction;

import java.util.Scanner;

import static ru.sayakhov.calculater.CalculaterFunction.calcProcces;


public class Main {

    public static void main(String[] args) {
        double  a;
        double b;
        String func;
        Contract contract1 = new Contract(111,"11.11.2018", new String[]{"tea", "water"});
        Contract contract2 = new Contract(222,"12.12.2018", new String[]{"tea", "coffee"});
        Contract contract3 = new Contract(333,"13.12.2018", new String[]{ "coffee", "water"});
        Contract contract4 = new Contract(444,"14.12.2018", new String[]{"tea", "coffee", "water"});
        System.out.println(Convector.contractToAct(contract1)+"\n"+Convector.contractToAct(contract2)+"\n"+Convector.contractToAct(contract3)+"\n"+Convector.contractToAct(contract4));


        System.out.println("a + b = "+CalculaterFunction.addition(5,10));
        System.out.println("a + b = "+CalculaterFunction.addition(15,10));
        System.out.println("a - b = "+CalculaterFunction.subtraction(5,10));
        System.out.println("a * b = "+CalculaterFunction.multiplication(5,10));
        System.out.println("a / b = "+CalculaterFunction.division(5,10));
        System.out.println("a * b% = "+CalculaterFunction.percentOfNumber(5,10));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор с возможность выбора действия");
        System.out.println("Введите число: ");
        a = scanner.nextDouble();

        System.out.println("Введите второе  число: ");
        b = scanner.nextDouble();

        System.out.println("Введите действие +, -, *, /, или +%, -%, *%, /%");
        func = scanner.next();
        System.out.print(a+" "+func+" "+b+" = ");

        System.out.println(calcProcces(a,b,func));

    }
}
