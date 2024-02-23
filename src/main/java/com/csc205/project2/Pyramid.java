package com.csc205.project2;

public class Pyramid extends Shape {

    public double length;
    public double width;
    public double height;

    public Pyramid() {
    }

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //check this, Bro
    public double surfaceArea() {
        double baseArea = length * width;
        double sideArea = length * Math.sqrt(Math.pow(width / 2.0, 2) + Math.pow(height, 2))
                + width * Math.sqrt(Math.pow(length / 2.0, 2) + Math.pow(height, 2));
        return baseArea + sideArea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    //try this, Man
    public double volume() {
        return (length * width * height) / 3.0;
    }

}
