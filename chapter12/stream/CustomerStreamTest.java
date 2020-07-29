package chapter12.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerStreamTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer("깜찍이가희", 20, 100);
        Customer customer2 = new Customer("셜록걸", 13, 50);
        Customer customer3 = new Customer("이순신", 40, 100);

        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
        customerArrayList.add(customer1);
        customerArrayList.add(customer2);
        customerArrayList.add(customer3);


        customerArrayList.stream().forEach(s -> System.out.println(s.getName()));

        int total = customerArrayList.stream().mapToInt(c -> c.getCustomerprice()).sum();
        System.out.println(total);

        customerArrayList.stream().filter(c ->c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s-> System.out.println(s));
    }
}
