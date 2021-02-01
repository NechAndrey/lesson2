package dz6;

public class Cat extends Animal {

    private int catCount;

    public int getCatCount() {
        return catCount;
    }

    public Cat(String name, int maxRun, int maxSail) {
        super(name);
        this.maxRun = maxRun;
        this.maxSail = maxSail;
        catCount++;
    }

}

