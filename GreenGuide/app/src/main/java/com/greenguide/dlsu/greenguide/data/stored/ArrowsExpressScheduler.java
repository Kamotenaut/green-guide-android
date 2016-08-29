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

    }

    private void addStcToDlsu(){

    }


    public ArrayList<Schedule> getDlsuToStc() {
        return dlsuToStc;
    }

    public ArrayList<Schedule> getStcToDlsu() {
        return stcToDlsu;
    }
}
