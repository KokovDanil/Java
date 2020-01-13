package v4ex3;

public class Main {
    public static void main(String[] args){
        Cat.foodAmount();
        Cat cat1 = new Cat(1, "Kitty");
        Cat cat2 = new Cat(2, "Kitty");
        Cat cat3 = new Cat(3, "Kitty");

        cat1.setName("Murka");

        Dog dog1 = new Dog(5, "Johny");

        dog1.name = "Sharik";

        cat1.eat();
        cat2.eat();
        cat3.eat();

        dog1.eat();
        dog1.setBone("Bone1");

        cat1.foodAmount();
        dog1.dogsBone();
    }
}
