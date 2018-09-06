package com.TableFlip.SpaceTrader.Bootstrap;

import GUI.HelloWorld;
import com.TableFlip.SpaceTrader.Model.GoodsRegistry;

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
        HelloWorld.main(args);
    }
}
