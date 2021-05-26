package animals;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cat extends Animal {


    @Override
    public boolean equals(Dog dog) {
        return false;
    }

    @Override
    public String getColor(int i) {
        return null;
    }

    @Override
    public void eat() {
        System.out.println("I'm cat and I eat");
    }

    @Override
    public String toString() {
        return "overrided";
    }

    public int min(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        return 10;
    }

    public int[] generateArray(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(999999);
        }
        return arr;
    }

}
