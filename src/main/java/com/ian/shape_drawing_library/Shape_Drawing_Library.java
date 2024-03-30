package com.ian.shape_drawing_library;

/**
 *
 * @author Ian Tagano
 */

public class Shape_Drawing_Library 
{

    public static void main(String[] args) 
    {
        //creating new instance of class shape with the specific object
        Shape circle = new Circle(5, 5, 10);
        Shape rectangle = new Rectangle(10, 10, 20, 15);
        
        //
        System.out.println("Drawing shapes: ");
        circle.draw();
        rectangle.draw();
        
        //
        System.out.println("\nMoving shapes: ");
        circle.move(7, 7);
        rectangle.move(5, 5);
        
        
        
    }
}
