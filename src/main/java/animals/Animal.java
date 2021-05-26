package animals;

public abstract class Animal {

    protected String name = "Barsik";

    public void sleep() {
        System.out.println("I'm sleeping! Go away!");
    }

    public void move() {
        System.out.println("I'm going... be attended");
    }

    public abstract boolean equals(Dog dog);

    public abstract String getColor(int i);

    public void eat() {
        System.out.println("I'm eating");
    }
}
