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
public class MyLine extends MyShape {
    
    public MyLine(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof MyLine)) return false;
        
        return super.equals(obj);
    }
}
