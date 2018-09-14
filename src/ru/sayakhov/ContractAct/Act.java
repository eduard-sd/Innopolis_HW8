package ru.sayakhov.ContractAct;


import java.util.Arrays;

public class Act {
    private int number;
    private String date;
    private String[] productList;

    public  int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  String getDate() {
        return date;
    }

    public  void setDate(String date) {
        this.date = date;
    }

    public  String[] getProductList() {
        return productList;
    }

    public  void setProductList(String[] productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Act{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", productList=" + Arrays.toString(productList) +
                '}';
    }
}

