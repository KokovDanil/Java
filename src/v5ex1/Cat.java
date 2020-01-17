package v5ex1;

public class Cat extends Animal implements Bitable{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Myau..");
    }

    @Override
    public void bite() {
        System.out.println(name + " bite smth or smbd");
    }
}
