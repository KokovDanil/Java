package v5ex3;

public class Main4 {
    public static void main(String[] args) {
        class NoName implements Clickable{
            @Override
            public void click() {
                System.out.println("Click");
            }
        }

        Clickable noName = new NoName();
        noName.click();
    }
}
