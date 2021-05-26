package animals;

public class Dog extends Animal{

    public Dog() {
        super();
    }

    public Dog(String name, String color, int age) {
        this.setAge(age);
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Dog dog){
        return (this.age == dog.age && this.color == dog.color && this.name == dog.name);
    }

    public static String secondName = "Big dog";

    private int age = 10;

    String color = "Green";


    public void sleep(int hourToSleep) {
        System.out.println("I'm sleeping for " + hourToSleep + " hours! Go away!");
    }

//    void sleep(String hourToSleep){
//        System.out.println("I'm sleeping! For "+hourToSleep+" hours yet! Go away!");
//    }

    protected void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void bark() {
        System.out.println("Waff!!! Waff!!! Waff!!! Waff!!! Waff!!!");
    }

    @Override
    public String getColor(int i) {
        return null;
    }
}
