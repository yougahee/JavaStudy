package chapter9.Interfaceex;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {

        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    public void sayhello() {
        System.out.println("say hello");
    }
}
