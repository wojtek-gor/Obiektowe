package pl.imiajd.goralski;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    BetterRectangle(int width, int height){
        super(width,height);
    }
    public double getPerimeter(){
        return 2*getHeight()+2*getWidth();
    }
    public double getArea(){
        return getHeight()*getWidth();
    }
}
