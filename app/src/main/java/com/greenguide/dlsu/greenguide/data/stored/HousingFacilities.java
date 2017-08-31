package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.Address;

import java.util.ArrayList;

public class HousingFacilities {

    private static HousingFacilities instance = null;

    private ArrayList<Address> housingList;

    private HousingFacilities(){
        insertHousing();
    }

    public static HousingFacilities getInstance(){
        if(instance == null){
            instance = new HousingFacilities();
        }
        return instance;
    }

    private void insertHousing(){
        housingList = new ArrayList<>();

        housingList.add( new Address("@HomeDormtel",
                "2470 Del Carmen Street, Malate, Manila",
                "Marmi Grace O.Sutilo",
                "522 2913\n" +
                        "353 8315\n" +
                            "0915 407 9439",
                "http://athomedorm.wixsite.com/athome-dorm/contact\n" +
                        "https://www.facebook.com/athomedorm\n" +
                        "at_homedorm@yahoo.com"));

        housingList.add( new Address("CaraCeline Dormtel",
                "2450 Del Carmen Corner Kapitan Ticong St., Malate, Manila",
                "Geraldine Magallanes",
                "0998 559 0264\n" +
                        "0955 840 8029",
                "https://www.facebook.com/ccdorm/\n" +
                        "caracelinedorm@yahoo.com"));

        housingList.add( new Address("Homelike Ladies Dorm",
                "950 Kapitan Ticong St., Malate, Manila",
                "Rosa Bella Reyes",
                "525 1580\n" +
                        "0919 399 5501",
                        "https://www.facebook.com/pages/Homelike-Ladies-Dormitory/236647396412727"));

        housingList.add( new Address("Orlando Suites",
                "2489 Singalong cor. Estrada St., Malate, Manila",
                "Alfredo de Lima",
                "567 7677\n" +
                        "567 7678\n" +
                            "567 4470",
                "https://www.facebook.com/Orlando-Suites-Manila-186631001388947/"));

        housingList.add( new Address("Providence Tower Condominium",
                "2471 Leon Guinto St., Malate, Manila",
                "Lucita Vitas\n" +
                    "Susan Galvez",
                "664 3263\n" +
                        "524 4714\n" +
                        "0920 923 4322",
                "http://www.providencetowermanila.com/\n" +
                "https://www.facebook.com/Providence-Tower-52358686874/"));

        housingList.add( new Address("Residencia De Dios",
                "943 Estrada St., Malate, Manila",
                "Marina Butron\n" +
                        "Jenny Barrozo",
                "516 3380\n" +
                        "526 7876",
                "https://www.facebook.com/Residencia-de-Dios-239986576357877/\n" +
                        "residencia.dedios@yahoo.com"));

        housingList.add( new Address("Tahilan Residence and Study Center",
                "2396 Leon Guinto St., Malate, Manila",
                "Diana Rueda\n" +
                        "Marela Alinea\n" +
                            "Coleen Pangilinan",
                "525 7574\n" +
                        "0917 576 0959\n" +
                            "0917 713 0539",
                "tahilan@yahoo.com"));

        housingList.add( new Address("Torre Lorenzo 1",
                "2587 Taft Ave. cor. P. Ocampo St., Malate, Manila",
                "Raymond Salcedo",
                "400 01147\n" +
                        "0917 800 0182",
                "www.torrelorenzo.com"));

        housingList.add( new Address("University Pad",
                "912 P. Ocampo St., Malate, Manila",
                "Darwin Villanueva",
                "525 0001\n" +
                        "0917 566 3795",
                "www.universitypad.com.ph\n" +
                    "info@universitypad.com.ph"));
    }

    public ArrayList<Address> getHousingList() {
        return housingList;
    }
}
