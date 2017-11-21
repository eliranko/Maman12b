/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12b;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author elira
 */
public class MyPanel extends JPanel {
    
    private final ArrayList<MyShape> shapes;
    
    public MyPanel() {
        shapes = new ArrayList<>();
    }
    
    public void addShapes(ArrayList<MyShape> shapes) {
        this.shapes.addAll(shapes);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(MyShape shape : shapes) {
            shape.draw(g);
        }
    }
}
