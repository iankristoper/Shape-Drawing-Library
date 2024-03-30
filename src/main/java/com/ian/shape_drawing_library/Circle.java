package com.ian.shape_drawing_library;

/**
 *
 * @author Ian Tagano
 */

public class Circle extends Shape
{
    //private instance variables or attributes of the radius 
    private int radius;
    
    //constructor for the class circle 
    public Circle(int x, int y, int radius)
    {
        super(x, y);
        this.radius = radius;
    }
    
       
    
    //methods overriding 
    @Override
    public void draw()
    {
        System.out.println("Circle drawn at (" + getX() + ", " + getY() + ") with radius " + radius);
    }
        
    
}
