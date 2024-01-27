package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    // change the access modifier from public to private
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
