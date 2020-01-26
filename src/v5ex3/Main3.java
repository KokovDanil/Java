package v5ex3;

public class Main3 {
    public static void main(String[] args) {
        class NoName implements Clickable{
            @Override
            public void click() {

            }
        }

        Clickable noName = new NoName();
    }
}
