package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20,5, 255,0,150, 0);
        Triangle t1 = new Triangle(5,5,4,255,120,65,0);

        ShapeDescriber sd1 = new ShapeDescriber();
        sd1.describe(r1);
        sd1.describe(t1);
    }
}