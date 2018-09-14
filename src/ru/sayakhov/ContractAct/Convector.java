package ru.sayakhov.ContractAct;

public class Convector {
    public static Act contractToAct(Contract contract){
        Act act1 = new Act();
        act1.setNumber(contract.getNumber());
        act1.setProductList(contract.getProductList());
        act1.setDate(contract.getDate());
        return act1;
    }

}
