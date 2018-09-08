package ru.sayakhov.ContractAct;


public class Сontract {
    static int number = 1;
    static String date = "12/12/2018";
    static String[] productList = new String[]{"tea","coffee","milk"};

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Сontract.number = number;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Сontract.date = date;
    }

    public static String[] getProductList() {
        return productList;
    }

    public static void setProductList(String[] productList) {
        Сontract.productList = productList;
    }

}
