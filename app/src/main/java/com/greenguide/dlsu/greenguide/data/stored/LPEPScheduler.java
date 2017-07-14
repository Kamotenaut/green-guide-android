package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;

public class LPEPScheduler {

    private static  LPEPScheduler instance = null;

    private ArrayList<Schedule> scheduleA, scheduleB;

    private LPEPScheduler(){
        addScheduleA(); addScheduleB();
    }

    public static LPEPScheduler getInstance(){
        if(instance == null ){
            instance = new LPEPScheduler();
        }
        return instance;
    }

    private void addScheduleA(){
        scheduleA = new ArrayList<>();

        //Day One
        scheduleA.add( new Schedule("Registration", "7:00 - 7:45 AM", "Day 1"));
        scheduleA.add( new Schedule("Movement to HSSH Grounds", "7:30 - 7:45 AM", "Day 1" ));
        scheduleA.add( new Schedule("Introduction to the Lasallian Prayers\n" +
                "Eucharistic Celebration", "7:45 - 9:00 AM", "Day 1" ));
        scheduleA.add( new Schedule("Entrance of Colors\n" +
                "National Anthem\n" +
                "Welcoming Remarks\n" +
                "University President\n" +
                "USG President", "9:00 - 9:30 AM", "Day 1" ));
        scheduleA.add( new Schedule("Movement to Eating Area", "9:30 - 9:40 AM", "Day 1" ));
        scheduleA.add( new Schedule("AM Snacks", "9:40 - 9:50 AM", "Day 1" ));
        scheduleA.add( new Schedule("Movement to Classrooms", "9:50 - 10:00 AM", "Day 1" ));
        scheduleA.add( new Schedule("Getting to know you Activities\n" +
                "Institutional Video", "10:00 - 10:30 AM", "Day 1" ));
        scheduleA.add( new Schedule("Academic Concerns", "10:40 - 12:00 PM", "Day 1" ));
        scheduleA.add( new Schedule("Movement to Eating Area", "12:00 - 12:10 PM", "Day 1" ));
        scheduleA.add( new Schedule("Lunch", "12:10 - 1:00 PM", "Day 1" ));
        scheduleA.add( new Schedule("Movement to Classrooms", "1:00 - 1:10 PM", "Day 1" ));
        scheduleA.add( new Schedule("Introduction to the Lasallian " +
                "Formation and Action Framework " +
                "Student Testimonial Videos", "1:10 - 1:45 PM", "Day 1" ));
        scheduleA.add( new Schedule("Counselling and Career Services", "1:45 - 2:15 PM", "Day 1" ));
        scheduleA.add( new Schedule("Synthesis/Recap", "2:15 - 2:30 PM", "Day 1" ));
        scheduleA.add( new Schedule("Movement to Campus Tour " +
                "NFC, DTW, SHAS, Collection", "2:30 - 2:40 PM", "Day 1" ));
        scheduleA.add( new Schedule("Campus Tour", "2:40 - 4:00 PM", "Day 1" ));


        //Day Two
        scheduleA.add( new Schedule("Registration", "7:00 - 8:00 AM", "Day 2"));
        scheduleA.add( new Schedule("Prayer Services", "8:00 - 8:15 AM", "Day 2"));
        scheduleA.add( new Schedule("Lasallian Module", "8:15 - 9:45 AM", "Day 2"));
        scheduleA.add( new Schedule("Movement to eating area", "9:45 – 9:55 AM", "Day 2"));
        scheduleA.add( new Schedule("AM Snacks", "9:55 - 10:05 AM", "Day 2"));
        scheduleA.add( new Schedule("Movement to Classrooms", "10:05 - 10:15 AM", "Day 2"));
        scheduleA.add( new Schedule("DO Module", "10:15 - 11:45 PM", "Day 2"));
        scheduleA.add( new Schedule("Movement to Eating Area", "11:45 - 12:00 PM", "Day 2"));
        scheduleA.add( new Schedule("Lunch", "12:00 - 1:10 PM", "Day 2"));
        scheduleA.add( new Schedule("Movement to HSSH Grounds", "1:10 - 1:30 PM", "Day 2"));
        scheduleA.add( new Schedule("LAMBS Sponsors Program", "1:30 - 2:00 PM", "Day 2"));
        scheduleA.add( new Schedule("Learning The Alma Mater Song\n" +
                "Teaching of Lasallian Cheers", "2:00 - 2:40 PM", "Day 2"));
        scheduleA.add( new Schedule("CAO Presentation", "2:40 - 3:20 PM", "Day 2"));
        scheduleA.add( new Schedule("LPEP Party Celebration", "3:20 - 3:50 PM", "Day 2"));
        scheduleA.add( new Schedule("Movement to CSO Tour", "3:50 - 4:00 PM", "Day 2"));
        scheduleA.add( new Schedule("CSO Tour", "4:00 - 5:00 PM", "Day 2"));
    }

