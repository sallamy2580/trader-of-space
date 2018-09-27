package com.TableFlip.SpaceTrader.GameEntity;

import com.TableFlip.SpaceTrader.Model.Coordinates;
import com.TableFlip.SpaceTrader.Model.Planet;
import com.TableFlip.SpaceTrader.Service.PlanetNames;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/7/12
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Galaxy {
    List<Planet> _planets;

    public int getUniverseHeight() {
        return _universeHeight;
    }

    public void setUniverseHeight(int universeHeight) {
        _universeHeight = universeHeight;
    }

    public int getUniverseWidth() {
        return _universeWidth;
    }

    public void setUniverseWidth(int universeWidth) {
        _universeWidth = universeWidth;
    }

    int _universeHeight;
    int _universeWidth;
    public Map<Planet, Coordinates> getLocations() {
        return _locations;
    }
    //Do not call generateLocations if planets have not yet been generated!
    public Map<Coordinates, Planet> generateLocations() {
        HashMap<Coordinates, Planet> map = new HashMap<Coordinates, Planet>();
        for (Planet planet : _planets){
            planet.setCoordinates(newRandomLocation(map));
            System.out.println(planet.getCoordinates());
        }
        return map;
    }
    public Coordinates newRandomLocation(HashMap<Coordinates, Planet> map){
        Random random=new Random();
        int x=random.nextInt(getUniverseWidth());
        int y=random.nextInt(getUniverseHeight());
        Coordinates candidate=new Coordinates(x, y);
        if (map.containsKey(candidate)){
            candidate=newRandomLocation(map);
        }
        return candidate;
    }

    Map<Planet, Coordinates> _locations;

    public static Galaxy getInstance() {
        if (_instance==null){
            System.out.println("New Galaxy!");
            _instance=new Galaxy();
            return _instance;
        }
        else{
            return _instance;
        }

    }

    private static Galaxy _instance;
    private Galaxy(){
        setUniverseHeight(150);
        setUniverseWidth(150);
        _planets =new ArrayList<Planet>();
        for (String planetName : PlanetNames.getInstance().getPlanetNames()){
            _planets.add(new RandomPlanet(planetName));
        }
        generateLocations();
    }
    public List<Planet> getPlanets() {
        return _planets;
    }

    public void setPlanets(List<Planet> planets) {
        _planets = planets;
    }
}
