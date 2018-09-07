package com.TableFlip.SpaceTrader.Model;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/7/12
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Coordinates {
    private int _xPos;
    private int _yPos;
    public Coordinates(int x, int y){
        _xPos=x;
        _yPos=y;
    }

    public int getxPos() {
        return _xPos;
    }

    public void setxPos(int xPos) {
        _xPos = xPos;
    }

    public int getyPos() {
        return _yPos;
    }

    public void setyPos(int yPos) {
        _yPos = yPos;
    }
}
