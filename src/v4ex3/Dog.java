package v4ex3;

public class Dog extends Animal {
    String bone;

    public Dog(int age, String name){
        super(name);
        this.age = age;
        super.name = "SuperDog";
    }

    public Dog(String name, String bone) {
        super(name);
        this.bone = bone;
        super.name = "SuperDoggy";
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public void dogsBone(){
        System.out.println(name + ": " + bone);
    }
}
