package lesson10_1;

import lesson10_1.Fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitsList =new ArrayList<>();

    public Box(T ... fruitsArray) {
        Collections.addAll(fruitsList, fruitsArray);
    }
    public void add(T fruit){
        fruitsList.add(fruit);
    }
    public void addAll(Collection<? extends T> fruits){
        fruitsList.addAll(fruits);
    }
    public double getWeight(){
        double sum = 0.0;

        for (T fruit : fruitsList) {
            sum += fruit.getWeight();
        }
        return sum;
    }
    public boolean compare (lesson10_1.Box<?> box){
        return box != null && getWeight() == box.getWeight();
    }
    public void moveTo(lesson10_1.Box<? super T> anotherBox){
        anotherBox.addAll(fruitsList);
        fruitsList.clear();
    }
}
