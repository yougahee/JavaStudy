package chapter7.inheritance;

public class OverridingTest {
    public static void main(String[] args) {

        Customer customer = new Customer("이순신", 10010);
        customer.bonusPoint = 1000;


        VIPCustomer vipCustomer = new VIPCustomer("김유신", 10011);
        vipCustomer.bonusPoint = 100000;

        int price = customer.calcPrice(10000);
        int vipPrice = vipCustomer.calcPrice(10000);

        System.out.println(customer.showCustomerInfo() + "지불금액은" + price );
        System.out.println(vipCustomer.showCustomerInfo() + "지불금액은" + vipPrice );


        Customer customer1 = new VIPCustomer("남성린", 10040);
        customer1.bonusPoint = 10000;
        System.out.println(customer1.showCustomerInfo() + "지불금액은" + customer1.calcPrice(10000) + " 원 입니다.");
    }
}
