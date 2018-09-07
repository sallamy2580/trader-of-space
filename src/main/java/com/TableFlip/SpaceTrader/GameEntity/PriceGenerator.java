package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Good;
import com.TableFlip.SpaceTrader.Model.GoodsRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/7/12
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class PriceGenerator {
    private static PriceGenerator _instance;
    private GoodsRegistry _goodsRegistry;
    private PriceGenerator(){
        _goodsRegistry=GoodsRegistry.getInstance();
    }

    public static PriceGenerator getInstance() {
        return _instance;
    }

    public Planet generatePrices(Planet planet){
        Map<Good, Integer> values=new HashMap<Good, Integer>();
        for (Good good : _goodsRegistry.getGoods()){
            int bias = good.getBias(planet.getResources(), planet.getTechLevel());
            Random random=new Random();
            int modifiedBias=random.nextInt(10)*bias;
            int biasAdjust=modifiedBias*good.getBaseCost()/100;
            values.put(good, good.getBaseCost()+biasAdjust);
        }
        values=filterGoods(values);
        planet.setLocalValues(values);
        return planet;
    }
    private Map<Good, Integer> filterGoods(Map<Good, Integer> candidateValues){

    }
}
