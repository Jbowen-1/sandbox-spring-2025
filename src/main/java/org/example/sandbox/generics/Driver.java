package org.example.sandbox.generics;

public class Driver {


    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(10);
        Box<Double> box2 = new Box<>(10.0);
        Box<Character> box3 = new Box<>('A');
        Box<String> box4 = new Box<>("ten");
        Box<Integer> box5 = new Box<>(20);
        Box<Integer> box6 = new Box<>(30);

        //Box<? extends Number> means that the Box can contain any type of Number or a subclass of Number
        //Box<?> means that the Box can contain any type of Object
        Crate <Box<?>> crate = new Crate<>();

        crate.addBox(box1);
        crate.addBox(box2);
        crate.addBox(box3);
        crate.addBox(box4);
        crate.addBox(box5);
        crate.addBox(box6);

        System.out.println(crate);
    }
}
