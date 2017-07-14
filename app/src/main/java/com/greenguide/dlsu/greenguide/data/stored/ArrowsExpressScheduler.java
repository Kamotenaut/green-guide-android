package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;

public class ArrowsExpressScheduler {

    private static  ArrowsExpressScheduler instance = null;

    private ArrayList<Schedule> dlsuToLaguna, stcToDlsu;

    private ArrowsExpressScheduler(){
        addDlsuToLaguna(); addLagunaToDlsu();
    }

    public static ArrowsExpressScheduler getInstance(){
        if(instance == null ){
            instance = new ArrowsExpressScheduler();
        }
        return instance;
    }

    private void addDlsuToLaguna(){
        dlsuToLaguna = new ArrayList<>();

        dlsuToLaguna.add(new Schedule("First Trip", "6:00 AM"));
        dlsuToLaguna.add(new Schedule("", "7:30 AM"));
        dlsuToLaguna.add(new Schedule("", "9:30 AM"));
        dlsuToLaguna.add(new Schedule("", "11:00 AM"));
        dlsuToLaguna.add(new Schedule("", "1:00 PM"));
        dlsuToLaguna.add(new Schedule("", "2:30 PM"));
        dlsuToLaguna.add(new Schedule("", "3:30 PM"));
        dlsuToLaguna.add(new Schedule("", "5:00 PM"));
        dlsuToLaguna.add(new Schedule("Last Trip", "6:30 PM"));
    }

    private void addLagunaToDlsu(){

        stcToDlsu = new ArrayList<>();

        stcToDlsu.add(new Schedule("First Trip", "6:00 AM"));
        stcToDlsu.add(new Schedule("", "7:30 AM"));
        stcToDlsu.add(new Schedule("", "9:30 AM"));
        stcToDlsu.add(new Schedule("", "11:00 AM"));
        stcToDlsu.add(new Schedule("", "1:00 PM"));
        stcToDlsu.add(new Schedule("", "2:30 PM"));
        stcToDlsu.add(new Schedule("", "3:30 PM"));
        stcToDlsu.add(new Schedule("", "5:00 PM"));
        stcToDlsu.add(new Schedule("Last Trip", "6:30 PM"));

    }


    public ArrayList<Schedule> getDlsuToLaguna() {
        return dlsuToLaguna;
    }

    public ArrayList<Schedule> getLagunaToDlsu() {
        return stcToDlsu;
    }
}
