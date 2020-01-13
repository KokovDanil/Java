package v4ex3;

public class Animal {
    protected int age;
    protected String name;
    static int plate = 100;

    public Animal(String name){
        this.name = name;
    }

//    public Animal() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name + " " + age + ": " + plate + " -> " + --plate);
    }

    static void foodAmount(){
        System.out.println(plate);
    }
}
