package v4ex3;

public class Cat extends Animal{
    static int plate = 100;

    public Cat(int age, String name){
        super(name);
        this.age = age;
//        this.name = name;
    }

    void eat(){
        System.out.println(name + " " + age + ": " + plate + " -> " + --plate);
    }

    static void foodAmount(){
        System.out.println(plate);
    }
}
