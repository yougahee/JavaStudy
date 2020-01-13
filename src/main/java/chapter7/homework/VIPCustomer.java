package chapter7.homework;

public class VIPCustomer extends Customer {

    double salesRatio;

    private int agentID;

    public VIPCustomer(String customerName, int customerID, int agentID) {
        super(customerName, customerID);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price* bonusRatio;
        return price - (int)(price*salesRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는" + agentID;
    }


    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }




}
