package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.PlanetNames;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/7/12
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Galaxy {
    List<Planet> _planets;

    public Galaxy getInstance() {
        return _instance;
    }

    Galaxy _instance;
    private Galaxy(){
        _planets=new ArrayList<Planet>();
        for (String planetName : PlanetNames.getInstance().getPlanetNames()){
            _planets.add(new RandomPlanet(planetName));
        }
    }
    public List<Planet> getPlanets() {
        return _planets;
    }

    public void setPlanets(List<Planet> planets) {
        _planets = planets;
    }
}
