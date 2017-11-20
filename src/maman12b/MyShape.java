/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12b;

/**
 *
 * @author elira
 */
public abstract class MyShape implements Cloneable {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public MyShape(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getX1() {
        return x1;
    }
    
    public int getX2() {
        return x2;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getY2() {
        return y2;
    }
    
    public void setX1(int x1) {
        this.x1 = x1;
    }
    
    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof MyShape)) return false;
        
        MyShape shape = (MyShape) obj;
        return getX1() == shape.getX1() 
                && getY1() == shape.getY1() 
                && getX2() == shape.getX2()
                && getY2() == shape.getY2();
    }
}
