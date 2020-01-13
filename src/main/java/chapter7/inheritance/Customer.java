package chapter7.inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

/*    public Customer() {
        //생성자에서 주로 하는 일 : 멤버변수 초기화
        //초기화를 따로 안해주는 경우는 int-> 0, String-> null로 초기화 됨
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer 생성자 호출");
    }*/

    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(String, int) 생성자 호출");

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
