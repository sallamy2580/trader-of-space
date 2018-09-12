package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Enums;
import com.TableFlip.SpaceTrader.Model.Planet;
import com.TableFlip.SpaceTrader.Service.PriceGenerator;

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
        Random random=new Random();
        setName(name);
        setTechLevel(Enums.TechLevel.values()[random.nextInt(Enums.TechLevel.values().length)]);
        setResources(Enums.Resources.values()[random.nextInt(Enums.Resources.values().length)]);
        System.out.println("Generating planet named: " + name);
        setLocalPrices(PriceGenerator.getInstance().generatePrices(this).getLocalValues());
    }
}
