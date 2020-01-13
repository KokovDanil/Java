package v4ex2;

public class Cat {
    private int age;
    private String name;
    static int plate = 100;

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
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
