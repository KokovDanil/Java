package v4ex3;

public class Cat extends Animal{


    public Cat(int age, String name){
        super(name);
        this.age = age;
        super.name = "SuperCat";
    }

    void voice(){
        System.out.println("Myau");
    }
}
