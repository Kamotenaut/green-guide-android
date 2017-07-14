package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Activity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LiturgicalActivities {

    private static LiturgicalActivities instance = null;

    private ArrayList<Activity> massList;
    private ArrayList<Activity> otherList;

    private LiturgicalActivities(){
        insertMass(); insertOtherActivies();
    }

    public static LiturgicalActivities getInstance(){
        if( instance == null ){
            instance = new LiturgicalActivities();
        }
        return instance;
    }

    private void insertMass(){
        massList = new ArrayList<>();

        massList.add(new Activity("Daily Masses", "12:00 PM", "Monday to Friday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        massList.add(new Activity("Daily Masses", "3:00 PM", "Monday, Tuesday, and Thursday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        massList.add(new Activity("Daily Masses", "5:30 PM", "Wednesday",
                "Chapel of Christ the Teacher \n" +
                "14th Floor, Gonzalez Hall"));
        massList.add(new Activity("Daily Masses", "12:00 PM", "First Friday of the Month",
                "Most Blessed Sacrament Chapel \n" +
                "Second Floor, La Salle Hall South Wing"));
        massList.add(new Activity("Daily Masses", "5:30 PM", "First Friday of the Month",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        massList.add(new Activity("Daily Masses", "11:30 AM", "Saturday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        massList.add(new Activity("Daily Masses", "9:00 AM", "Sunday",
                "Most Blessed Sacrament Chapel \n" +
                "Second Floor, La Salle Hall South Wing"));
    }

    private void insertOtherActivies(){
        otherList = new ArrayList<>();

        otherList.add( new Activity("Morning Prayer", "8:00 AM", "Monday to Friday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        otherList.add( new Activity("Exposition of the Blessed Sacrament", "11:00 AM", "Monday to Friday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        otherList.add( new Activity("Eucharistic Exposition and Benediction", "After 12:00 PM Mass", "Thursday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        otherList.add( new Activity("Novena to our Mother of Perpetual Help", "11:50 AM", "Wednesday",
                "Pearl of Great Price Chapel\n" +
                "Ground Floor, La Salle Hall North Wing"));
        otherList.add( new Activity("Sacrament of Reconciliation (Confession)", "As per request", "Monday to Friday",
                "Chaplain's Office, SJ 103"));
    }

    public ArrayList<Activity> getOtherList(){
        return otherList;
    }

    public ArrayList<Activity> getMassList(){
        return massList;
    }
}
