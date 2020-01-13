package chapter7.homework;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

        Customer customer1 = new Customer("Kim", 1002);
        Customer customer2 = new Customer("Lee", 1004);
        Customer goldCustomer1 = new GoldCustomer("You", 1006);
        Customer goldCustomer2 = new GoldCustomer("Park", 1100);
        Customer vipCustomer = new VIPCustomer("Kang", 1500, 56);

        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(goldCustomer1);
        customerArrayList.add(goldCustomer2);
        customerArrayList.add(vipCustomer);

        for( Customer customer : customerArrayList) {
            customer.calcPrice(10000);
            System.out.println(customer.showCustomerInfo());
        }

    }
}