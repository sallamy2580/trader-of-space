package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Enums;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    public Player() {
    }

    private Map<Enums.Skill, Integer> _stats;
    private String _name;
    private Ship _ship;
    private int _credits;

    public Map<Enums.Skill, Integer> getStats() {
        return _stats;
    }

    public void setStats(Map<Enums.Skill, Integer> stats) {
        _stats = stats;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Ship getShip() {
        return _ship;
    }

    public void setShip(Ship ship) {
        _ship = ship;
    }

    public int getCredits() {
        return _credits;
    }

    public void setCredits(int credits) {
        _credits = credits;
    }
}
