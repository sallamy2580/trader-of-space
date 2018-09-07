package com.TableFlip.SpaceTrader.Model;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 2:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoodsRegistry {
    private ArrayList<Good> _goods;
    private static GoodsRegistry _instance;
    private GoodsRegistry(){
        _goods=new ArrayList<Good>();
        _goods.add(new Good("Water", 30).setConsumable(true));
        _goods.add(new Good("Furs", 230));
        _goods.add(new Good("Food",100).setConsumable(true));
        _goods.add(new Good("Ore", 350));
        _goods.add(new Good("Games", 250));
        _goods.add(new Good("Firearms", 1000).setContraband(true).setTech(true));
        _goods.add(new Good("Medicine", 500).setTech(true));
        _goods.add(new Good("Machines", 700).setTech(true));
        _goods.add(new Good("Narcotics", 2500).setContraband(true).setTech(true));
        _goods.add(new Good("Robots", 3500).setTech(true));
    }

    public static GoodsRegistry getInstance(){
        if (_instance!=null){
            return _instance;
        }
        else{
            _instance=new GoodsRegistry();
            return _instance;
        }
    }

    public ArrayList<Good> getGoods() {
        return _goods;
    }

    public void setGoods(ArrayList<Good> goods) {
        _goods = goods;
    }
}
