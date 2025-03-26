package org.example.sandbox.generics;

import java.util.ArrayList;
import java.util.List;

//when <T extends Box<? extends Number>> is used, it means that T can be any type of Box that contains a Number or a subclass of Number
//Crate<T> is placed so that sandbox code is runnable
public class Crate<T> {

    private List<T> contents;

    public Crate() {
        contents = new ArrayList<>();
    }

    public void addBox(T box) {
        this.contents.add(box);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Crate [");
        sb.append(contents);
        sb.append(']');
        return sb.toString();
    }
}
