package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Enums;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/7/12
 * Time: 11:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class RandomPlanet extends Planet {
    public RandomPlanet(String name){
        setName(name);
        setResources(Enums.Resources.WARLIKE);
        setTechLevel(Enums.TechLevel.INDUSTRIAL);
        System.out.println("Generating planet named: "+name);
        setLocalValues(PriceGenerator.getInstance().generatePrices(this).getLocalValues());
    }
}
