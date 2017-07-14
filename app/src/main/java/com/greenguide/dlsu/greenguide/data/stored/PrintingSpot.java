package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Location;
import com.greenguide.dlsu.greenguide.data.model.Spot;

import java.util.ArrayList;

public class PrintingSpot {

    private static PrintingSpot instance = null;

    private ArrayList<Spot> printingMnlList;
    private ArrayList<Spot> printingLagunaList;
    private ArrayList<Spot> printingOffList;
    private ArrayList<Spot> photocopyMnlList;
    private ArrayList<Spot> photocopyLagunaList;

    private PrintingSpot(){
        insertPrintingMnl();
        insertPrintingOff();
        insertPrintingLaguna();
        insertPhotocopyMnl();
        insertPhotocopyLaguna();
    }

    public static PrintingSpot getInstance(){
        if(instance == null){
            instance = new PrintingSpot();
        }
        return instance;
    }

    private void insertPrintingMnl(){

        printingMnlList = new ArrayList<>();
        //Manila Campus
        printingMnlList.add( new Spot("Br. Andrew Gonzalez Hall, Law Library, 2nd floor", "2nd Floor"));
        printingMnlList.add( new Spot("Student Co-Operative (SCOOP)", "Ground Floor, Br. Connon Hall"));

    }

    private void insertPrintingOff(){
        printingOffList = new ArrayList<>();

        printingOffList.add( new Spot("Copytrade", "beside Tapa King; in front of University Mall"));
        printingOffList.add( new Spot("Computer Shop", "Speedbytes (EGI)\nTechtite (One Archers Place)\nNitronet (beside Tapa King)"));
        printingOffList.add( new Spot("Piso Print", "in front of the University Mall; 2nd floor of One Archers Place"));;
    }

    private void insertPhotocopyMnl(){

        photocopyMnlList = new ArrayList<>();

        photocopyMnlList.add( new Spot("Andrew Gonzales Hall", "2nd Floor Hallway"));
        photocopyMnlList.add( new Spot("Andrew Gonzales Hall", "2nd Floor Library"));
        photocopyMnlList.add( new Spot("Andrew Gonzales Hall", "8th Floor Hallway"));
        photocopyMnlList.add( new Spot("Andrew Gonzales Hall", "15th Floor Hallway"));
        photocopyMnlList.add( new Spot("Faculty Association", "3rd Floor, Miguel Building"));
        photocopyMnlList.add( new Spot("Gokongwei Building", "Ground Floor"));
        photocopyMnlList.add( new Spot("Henry Sy, Sr. Hall", "7th Floor, Library"));
        photocopyMnlList.add( new Spot("Henry Sy, Sr. Hall", "9th Floor, Library"));
        photocopyMnlList.add( new Spot("La Salle Building", "2nd Floor, Medrano Hall"));
        photocopyMnlList.add( new Spot("Miguel Building", "Ground Floor"));
        photocopyMnlList.add( new Spot("SJ Hallway", "Ground Floor"));
        photocopyMnlList.add( new Spot("Yuchengco Building", "Ground Floor"));
    }

    private void insertPrintingLaguna(){
        printingLagunaList = new ArrayList<>();

        printingLagunaList.add( new Spot("College Library", "3rd floor"));
    }

    private void insertPhotocopyLaguna(){
        photocopyLagunaList = new ArrayList<>();

        photocopyLagunaList.add( new Spot("College Library", "3rd floor"));
    }

    public ArrayList<Spot> getPrintingLagunaList() {
        return printingLagunaList;
    }

    public ArrayList<Spot> getPhotocopyMnlList(){
        return photocopyMnlList;
    }

    public ArrayList<Spot> getPhotocopyLagunaList() {
        return photocopyLagunaList;
    }

    public ArrayList<Spot> getPrintingMnlList() {
        return printingMnlList;
    }

    public ArrayList<Spot> getPrintingOffList(){
        return printingOffList;
    }
}
