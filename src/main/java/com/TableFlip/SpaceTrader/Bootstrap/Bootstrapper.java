package com.TableFlip.SpaceTrader.Bootstrap;

import GUI.CharGen;
import GUI.GetNamePopUp;
import GUI.HelloWorld;
import com.TableFlip.SpaceTrader.GameEntity.Galaxy;
import com.TableFlip.SpaceTrader.Model.GoodsRegistry;
import com.TableFlip.SpaceTrader.Model.PlanetNames;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bootstrapper {
    public static void main(String[] args){
        GoodsRegistry goods= GoodsRegistry.getInstance();
        CharGen.main(args);
    }
    public static void generateGalaxy(){
        System.out.println("Generating galaxy.");
        Galaxy galaxy=Galaxy.getInstance();
    }
}
