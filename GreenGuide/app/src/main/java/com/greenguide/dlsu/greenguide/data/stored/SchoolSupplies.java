package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class SchoolSupplies {

    private static SchoolSupplies instance = null;

    private ArrayList<Spot> suppliesListMnl;
    private ArrayList<Spot> suppliesListStc;

    private SchoolSupplies(){
        insertSuppliesMnl(); insertSuppliesStc();
    }

    public static SchoolSupplies getInstance(){
        if(instance == null){
            instance = new SchoolSupplies();
        }
        return instance;
    }

    private void insertSuppliesMnl(){
        suppliesListMnl = new ArrayList<>();

        suppliesListMnl.add(new Spot("DLSU Bookstore", "Ground Floor, SPS Building"));
        suppliesListMnl.add(new Spot("Full Booked", "Torre Lorenzo II"));
        suppliesListMnl.add(new Spot("Mini Candy & Supplies stalls", "Agno"));
        suppliesListMnl.add(new Spot("National Book Store", "near LRT"));
        suppliesListMnl.add(new Spot("The Store", ""));
        suppliesListMnl.add(new Spot("Satellite Bookstore", "6th Floor, Andrew Building"));

    }

    public ArrayList<Spot> getSuppliesListMnl() {
        return suppliesListMnl;
    }

    private void insertSuppliesStc(){
        suppliesListStc = new ArrayList<>();

        suppliesListStc.add(new Spot("AK Designs", "Paseo De Sta. Rosa"));
        suppliesListStc.add(new Spot("DLSU-STC Bookstore", ""));
        suppliesListStc.add(new Spot("Humana Printing Services", "Humana Building"));
        suppliesListStc.add(new Spot("National Book Store", "Paseo De Sta. Rosa"));
        suppliesListStc.add(new Spot("PC Butlers", ""));
    }

    public ArrayList<Spot> getSuppliesListStc() {
        return suppliesListStc;
    }
}
