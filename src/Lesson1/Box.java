package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Box<T extends Fruit> {

    private ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    @SafeVarargs
    public Box(T... fruits) {
        this.fruitList = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getMass() {
        float mass = 0.0f;

        for (T o : fruitList) {
            mass += o.getMass();
        }

        return mass;
    }
    //метод, который позволяет пересыпать фрукты из текущей коробки в другую
    public void drag(Box<T> another) {
        another.fruitList.addAll(fruitList);
        fruitList.clear();

    }

    public void add(T fruit) {
        fruitList.add(fruit);
    }

    // Не забываем про метод добавления фрукта в коробку.
    public void add(Collection<T> fruit) {
        fruitList.addAll(fruit);
    }

    public boolean compare(Box<?> o) {        
        return Math.abs(this.getMass() - o.getMass()) < 0.001;
    }
}
