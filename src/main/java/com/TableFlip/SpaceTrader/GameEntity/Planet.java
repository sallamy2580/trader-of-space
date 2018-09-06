package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Good;
import com.TableFlip.SpaceTrader.Model.GoodsRegistry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Planet {
    GoodsRegistry _goodsRegistry=GoodsRegistry.getInstance();
    Map<Good, Integer> _localValues;
    public Planet(){
        _localValues=new HashMap<Good, Integer>();
        //Set up local costs for goods
        for (Good good : _goodsRegistry.getGoods()){
            _localValues.put(good, good.getBaseCost()); //TODO: Make cost change from planet to planet based on some parameters
        }

    }
}
