package ru.sayakhov;

import ru.sayakhov.ContractAct.Act;
import ru.sayakhov.ContractAct.Сontract;

import java.util.Arrays;
import java.util.Scanner;

import static ru.sayakhov.calculater.CalculaterFunction.calcProcces;


public class Main {

    public static void main(String[] args) {
        double  a;
        double b;
        String func;

        int number;
        String date;
        String[] productList;

        number = Сontract.getNumber();
        date = Сontract.getDate();
        productList = Сontract.getProductList();

        Act.setNumber(number);
        Act.setDate(date);
        Act.setProductList(productList);

        System.out.println("договор "+Сontract.getNumber()+"  дата "+Сontract.getDate()+"  список"+Arrays.toString(Сontract.getProductList()));
        System.out.println(("договор "+Act.getNumber()+"  дата "+Act.getDate()+"  список"+ Arrays.toString(Act.getProductList())));


        Scanner scanner = new Scanner(System.in);
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
