package v5ex2Space2;

public class Pilot {
    String name;
    int height;
    int weight;
    int age;
    String qualification;
    boolean isMale;
    Status status;

    enum Status {
        REST, RETIRED, BUSY, DIED;
    }

    void fire() {
        if (status == Status.BUSY){
            return;
        }
        System.out.println("fired");
    }

    public Pilot(String name) {
        this.name = name;
    }

    void escape() {

        System.out.println("escape from board");
    }
}
