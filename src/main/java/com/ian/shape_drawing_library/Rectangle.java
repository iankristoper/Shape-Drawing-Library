package com.ian.shape_drawing_library;

/**
 *
 * @author Ian Tagano
 */

public class Rectangle extends Shape
{
    //private instance variables or attributes of the ractangle 
    private int width;
    private int height;
    
    //constructor for rectangle to initialize value
    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    
    //methods overriding 
    @Override
    public void draw() 
    {
        System.out.println("Rectangle drawn at (" + getX() + ", " + getY() + ") with width " + width + " and height " + height);
    }
    
}
