package v5ex1;

public class Main {
    public static void main(String[] args){
        Animal animal = new Cat("Kitty");
        animal.voice();

        Cat cat = (Cat) animal;
        cat.voice();

        Bat bat1 = new Bat("Batty");
        bat1.voice();
        bat1.fly();
        bat1.landing();
        bat1.bite();

        Can can1 = new Can();
        can1.fly();
        can1.landing();
    }
}
