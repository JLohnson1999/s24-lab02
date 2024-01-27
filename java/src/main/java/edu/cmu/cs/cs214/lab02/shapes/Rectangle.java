package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    // change the access modifier from public to private
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getcrazy() {
        return 1000;
    }
}
