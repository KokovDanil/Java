package v5ex1;

public class Bat extends Animal implements IFly, Bitable {
    @Override    public void voice() {
        System.out.println("Bah");
    }

    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void landing() {
        System.out.println(name + " has landed...");
    }

    @Override
    public void bite() {
        System.out.println(name + " bite smth or smbd");
    }


//    @Override
//    public void level8() {
//        System.out.println("Try default in interface on level8");
//    }
}
