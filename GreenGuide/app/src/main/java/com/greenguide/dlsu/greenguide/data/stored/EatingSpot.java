package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class EatingSpot {

    private static EatingSpot instance = null;

    private ArrayList<Spot> eatingList;

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

        //Manila Campus

        eatingList.add( new Spot("One Archer’s Place",
                "Ersao;" +
                "El Pollo Frito;" +
                "Ichiro;" +
                "Manang’s;" +
                "The Burger Transit;" +
                "The Steak Shack;" +
                "Holly’s Coffee;" +
                "Pasta Boy"));

        eatingList.add( new Spot("EGI Taft",
                "Wai Ying;" +
                "Jus & Jerry’s;" +
                "Orange and Spices;" +
                "Food Attack;" +
                "Cafe Laya;" +
                "Zen Tea"));

        eatingList.add( new Spot("SM Green Taft",
                "Eduardo’s Peri-Peri;" +
                "Dunkin Donuts;" +
                "Auntie Anne’s;" +
                "Sbarro;" +
                "Tummy Box"));

        eatingList.add( new Spot("University Mall",
                "KFC;" +
                "Bonchon Chicken"));

        eatingList.add( new Spot("DLSU Canteens",
                "La Casita (2nd floor, Enrique Razon Sports Center);" +
                "La Casita (6th Floor, Br. Andrew Gonzales Hall);" +
                "Br. Bloemen Hall (Animo Biz, Along SJ Walk);" +
                "Perico’s (Ground Floor - La Salle Hall)"));

        eatingList.add( new Spot("Agno",
                "Caric's;" +
                "Ate Rica's Bacsilog"));

    }

    public ArrayList<Spot> getEatingList() {
        return eatingList;
    }
}
