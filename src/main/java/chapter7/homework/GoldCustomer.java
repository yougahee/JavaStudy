package chapter7.homework;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(String customerName, int customerID) {
        super(customerName, customerID);

        customerGrade = "Gold";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price* bonusRatio;
        return price - (int)(price*salesRatio);
    }

}
