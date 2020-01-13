package v4ex3;

public class Main2 {
    public static void main(String[] args){
        Animal[] animals = new Animal[4];
        animals[0] = new Cat(1, "CCC");
        animals[1] = new Dog(2, "DDD");
        animals[2] = new Cat(3, "CCC");
        animals[3] = new Dog(4, "DDD");

        for (Animal animal: animals){
            animal.voice();
        }
    }
}