    private void addScheduleB(){

        scheduleB = new ArrayList<>();

        //Day One
        scheduleB.add( new Schedule("Registration", "7:00 - 7:45 AM", "Day 1"));
        scheduleB.add( new Schedule("Movement to HSSH Grounds", "7:30 - 7:45 AM", "Day 1" ));
        scheduleB.add( new Schedule("Introduction to the Lasallian Prayers\n" +
                "Eucharistic Celebration", "7:45 - 9:00 AM", "Day 1" ));
        scheduleB.add( new Schedule("Entrance of Colors\n" +
                "National Anthem\n" +
                "Welcoming Remarks\n" +
                "University President\n" +
                "USG President", "9:00 - 9:30 AM", "Day 1" ));
        scheduleB.add( new Schedule("Movement to Eating Area", "9:30 - 9:40 AM", "Day 1" ));
        scheduleB.add( new Schedule("AM Snacks", "9:40 - 9:50 AM", "Day 1" ));
        scheduleB.add( new Schedule("Movement to Classrooms", "9:50 - 10:00 AM", "Day 1" ));
        scheduleB.add( new Schedule("Getting to know you Activities\n" +
                "Institutional Video", "10:00 - 10:30 AM", "Day 1" ));
        scheduleB.add( new Schedule("Academic Concerns", "10:40 - 12:00 PM", "Day 1" ));
        scheduleB.add( new Schedule("Movement to Eating Area", "12:00 - 12:10 PM", "Day 1" ));
        scheduleB.add( new Schedule("Lunch", "12:10 - 1:00 PM", "Day 1" ));
        scheduleB.add( new Schedule("Movement to Campus Tour", "1:00 - 1:10 PM", "Day 1" ));
        scheduleB.add( new Schedule("Campus Tour\n" +
                "NFC, DTW, SHAS, Collection", "1:10 – 2:30 PM", "Day 1" ));
        scheduleB.add( new Schedule("Movement to Classrooms", "2:30 – 2:40 PM", "Day 1" ));
        scheduleB.add( new Schedule("Introduction to the Lasallian Formation\n" +
                "and Action Framework", "2:40 – 3:10 PM", "Day 1" ));
        scheduleB.add( new Schedule("Counseling and Career Services", "3:10 – 3:40 PM", "Day 1" ));
        scheduleB.add( new Schedule("Synthesis/Recap", "3:40 – 4:00 PM", "Day 1" ));


        //Day Two
        scheduleB.add( new Schedule("Registration", "7:00 - 8:00 AM", "Day 2"));
        scheduleB.add( new Schedule("Prayer Services", "8:00 - 8:15 AM", "Day 2"));
        scheduleB.add( new Schedule("DO Module", "8:15 - 9:45 AM", "Day 2"));
        scheduleB.add( new Schedule("Movement to eating area", "9:45 – 9:55 AM", "Day 2"));
        scheduleB.add( new Schedule("AM Snacks", "9:55 - 10:05 AM", "Day 2"));
        scheduleB.add( new Schedule("Movement to Classrooms", "10:05 - 10:15 AM", "Day 2"));
        scheduleB.add( new Schedule("Lasallian Module", "10:15 - 11:45 PM", "Day 2"));
        scheduleB.add( new Schedule("Movement to Eating Area", "11:45 - 12:00 PM", "Day 2"));
        scheduleB.add( new Schedule("Lunch", "12:00 - 1:10 PM", "Day 2"));
        scheduleB.add( new Schedule("Movement to HSSH Grounds", "1:10 - 1:30 PM", "Day 2"));
        scheduleB.add( new Schedule("LAMBS Sponsors Program", "1:30 - 2:00 PM", "Day 2"));
        scheduleB.add( new Schedule("Learning The Alma Mater Song\n" +
                "Teaching of Lasallian Cheers", "2:00 - 2:40 PM", "Day 2"));
        scheduleB.add( new Schedule("CAO Presentation", "2:40 - 3:20 PM", "Day 2"));
        scheduleB.add( new Schedule("LPEP Party Celebration", "3:20 - 3:50 PM", "Day 2"));
        scheduleB.add( new Schedule("Movement to CSO Tour", "3:50 - 4:00 PM", "Day 2"));
        scheduleB.add( new Schedule("CSO Tour", "4:00 - 5:00 PM", "Day 2"));



    }

    public ArrayList<Schedule> getScheduleA(String day) {
        ArrayList<Schedule> temp = new ArrayList<>();
        for(Schedule s : scheduleA){
            if( s.getLabel().equalsIgnoreCase(day) ){
                temp.add(s);
            }
        }
        return temp;
    }

    public ArrayList<Schedule> getScheduleB(String day) {
        ArrayList<Schedule> temp = new ArrayList<>();
        for(Schedule s : scheduleB){
            if( s.getLabel().equalsIgnoreCase(day) ){
                temp.add(s);
            }
        }
        return temp;
    }
}
