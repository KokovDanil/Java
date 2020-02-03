package v5ex3;

public class Main3 {
    public static void main(String[] args) {
        class NoName implements Clickable{
            @Override
            public void click() {
                System.out.println("Click");
            }
        }

        Clickable noName = new NoName();

        Button button = new Button();
        //show button on GUI and clickable
        button.setClickable(noName);
        //emulatioin
        button.press();
    }
}
