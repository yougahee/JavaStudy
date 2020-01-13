package coffee;

public class CafeTest {

    public static void main(String[] args) {

        Person kim = new Person("kim", 10000);
        Person lee = new Person("lee", 32000);

        StarbucksCoffee starbucksCoffee = new StarbucksCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyStarbucksCoffee(starbucksCoffee, 4000);


    }

}
