package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class EatingSpot {

    private static EatingSpot instance = null;

    private ArrayList<Spot> eatingList;
    private ArrayList<String> locationList;

    private EatingSpot(){
        insertEatingSpots();
    }

    public static EatingSpot getInstance(){
        if(instance == null){
            instance = new EatingSpot();
        }
        return instance;
    }

    private void insertEatingSpots(){

        eatingList = new ArrayList<>();
        locationList = new ArrayList<>();

        //Manila Campus
        locationList.add(Location.Manila.getLocation());
        eatingList.add( new Spot("Animo Biz", "Bloemen Hall", Location.Manila.getLocation()));
        eatingList.add( new Spot("La Casita Canteen", "Enrique Razon Sports Center", Location.Manila.getLocation()));
        eatingList.add( new Spot("Perico's Canteen", "St. La Salle Hall", Location.Manila.getLocation()));

    }

    public ArrayList<String> getLocationList(){
        return locationList;
    }

    public ArrayList<Spot> getEatingList(String location){
        ArrayList<Spot> temp = new ArrayList<>();

        for( Spot s : eatingList ){
            if( s.getLocation().equalsIgnoreCase(location) ){
                temp.add(s);
            }
        }
        return temp;
    }


}
