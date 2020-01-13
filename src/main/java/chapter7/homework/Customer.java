package chapter7.homework;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }

    //보너스 포인트 적립 및 지불 가격 return
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +"이며, 적립된 보너스 점수는 " + bonusPoint + "입니다." ;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
