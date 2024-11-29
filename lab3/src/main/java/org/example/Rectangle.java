package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height, int r, int g, int b, int a) {
        super(new Color(r,g,b, a));
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
