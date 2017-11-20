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
public abstract class MyBoundedShape extends MyShape {
    private boolean isFilled;
    
    public MyBoundedShape(int x1, int y1, int x2, int y2, boolean isFilled) {
        super(x1, y1, x2, y2);
        
        this.isFilled = isFilled;
    }
    
    public boolean getIsFilled() {
        return isFilled;
    }
    
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof MyBoundedShape)) return false;
        
        MyBoundedShape bound = (MyBoundedShape) obj;
        return super.equals(obj) && isFilled == bound.getIsFilled();
    }
}
