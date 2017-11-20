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
public class MyRectangle extends MyBoundedShape {
    
    public MyRectangle(int x1, int y1, int x2, int y2, boolean isFilled) {
        super(x1, y1, x2, y2, isFilled);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof MyRectangle)) return false;
        
        return super.equals(obj);
    }
}
