package v4ex1;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    void eat(){
        System.out.println(name + " " + age + ": " + Cat.plate + " -> " + --Cat.plate);
    }
}
