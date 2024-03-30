package com.ian.shape_drawing_library;

/**
 *
 * @author Ian Tagano
 */

//abstract base class 
public abstract class Shape 
{
    //private instance variables
    private int x;
    private int y;
    
    
    //constructor for the class shape 
    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    //concrete methods 
    public void move(int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
        
        System.out.println("Shape moved to (" + newX + ", " + newY + ")");
    }
    
    
    //getter methods for getting the value of x
    public int getX()
    {
        return x;
    }
    
    //getter methods for getting the value of y
    public int getY()
    {
        return y;
    }
    
    
    
    //abstract method for drawing the shape 
    public abstract void draw();
}
