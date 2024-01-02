/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;

/**
 *
 * @author HP
 */
public class Shape {
    private final String color;
    
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return 0;
    }
}

class Circle extends Shape{
    private final double radius;
    
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double lenght;
    private final double width;
    
    public Rectangle(String color, double lenght,double width){
        super(color);
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    public double getArea(){
        return lenght * width;
    }
}
