package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class ParkingSpot {

    private static ParkingSpot instance = null;

    private ArrayList<Spot> parkingList;
    private ArrayList<String> locationList;

    private ParkingSpot(){
        insertParking();
    }

    public static ParkingSpot getInstance(){
        if(instance == null){
            instance = new ParkingSpot();
        }
        return instance;
    }

    private void insertParking(){

        parkingList = new ArrayList<>();
        locationList = new ArrayList<>();

        //Manila Campus
        locationList.add(Location.Manila.getLocation());
        parkingList.add( new Spot("Br. Andrew Gonzales FSC Hall Parking", "", Location.Manila.getLocation()));
        parkingList.add( new Spot("Enrique Razon Sports Center Parking", "", Location.Manila.getLocation()));

        //STC Campus
        locationList.add(Location.STC.getLocation());
        parkingList.add( new Spot("Milagros R. Del Rosario Building", "Visitor's Entrance", Location.STC.getLocation()));
        parkingList.add( new Spot("Students' Parking", "", Location.STC.getLocation()));

        //Outside Campus
        String off = Location.OFF.getLocation();
        locationList.add(off);
        parkingList.add( new Spot("Beach", "near Enrique Razon Sports Center", off));
        parkingList.add( new Spot("Burgundy Transpacific Parking", "", off));
        parkingList.add( new Spot("EGI Parking", "", off));
        parkingList.add( new Spot("Green Court", "", off));
        parkingList.add( new Spot("Madison Parking", "monthly parking fee", off));
        parkingList.add( new Spot("Mang Ben's", "along Leon Guinto Street", off));
        parkingList.add( new Spot("Mcdonald's La Salle", "beside South gate", off));
        parkingList.add( new Spot("Moldex", "along Vito Cruz across Starbucks", off));
        parkingList.add( new Spot("University Mall Parking", "", off));

    }

    public ArrayList<String> getLocationList(){
        return locationList;
    }

    public ArrayList<Spot> getParkingList(String location){
        ArrayList<Spot> temp = new ArrayList<>();

        for( Spot s : parkingList ){
            if( s.getLocation().equalsIgnoreCase(location) ){
                temp.add(s);
            }
        }
        return temp;
    }


}
