package com.greenguide.dlsu.greenguide.data.model;

import java.util.ArrayList;

public enum OfficeType {

    ADMIN("Central Administration"),
    CED("Br. Andrew Gonzalez FSC College of Education"),
    COB("Ramon V. Del Rosario College of Business"),
    SOE("School of Economics"),
    CCS("College of Computer Studies"),
    CLA("College of Liberal Arts"),
    COE("Gokongwei College of Engineering"),
    COS("College of Science"),
    LAW("College of Law"),
    SAO("Student Affairs Offices");

    private final String office;

    private OfficeType( String office ){
        this.office = office;
    }

    public String getType(){
        return office;
    }

}
