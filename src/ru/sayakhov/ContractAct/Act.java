package ru.sayakhov.ContractAct;

import java.time.LocalDate;

public class Act {
    static int number;
    static String date;
    static String[] productList;

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Act.number = number;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Act.date = date;
    }

    public static String[] getProductList() {
        return productList;
    }

    public static void setProductList(String[] productList) {
        Act.productList = productList;
    }

}

