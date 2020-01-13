package chapter7.polymorphism;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
    public void eating() {
        System.out.println("동물이 음식을 먹는다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 움직입니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 움직입니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 해요!");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void flying() {
        System.out.println("독수리가 아주 멀리 날아갑니다아아ㅏ~");
    }
}


public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        if(hAnimal instanceof  Human) {
            Human human = (Human) hAnimal;
            human.readBooks();
        }

        ArrayList<Animal> humanArrayList = new ArrayList<Animal>();
        humanArrayList.add(hAnimal);
        humanArrayList.add(tAnimal);
        humanArrayList.add(eAnimal);


        test.testDownCasting(humanArrayList);

    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i=0; i<list.size(); i++) {
            Animal animal = list.get(i);

            if(animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }else {
                System.out.println("error");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();

    }
}
