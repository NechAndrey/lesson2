package dz6;

public class Main {
    public static void main(String[] args) {
       StartApp();
    }

    private static void StartApp(){
        Cat cat = new Cat("kit",200,0);
        cat.run(2);
        Dog dog = new Dog("sharik",500,10);
        dog.run(333);
        System.out.println(dog.getAnimalCount() + cat.getAnimalCount() + cat.getCatCount() + dog.getDogCount());
    }

}
