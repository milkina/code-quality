package com.softserve.training.code.quality.birds;

import java.util.stream.Stream;

public abstract class Bird {
    public abstract void fly();

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Ostrich ostrich = new Ostrich();
        Bird[] birds = {parrot, ostrich};

        Stream.of(birds).forEach(Bird::fly);
    }
}
