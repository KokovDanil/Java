package v4ex3;

public class Animal {
    protected int age;
    protected String name;

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
}
