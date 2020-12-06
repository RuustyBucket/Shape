/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.Random;

/**
 *
 * @author Andrew
 */
public class Rectangular {
    private int length;         
    private int width;
    private static int numOfSides = 4;
   
    /**
     * 
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangular(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Default constructor
     */
    public Rectangular() {
        Random rand = new Random();
        
        this.length = rand.nextInt(10) + 1;
        this.width = rand.nextInt(10) + 1;
    }
    
    /**
     * To copy 2 rectangular shapes
     * @param rectangular 
     */
    public Rectangular(Rectangular rectangular) {
        this.length = rectangular.length;
        this.width = rectangular.width;
    }
    
    /**
     * To calculate the area of a rectangle
     * @return 
     */
    public int calcArea() {
        return length * width;
    }
    
    /**
     * To calculate the perimeter of a rectangle
     * @return 
     */
    public int calcPerimeter() {
        return (2 * length) + (2 * width);
    }
    
    /**
     * To compare 2 rectangular shapes
     * @param rectangular the given rectangle dimensions
     * @return 
     */
    public boolean equals(Rectangular rectangular) {
        return this.length == rectangular.length && this.width == rectangular.width;
    }

    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s\n", "Length", length);
        str += String.format("%-10s: %s\n", "Width", width);
        str += String.format("%-10s: %s\n", "Perimeter", calcPerimeter());
        str += String.format("%-10s: %s\n", "Area", calcArea());
        
        return str;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
}

    