package org.example;

public class Shape {
    public Color color;
    public double getArea(){
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
    public Color getColor() { return color; }
    public void getColorDescription(){
        System.out.println("Red: " + color.r() + " Green: " + color.g() + " Blue: " + color.b() + " Alpha: " + color.alpha());
    }
    public Shape() {
        this.color = new Color();
    }

    public Shape(Color color) {
        this.color = color;
    }

    public static void print() {
        System.out.println("Shape");
    }

    public static void main(String[] args) {
        Shape shape = new Shape(new Color(255,255,255, 255));
        shape.print();
        shape.getColorDescription();
    }
}