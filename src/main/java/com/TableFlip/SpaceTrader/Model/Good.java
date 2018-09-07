package com.TableFlip.SpaceTrader.Model;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Good {
    private String _name;
    private int _baseCost;
    private Map<Enums.TechLevel, Integer> _techModifiers;
    private Map<Enums.Resources, Integer> _resourcesModifiers;

    public Good(String name, int baseCost){
        _name=name;
        _baseCost=baseCost;
    }
    public int getBias(Enums.Resources resources, Enums.TechLevel techLevel){
        return _techModifiers.get(techLevel)+_resourcesModifiers.get(resources);
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

    public Map<Enums.TechLevel, Integer> getTechModifiers() {
        return _techModifiers;
    }

    public Good addTechModifier(Enums.TechLevel techLevel, int modifier) {
        _techModifiers.put(techLevel, modifier);
        return this;
    }

    public Map<Enums.Resources, Integer> getResourcesModifiers() {
        return _resourcesModifiers;
    }

    public Good addResourcesModifiers(Enums.Resources resource, int modifier) {
        _resourcesModifiers.put(resource, modifier);
        return this;
    }
    public Good lowTech(){
        _techModifiers.put(Enums.TechLevel.PREAGRICULTURE, 3);
        _techModifiers.put(Enums.TechLevel.AGRICULTURE,2);
        _techModifiers.put(Enums.TechLevel.MIDIEVAL,1);
        _techModifiers.put(Enums.TechLevel.RENAISSANCE,0);
        _techModifiers.put(Enums.TechLevel.INDUSTRIAL,-1);
        _techModifiers.put(Enums.TechLevel.POSTINDUSTRIAL,-2);
        _techModifiers.put(Enums.TechLevel.HITECH,-3);
        return this;
    }
    public Good highTech(){
        _techModifiers.put(Enums.TechLevel.PREAGRICULTURE, -3);
        _techModifiers.put(Enums.TechLevel.AGRICULTURE,-2);
        _techModifiers.put(Enums.TechLevel.MIDIEVAL,-1);
        _techModifiers.put(Enums.TechLevel.RENAISSANCE,0);
        _techModifiers.put(Enums.TechLevel.INDUSTRIAL,1);
        _techModifiers.put(Enums.TechLevel.POSTINDUSTRIAL,2);
        _techModifiers.put(Enums.TechLevel.HITECH,3);
        return this;
    }
}
