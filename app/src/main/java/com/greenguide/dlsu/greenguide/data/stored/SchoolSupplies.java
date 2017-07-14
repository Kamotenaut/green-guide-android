package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class SchoolSupplies {

    private static SchoolSupplies instance = null;

    private ArrayList<Spot> suppliesListMnl;
    private ArrayList<Spot> suppliesListLaguna;

    private SchoolSupplies(){
        insertSuppliesMnl(); insertSuppliesLaguna();
    }

    public static SchoolSupplies getInstance(){
        if(instance == null){
            instance = new SchoolSupplies();
        }
        return instance;
    }

    private void insertSuppliesMnl(){
        suppliesListMnl = new ArrayList<>();

        suppliesListMnl.add(new Spot("Animo Bookstore", "Enrique Yuchengco Hall, Ground floor"));
        suppliesListMnl.add(new Spot("Fully Booked", "Torre Lorenzo II"));
        suppliesListMnl.add(new Spot("Mini Candy & Supplies stalls", "Agno"));
        suppliesListMnl.add(new Spot("National Book Store", "near LRT"));
        suppliesListMnl.add(new Spot("The Store", "Enrique Yuchengco Hall, Ground floor"));
        suppliesListMnl.add(new Spot("Office Warehouse", "One Archer’s Place"));

    }

    public ArrayList<Spot> getSuppliesListMnl() {
        return suppliesListMnl;
    }

    private void insertSuppliesLaguna(){
        suppliesListLaguna = new ArrayList<>();

        suppliesListLaguna.add(new Spot("AK Designs", "Paseo De Sta. Rosa"));
        suppliesListLaguna.add(new Spot("Animo Bookstore", ""));
        suppliesListLaguna.add(new Spot("Humana Printing Services", "Humana Building"));
        suppliesListLaguna.add(new Spot("National Book Store", "Paseo De Sta. Rosa"));
        suppliesListLaguna.add(new Spot("The Store", "West Wing Basement, Milagros R. Del Rosario Building, Laguna Campus"));
        suppliesListLaguna.add(new Spot("PC Butlers", ""));
        suppliesListLaguna.add(new Spot("National Book Store", "Nuvali"));
    }

    public ArrayList<Spot> getSuppliesListLaguna() {
        return suppliesListLaguna;
    }
}
