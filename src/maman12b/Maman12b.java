/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12b;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author elira
 */
public class Maman12b {

    private static final Random RAND = new Random();
    
    public static void main(String[] args) {
        ArrayList<MyShape> shapes = new ArrayList<>();
        
        // set shapes
        shapes.add(getLine(Color.BLUE));
        shapes.add(getLine(Color.MAGENTA));
        shapes.add(getOval(Color.BLUE, true));
        shapes.add(getOval(Color.RED, false));
        shapes.add(getRectangle(Color.green, true));
        shapes.add(getRectangle(Color.BLACK, false));
        
        ArrayList<MyShape> clonedShapes = new ArrayList<>();
        for(MyShape shape : shapes) {
            MyShape clonedShape;
            try {
                clonedShape = (MyShape) shape.clone();
            }
            catch(CloneNotSupportedException e) {
                System.out.println(e);
                return;
            }
            clonedShape.setX1(shape.getX1() + 10);
            clonedShape.setY1(shape.getY1() + 10);
            
            clonedShapes.add(clonedShape);
        }
        
        MyPanel panel = new MyPanel();
        panel.addShapes(shapes);
        panel.addShapes(clonedShapes);
        
        // draw
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    private static MyLine getLine(Color color) {
        return new MyLine(getRandomCoordinate(), getRandomCoordinate(), 
                getRandomCoordinate(), getRandomCoordinate(), color);
    }
    
    private static MyOval getOval(Color color, boolean isFilled) {
        return new MyOval(getRandomCoordinate(), getRandomCoordinate(), 
                getRandomCoordinate(), getRandomCoordinate(), color, isFilled);
    }
    
    private static MyRectangle getRectangle(Color color, boolean isFilled) {
        return new MyRectangle(getRandomCoordinate(), getRandomCoordinate(), 
                getRandomCoordinate(), getRandomCoordinate(), color, isFilled);
    }
    
    private static int getRandomCoordinate() {
        return RAND.nextInt(201);
    }
}
