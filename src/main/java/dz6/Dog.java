package dz6;

public class Dog extends Animal {

    private int dogCount;

    public int getDogCount() {
        return dogCount;
    }

    public Dog(String name, int maxRun, int maxSail) {
        super(name);
        this.maxRun = maxRun;
        this.maxSail = maxSail;
        dogCount++;
    }

}
