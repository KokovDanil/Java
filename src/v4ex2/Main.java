package v4ex2;

public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat(1, "Kitty");
        Cat cat2 = new Cat(2, "Kitty");
        Cat cat3 = new Cat(3, "Kitty");

        Dog dog1 = new Dog(5, "Johny");

        cat1.eat();
        cat2.eat();
        cat3.eat();

        dog1.eat();

        Cat.foodAmount();
    }
}
