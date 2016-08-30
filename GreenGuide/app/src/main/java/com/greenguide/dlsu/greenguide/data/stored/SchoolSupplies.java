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

        suppliesListMnl.add(new Spot("Animo Bookstore", "Ground Floor, Yuchengco Hall"));
        suppliesListMnl.add(new Spot("Full Booked", "Torre Lorenzo II"));
        suppliesListMnl.add(new Spot("Mini Candy & Supplies stalls", "Agno"));
        suppliesListMnl.add(new Spot("National Book Store", "near LRT"));
        suppliesListMnl.add(new Spot("The Store", "2nd Floor Enrique Razon Sports Center"));
        suppliesListMnl.add(new Spot("Office Warehouse", "One Archer’s Place"));

    }

    public ArrayList<Spot> getSuppliesListMnl() {
        return suppliesListMnl;
    }

    private void insertSuppliesStc(){
        suppliesListStc = new ArrayList<>();

        suppliesListStc.add(new Spot("AK Designs", "Paseo De Sta. Rosa"));
        suppliesListStc.add(new Spot("Animo Bookstore", ""));
        suppliesListStc.add(new Spot("Humana Printing Services", "Humana Building"));
        suppliesListStc.add(new Spot("National Book Store", "Paseo De Sta. Rosa"));
        suppliesListMnl.add(new Spot("The Store", "West Wing Basement, Milagros R. Del Rosario Building, DLSU-STC"));
        suppliesListStc.add(new Spot("PC Butlers", ""));
        suppliesListStc.add(new Spot("National Book Store", "Nuvali"));
    }

    public ArrayList<Spot> getSuppliesListStc() {
        return suppliesListStc;
    }
}
