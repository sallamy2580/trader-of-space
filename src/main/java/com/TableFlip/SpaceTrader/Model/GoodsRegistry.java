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
        _goods.add(new Good("Water", 30)
                .addResourcesModifiers(Enums.Resources.DESERT,3)
                .addResourcesModifiers(Enums.Resources.LOTSOFWATER,-3)
        );
        _goods.add(new Good("Furs", 230)
                .addResourcesModifiers(Enums.Resources.WARLIKE,1)
                .addResourcesModifiers(Enums.Resources.RICHFAUNA,-3)
                .lowTech()
        );
        _goods.add(new Good("Food", 100)
                .addResourcesModifiers(Enums.Resources.POORSOIL, 3)
                .addResourcesModifiers(Enums.Resources.RICHSOIL, -3)
                .addResourcesModifiers(Enums.Resources.RICHFAUNA, -3)
                .lowTech()
        );
        _goods.add(new Good("Ore", 350)
                .addResourcesModifiers(Enums.Resources.MINERALRICH, -3)
                .addResourcesModifiers(Enums.Resources.MINERALPOOR, 3)
        );
        _goods.add(new Good("Games", 250)
                .addResourcesModifiers(Enums.Resources.ARTISTIC, 2)
                .addResourcesModifiers(Enums.Resources.WARLIKE, -3)
                .highTech()
        );
        _goods.add(new Good("Firearms", 1000)
                .addResourcesModifiers(Enums.Resources.ARTISTIC, -3)
                .addResourcesModifiers(Enums.Resources.WARLIKE, 3)
        );
        _goods.add(new Good("Medicine", 500)
                .addResourcesModifiers(Enums.Resources.WARLIKE, 3)
                .addResourcesModifiers(Enums.Resources.WEIRDMUSHROOMS, -2)
                .addResourcesModifiers(Enums.Resources.LOTSOFHERBS, -3)
                .lowTech()
        );
        _goods.add(new Good("Machines", 700)
                .lowTech()
        );
        _goods.add(new Good("Narcotics", 2500)
                .addResourcesModifiers(Enums.Resources.LOTSOFHERBS, -1)
                .addResourcesModifiers(Enums.Resources.WEIRDMUSHROOMS, -2)
                .addResourcesModifiers(Enums.Resources.ARTISTIC, 1)
                .addResourcesModifiers(Enums.Resources.WARLIKE, -1)
                .highTech()
        );
        _goods.add(new Good("Robots", 3500)
                .addResourcesModifiers(Enums.Resources.MINERALRICH, -1)
                .addResourcesModifiers(Enums.Resources.MINERALPOOR, 1)
                .addResourcesModifiers(Enums.Resources.WARLIKE, 1)
                .lowTech()
        );
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
