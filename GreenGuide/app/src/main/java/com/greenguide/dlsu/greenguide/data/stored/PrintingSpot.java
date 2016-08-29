package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class PrintingSpot {

    private static PrintingSpot instance = null;

    private ArrayList<Spot> printingList;
    private ArrayList<String> locationList;

    private PrintingSpot(){
        insertPrinting();
    }

    public static PrintingSpot getInstance(){
        if(instance == null){
            instance = new PrintingSpot();
        }
        return instance;
    }

    private void insertPrinting(){

        printingList = new ArrayList<>();
        locationList = new ArrayList<>();

        //Manila Campus
        String manila = Location.Manila.getLocation();
        locationList.add(manila);
        printingList.add( new Spot("Andrew Hall", "2nd Floor", manila));
        printingList.add( new Spot("Copytrade", "beside Tapa King; in front of University Mall", manila));
        printingList.add( new Spot("Computer Shop", "EGI; Sherwood", manila));
        printingList.add( new Spot("Piso Print", "in front of the University Mall; 2nd floor of One Archers Place", manila));
        printingList.add( new Spot("Photocopying Stations", "Around Campus", manila));
        printingList.add( new Spot("Student Cooperative (SCOOP)", "Ground Floor, Br. Connon Hall", manila));
        printingList.add( new Spot("Nitronet", "Beside Tapa King", manila));

    }

    public ArrayList<String> getLocationList(){
        return locationList;
    }

    public ArrayList<Spot> getPrintingList(String location){
        ArrayList<Spot> temp = new ArrayList<>();

        for( Spot s : printingList ){
            if( s.getLocation().equalsIgnoreCase(location) ){
                temp.add(s);
            }
        }
        return temp;
    }
}
