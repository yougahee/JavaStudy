package coffee;

public class Person {

    private String name;
    private int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void buyStarbucksCoffee(StarbucksCoffee starbucksCoffee, int price){
        int coffeePrice = starbucksCoffee.takeStarCoffeePrice();
        String cafeName = starbucksCoffee.getCafeName();
        String getCoffeeMenu = starbucksCoffee.getCoffeeMenu();

        System.out.println(name+" 's coffee price : " + coffeePrice + "cafeName is " + cafeName + getCoffeeMenu + "cageMenu");

        money -= price;

    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int price) {

        money -= price;
    }

}
