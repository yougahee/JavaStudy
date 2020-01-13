package chapter7.inheritance;

public class CustomerTest {

    public static void main(String[] args) {
  /*      Customer customer = new Customer();

        customer.setCustomerName("이순신");
        customer.setCustomerID(10010);
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());
*/

        VIPCustomer vipCustomer = new VIPCustomer("김유신", 10011);

        /*vipCustomer.setCustomerName("김유신");
        vipCustomer.setCustomerID(10011);*/
        vipCustomer.bonusPoint = 100000;
        System.out.println(vipCustomer.showCustomerInfo());

    }


}
