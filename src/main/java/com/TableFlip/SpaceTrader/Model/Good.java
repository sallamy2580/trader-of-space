package com.TableFlip.SpaceTrader.Model;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Good {
    private boolean _isContraband;
    private boolean _isTech;
    private boolean _isConsumable;
    private String _name;
    private int _baseCost;

    public Good(String name, int baseCost){
        _name=name;
        _baseCost=baseCost;
        _isContraband=false;
        _isTech=false;
        _isConsumable=false;
    }

    public boolean isContraband() {
        return _isContraband;
    }

    public Good setContraband(boolean contraband) {
        _isContraband = contraband;
        return this;
    }

    public boolean isTech() {
        return _isTech;
    }

    public Good setTech(boolean tech) {
        _isTech = tech;
        return this;
    }

    public boolean isConsumable() {
        return _isConsumable;
    }

    public Good setConsumable(boolean consumable) {
        _isConsumable = consumable;
        return this;
    }

    public int getBaseCost() {
        return _baseCost;
    }

    public Good setBaseCost(int baseCost) {
        _baseCost = baseCost;
        return this;
    }

    public String getName() {
        return _name;
    }

    public Good setName(String name) {
        _name = name;
        return this;
    }
}
