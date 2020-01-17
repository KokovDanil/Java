package v5ex1;

public class Can implements IFly {
    @Override
    public void fly() {
        System.out.println("Can is flying");
    }

    @Override
    public void landing() {
        System.out.println("Can has landed");
    }
}
