package test2;

import test2.CanVoice;

public class Cat implements CanVoice {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void voice() {
        System.out.println(name + " мяукнул!!!");

    }
}

