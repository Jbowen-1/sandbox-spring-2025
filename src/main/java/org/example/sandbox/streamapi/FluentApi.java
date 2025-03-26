package org.example.sandbox.streamapi;

public class FluentApi {

    public static void main(String[] args) {

        Widget widget = Widget.buildWidget()
                .withLength(10)
                .withHeight(20)
                .withWidth(30)
                .build();

        System.out.println(widget);
    }
}
