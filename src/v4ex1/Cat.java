package v4ex1;

public class Cat {
    int age;
    String name;
    static int plate = 100;

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    void eat(){
        System.out.println(name + " " + age + ": " + plate + " -> " + --plate);
    }
}
