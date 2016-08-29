package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;

public class ArrowsExpressScheduler {

    private static  ArrowsExpressScheduler instance = null;

    private ArrayList<Schedule> dlsuToStc, stcToDlsu;

    private ArrowsExpressScheduler(){
        addDlsuToStc(); addStcToDlsu();
    }

    public static ArrowsExpressScheduler getInstance(){
        if(instance == null ){
            instance = new ArrowsExpressScheduler();
        }
        return instance;
    }

    private void addDlsuToStc(){
        dlsuToStc = new ArrayList<>();

        dlsuToStc.add(new Schedule("First Trip", "6:00 AM"));
        dlsuToStc.add(new Schedule("", "7:30 AM"));
        dlsuToStc.add(new Schedule("", "9:30 AM"));
        dlsuToStc.add(new Schedule("", "11:00 AM"));
        dlsuToStc.add(new Schedule("", "1:00 PM"));
        dlsuToStc.add(new Schedule("", "2:30 PM"));
        dlsuToStc.add(new Schedule("", "3:30 PM"));
        dlsuToStc.add(new Schedule("", "5:00 PM"));
        dlsuToStc.add(new Schedule("Last Trip", "6:30 PM"));
    }

    private void addStcToDlsu(){

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


    public ArrayList<Schedule> getDlsuToStc() {
        return dlsuToStc;
    }

    public ArrayList<Schedule> getStcToDlsu() {
        return stcToDlsu;
    }
}
