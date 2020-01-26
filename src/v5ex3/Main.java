package v5ex3;

public class Main {
    int i;
    {}
    static {}
    public Main(){}

    class NoName2 {}

    static class Builder{
        public static Main create(){
            return new Main();
        }
    }

    public static void main(String[] args) {
        Main main = Main.Builder.create();
        class NoName implements IFly{

            @Override
            public void fly() {
                System.out.println("Fly");
            }
        }
    }
}
