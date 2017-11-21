/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12b;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author elira
 */
public class MyLine extends MyShape {
    
    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(Math.abs(getX1() - getX2()), 2) +
                Math.pow(Math.abs(getY1() - getY2()), 2));
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof MyLine)) return false;
        
        MyLine line = (MyLine) obj;
        return getLength() == line.getLength();
    }
    
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
