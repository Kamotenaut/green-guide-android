package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.OfficeType;
import com.greenguide.dlsu.greenguide.data.model.Officers;

import java.util.ArrayList;

public class AdministrativeOffices {

    private static AdministrativeOffices instance = null;

    private ArrayList<Officers> adminList, collegeList;
    private ArrayList<String> colleges;

    private AdministrativeOffices(){
        insertAdmin(); insertColleges();
    }

    public static AdministrativeOffices getInstance(){
        if( instance == null ) {
            instance = new AdministrativeOffices();
        }
        return instance;
    }

    private void insertAdmin(){
        adminList = new ArrayList<>();

        adminList.add(new Officers("Br. Raymundo B. Suplido FSC", "President", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("Dr. Gerardo C. Janairo", "Chancellor", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("Dr. Robert  C. Roleda", "Vice Chancellor for Academics (VCA)", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("Br. Michael J. Broughton FSC","Vice President for Lasalian Mission (VPLM)", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("Dr. Raymond Girard Tan","Vice Chancellor for Research and Innovation (VCRI) ", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("", "Vice Chancellor for Administration", OfficeType.ADMIN.getType()));
        adminList.add(new Officers("Dr. Gil Nonato C. Santos", "Vice Chancellor for DLSU-STC", OfficeType.ADMIN.getType()));
    }

    public ArrayList<Officers> getAdmin(){
        return adminList;
    }

    private void insertColleges(){
        collegeList = new ArrayList<>();
        colleges = new ArrayList<>();

        //Br. Andrew Gonzalez FSC College of Education
        colleges.add(OfficeType.CED.getType());
        collegeList.add(new Officers("Dr. Voltaire M. Mistades", "Dean", OfficeType.CED.getType()));
        collegeList.add(new Officers("Dr. Aireen B. Arnuco", "Vice Dean", OfficeType.CED.getType()));

        //Ramon V. Del Rosario College of Business
        colleges.add(OfficeType.COB.getType());
        collegeList.add(new Officers("Dr. Brian C. Gozun", "Dean", OfficeType.COB.getType()));
        collegeList.add(new Officers("Atty. Henry Caraan", "Vice Dean", OfficeType.COB.getType()));

        //School of Economics
        colleges.add(OfficeType.SOE.getType());
        collegeList.add(new Officers("Dr. Marites M. Tiongco", "Dean", OfficeType.SOE.getType()));
        collegeList.add(new Officers("Dr. Mitzie Conchada", "Vice Dean", OfficeType.SOE.getType()));

        //College of Computer Studies
        colleges.add(OfficeType.CCS.getType());
        collegeList.add(new Officers("Dr. Merlin Teodosia C. Suarez", "Dean", OfficeType.CCS.getType()));
        collegeList.add(new Officers("Dr. Nelson Marcos", "Vice Dean", OfficeType.CCS.getType()));

        //College of Liberal Arts
        colleges.add(OfficeType.CLA.getType());
        collegeList.add(new Officers("Dr. Julio C. Teehankee", "Dean", OfficeType.CLA.getType()));
        collegeList.add(new Officers("Ms. Fides A. del Castillo", "Vice Dean", OfficeType.CLA.getType()));

        //Gokongwei College of Engineering
        colleges.add(OfficeType.COE.getType());
        collegeList.add(new Officers("Dr. Jonathan R. Dungca", "Dean", OfficeType.COE.getType()));
        collegeList.add(new Officers("Mr. Dennis Cruz", "Vice Dean", OfficeType.COE.getType()));

        //College of Science
        colleges.add(OfficeType.COS.getType());
        collegeList.add(new Officers("Dr. Jose Santos R. Carandang VI", "Dean", OfficeType.COS.getType()));
        collegeList.add(new Officers("Dr. Derrick Ethelbert C. Yu", "Vice Dean", OfficeType.COS.getType()));

        //College of Law
        colleges.add(OfficeType.LAW.getType());
        collegeList.add(new Officers("Atty. Jose Manuel I. Diokno", "Dean", OfficeType.LAW.getType()));
        collegeList.add(new Officers("Atty. Antonio P. Jamon, Jr.", "Vice Dean", OfficeType.LAW.getType()));
    }

    public ArrayList<Officers> getOfficers(String college){
        ArrayList<Officers> temp = new ArrayList<>();

        for( Officers o : collegeList ){
            if( o.getOffice().equalsIgnoreCase(college) )
                temp.add(o);
        }
        return temp;
    }

    public ArrayList<String> getColleges(){
        return colleges;
    }
}
