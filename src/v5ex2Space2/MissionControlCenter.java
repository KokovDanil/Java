package v5ex2Space2;

public class MissionControlCenter {
    String computers;
    SpaceShip currentspaceShip;

    void launch(){
        if (prepareForLaunch()){
            currentspaceShip.launch();
        }
        else {System.out.println("prepare is failed");}
    }

    boolean prepareForLaunch() {
        if (myRandom() >= 5){
            return false;
        }
        System.out.println("prepare is completed");
        pause();
        for (int i = 10; i >= 0; i --){
            pause();
            System.out.println(i);
        }
        return true;
    }

    private int myRandom() {
        int a = 0;
        int b = 10;
        int randomNumber = a + (int)(Math.random() * b);
        return randomNumber;
    }

    private void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
