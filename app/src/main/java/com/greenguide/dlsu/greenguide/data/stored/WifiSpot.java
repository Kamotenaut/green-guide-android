package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;


import java.util.ArrayList;

public class WifiSpot {

    private static WifiSpot instance = null;

    private ArrayList<Spot> wifiList;
    private ArrayList<String> campusList;

    private WifiSpot(){
        insertSpot();
    }

    public static WifiSpot getInstance(){
        if ( instance == null ){
            instance = new WifiSpot();
        }
        return instance;
    }

    private void insertSpot(){
        wifiList = new ArrayList<>();
        campusList = new ArrayList<>();


        //Manila Campus
        String manila = Location.Manila.getLocation();
        campusList.add(manila);
        wifiList.add( new Spot("Amphitheater", "", manila));
        wifiList.add( new Spot("Bloemen Hall", "", manila));
        wifiList.add( new Spot("Br. Connon Hall", "Hallways", manila));
        wifiList.add( new Spot("Central Plaza", "beside Yuchengco Hall", manila));
        wifiList.add( new Spot("Cory Aquino Democratic Space", "Henry Sy, Sr. Hall Grounds", manila));
        wifiList.add( new Spot("Enrique Razon Sports Center", "2nd, 9th, and 10th Floors", manila));
        wifiList.add( new Spot("Enrique Yuchengco Hall", "3rd, 4th, 5th, and 6th Floors (Hallways and Classrooms)", manila));
        wifiList.add( new Spot("Gokongwei Hall",
                "Ground Floor Lobby, 2nd and 4th Floors (Hallway and Classrooms)", manila));
        wifiList.add( new Spot("Henry Sy, Sr. Hall", "ESH Lobby, The Learning Commons", manila));
        wifiList.add( new Spot("Lasallian Center", "Hallways, Rooms, Lobby, and Canteen", manila));
        wifiList.add( new Spot("Marian Quadrangle",
                "Bench in Front of St. Miguel Hall and Bench beside Velasco Hall",  manila));
        wifiList.add( new Spot("Shalom Center", "", manila));
        wifiList.add( new Spot("St. Joseph Hall",
                "Ground Floor Study Area near SDFO, " +
                "Ground Floor Lobby, " +
                "and 2nd to 6th Floors (Hallway and Classrooms)", manila));
        wifiList.add( new Spot("St. La Salle Hall", "2nd Floor North Wing and Medrano Hall", manila));
        wifiList.add( new Spot("St. Miguel Hall",
                "Ground Floor Area and 2nd to 4th Floors (Hallway and Classrooms)", manila));
        wifiList.add( new Spot("Velasco Hall",
                "Ground Floor Area and 2nd to 5th Floors (Hallway and Classrooms)", manila));
        wifiList.add( new Spot("William Hall", "Ground Floor Lobby and Study Area", manila));

        //Laguna Campus
        String stc = Location.Laguna.getLocation();
        campusList.add(stc);
        wifiList.add( new Spot("College Classrooms", "4th Floor", stc));
        wifiList.add( new Spot("College Library", "3rd Floor, West Wing", stc));
        wifiList.add( new Spot("Multi-Purpose Hall", "2nd Floor, West Wing", stc));
        wifiList.add( new Spot("Student Hub", "2nd Floor, West Wing", stc));
        wifiList.add( new Spot("Students’ Center", "4th Floor, West Wing", stc));
        wifiList.add( new Spot("Quadrangle Huts", "Basement near the Cafeteria", stc));

        //Makati Campus
        String makati = Location.Makati.getLocation();
        campusList.add(makati);
        wifiList.add( new Spot("RCBC Plaza Tower II", "5th Floor (Hallway)", makati));
    }

    public ArrayList<String> getCampusList(){
        return campusList;
    }

    public ArrayList<Spot> getWifiList(String campus){
        ArrayList<Spot> temp = new ArrayList<>();
        for(Spot s : wifiList ){
            if( s.getLocation().equalsIgnoreCase(campus) )
                temp.add(s);
        }
        return temp;
    }
}
