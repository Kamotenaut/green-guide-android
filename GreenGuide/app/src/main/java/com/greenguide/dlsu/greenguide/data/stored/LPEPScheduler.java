package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;

public class LPEPScheduler {

    private static  LPEPScheduler instance = null;

    private ArrayList<Schedule> scheduleA, scheduleB;

    private LPEPScheduler(){

    }

    public static LPEPScheduler getInstance(){
        if(instance == null ){
            instance = new LPEPScheduler();
        }
        return instance;
    }

    private void addScheduleA(){

    }

    private void addScheduleB(){

    }


    public ArrayList<Schedule> getScheduleA() {
        return scheduleA;
    }

    public ArrayList<Schedule> getScheduleB() {
        return scheduleB;
    }
}
