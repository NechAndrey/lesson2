package dz6;

public class Animal {
    public String name;
    public int maxRun;
    public int maxSail;
    private int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int a){
        if(a < maxRun) {
            System.out.println(name + " пробежал(a)" + a + " m");
        }else {
            System.out.println("Не может столько пробежать");
        }
    }
    public void sail(int a){
        if(a < maxSail) {
            System.out.println(name + " проплыла(a)" + a + " m");
        }else {
            System.out.println("Не может столько проплыть");
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSail() {
        return maxSail;
    }

    public void setMaxSail(int maxSail) {
        this.maxSail = maxSail;
    }
}
