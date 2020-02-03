package v5ex3;

public class Button {
    Clickable clickable;

    public void setClickable(Clickable clickable) {
        this.clickable = clickable;
    }

    void press(){
        clickable.click();
    }
}
