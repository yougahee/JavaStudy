package chapter12.stream;

public class Customer {

    private int price;
    private String name;
    private int age;

    public Customer(String name, int age, int price) {
        this.name = name;
        this.price = price;
        this. age = age;
    }

    public String toString() {
        return name + " " + price + " " + age + " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getCustomerprice() {
        return price;
    }

    public void setCustomerprice(int price) {
        this.price = price;
    }
}
