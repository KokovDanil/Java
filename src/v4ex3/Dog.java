package v4ex3;

public class Dog extends Animal {
    String bone;

    public Dog(int age, String name){
        super(name);
        this.age = age;
//        this.name = name;
    }

    public Dog(String name, String bone) {
        super(name);
        this.bone = bone;
    }

    void eat(){
        System.out.println(name + " " + age + ": " + Cat.plate + " -> " + --Cat.plate);
    }
}
