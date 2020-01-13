package chapter7.inheritance;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(String customerName, int customerID) {
        super(customerName, customerID);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIP(String, int) 생성자 호출");
    }

/*    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIP 생성자 호출");
    }*/
}
