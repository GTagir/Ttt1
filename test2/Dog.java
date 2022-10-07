package test2;

import test2.CanVoice;

public class Dog implements CanVoice {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void voice() {
        System.out.println(name + " гавкнул!!!");
    }
}
