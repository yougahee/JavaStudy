package coffee;

public class StarbucksCoffee {

    String cafeName = "starbucks";

    public String getCoffeeMenu() {
        return coffeeMenu;
    }

    public void setCoffeeMenu(String coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }

    String coffeeMenu = "Americano";
     int price;

     Menu menu = new Menu();

     public int takeStarCoffeePrice(){
         return  menu.STARBUCKS_AMERICANO;
     }


    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }


}
