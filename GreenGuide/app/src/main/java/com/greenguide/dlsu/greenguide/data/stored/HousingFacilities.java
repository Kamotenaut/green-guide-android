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

        housingList.add( new Address("University Pad",
                "912 P. Ocampo St., Malate, Manila",
                "Ms. Marilyn Avila",
                "525-0001\n" +
                "0917-566- 3795",
                "www.universitypad.com.ph;\n" +
                "info@universitypad.com.ph"));

        housingList.add( new Address("Torre Lorenzo 2",
                "2426 Taft Avenue, Manila",
                "Aika Nicolas",
                "400 0131\n" +
                "0917 504 9023",
                "www.torrelorenzo2.com"));

        housingList.add( new Address("WWW Residences",
                "909 Estrada St. corner Leon Guinto St. Malate, Manila",
                "Gilbert Lorenzo\n" +
                "Maribeth Chiang",
                "523 7974\n" +
                "866 4226\n" +
                "0905 334 3061",
                "wwwresidencestaft@gmail.com"));

        housingList.add( new Address("Bellagio",
                "2450 L. Guinto St., Malate, Manila",
                "Mary Ann Tero",
                "523-0345\n" +
                "216 0370\n" +
                "0917 811 0839\n" +
                "0917 374 0963",
                "bellagio_residences@yahoo.com\n" +
                "FB Account: Bellagio Residences"));

        housingList.add( new Address("University College Residence",
                "1052 Estrada St. cor. Arellano Ave., Malate, Manila",
                "Jaz Daiz",
                "521-1951\n" +
                "521 1954\n" +
                "0905 667 6712",
                ""));

        housingList.add( new Address("Residencia De Dios",
                "943 Estrada St., Malate, Manila",
                "Marie Butron",
                "526-7876\n" +
                "0905 782 7906",
                "residencia.dedios@yahoo.com"));

        housingList.add( new Address("Tahilan Residence and Study Center",
                "2396 Leon Guinto Street, Malate, Manila",
                "Rita Esguerra\n" +
                "Bernadette Balon",
                "525-7574\n" +
                "0915-644- 1456",
                "tahilan@yahoo.com"));

        housingList.add( new Address("@HomeDormtel",
                "2470 Del Carmen Street, Malate. Manila",
                "Marmi Grace O.Sutilo",
                "522-2913\n" +
                "353-8315",
                "athomedorm.wix.com\n" +
                "at_homedorm@yahoo.com\n" +
                "https://www.facebook.com/athomedorm"));

        housingList.add( new Address("One Archer’s Place",
                "Castro St. cor. F. Reyes Malate, Manila",
                "Liza Ebarte\n" +
                "Phamie Pastor",
                "0917 872 7193\n" +
                "0917-874- 9258",
                "www.onearchersplace.com"));

    }

    public ArrayList<Address> getHousingList() {
        return housingList;
    }
}
