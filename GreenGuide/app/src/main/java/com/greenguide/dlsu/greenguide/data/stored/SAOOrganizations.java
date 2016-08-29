package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.NameTag;

import java.util.ArrayList;

public class SAOOrganizations {

    private static SAOOrganizations instance = null;

    private ArrayList<NameTag> cosca;
    private ArrayList<NameTag> cao;
    private ArrayList<NameTag> sdfo;
    private ArrayList<NameTag> lspo;
    private ArrayList<NameTag> occs;
    private ArrayList<NameTag> osd;
    private ArrayList<NameTag> slife;
    private ArrayList<NameTag> smo;



    private SAOOrganizations(){
        insertCosca();
        insertCao();
        insertSDFO();
        insertLSPO();
        insertOccs();
        insertOsd();
        insertSlife();
        insertSmo();
    }

    public static SAOOrganizations getInstance(){
        if(instance == null){
            instance = new SAOOrganizations();
        }
        return instance;
    }

    private void insertCosca(){
        cosca = new ArrayList<>();

        cosca.add(new NameTag("Center for Social Concern and Action (COSCA-LOVE)"));
        cosca.add(new NameTag("LasALLIANCE for Peace (LFP)"));

    }

    public ArrayList<NameTag> getCosca() {
        return cosca;
    }

    private void insertCao(){
        cao = new ArrayList<>();

        cao.add(new NameTag("Student Artists Managers (SAM)"));
        cao.add(new NameTag("DLSU Chorale"));
        cao.add(new NameTag("Lasallian Youth Orchestra"));
        cao.add(new NameTag("De La Salle Innersoul"));
        cao.add(new NameTag("Harlequin Theatre Guild"));
        cao.add(new NameTag("La Salle Dance Company – Contemporary"));
        cao.add(new NameTag("La Salle Dance Company – Folk"));
        cao.add(new NameTag("La Salle Dance Company – Street"));
        cao.add(new NameTag("Green Media Group (CAO)"));
    }

    public ArrayList<NameTag> getCao() {
        return cao;
    }

    private void insertSDFO(){
        sdfo = new ArrayList<>();

        sdfo.add(new NameTag("SDFO Paragons"));
        sdfo.add(new NameTag("Student Discipline Board Student Representatives Pool"));
    }

    public ArrayList<NameTag> getSdfo() {
        return sdfo;
    }

    private void insertLSPO(){
        lspo = new ArrayList<>();

        lspo.add(new NameTag("Christ’s Youth in Action"));
        lspo.add(new NameTag("De La Salle University – Student Catholic Action"));
        lspo.add(new NameTag("Spirit of Faith Community"));
        lspo.add(new NameTag("Student Lasallian Animators"));
        lspo.add(new NameTag("Youth for Christ"));
        lspo.add(new NameTag("Youth for Family and Life"));
        lspo.add(new NameTag("Catholic Religious Organizations on Students"));
        lspo.add(new NameTag("Servers of the Blessed Sacrament"));
    }

    public ArrayList<NameTag> getLspo() {
        return lspo;
    }

    private void insertOccs(){
        occs = new ArrayList<>();

        occs.add(new NameTag("Peer Facilitators"));
        occs.add(new NameTag("Student Representatives"));
    }

    public ArrayList<NameTag> getOccs() {
        return occs;
    }

    private void insertOsd(){
        osd = new ArrayList<>();

        osd.add(new NameTag("La Salle Sports Commission"));
        osd.add(new NameTag("DLSU Archery Club"));
        osd.add(new NameTag("DLSU Capoeira Club"));
        osd.add(new NameTag("DLSU Dragon Boat Team"));
        osd.add(new NameTag("DLSU Brazilian Jiu Jitsu"));
        osd.add(new NameTag("DLSU Karatedo Society"));
        osd.add(new NameTag("DLSU Running Club"));
        osd.add(new NameTag("DLSU Golf Team"));
        osd.add(new NameTag("DLSU Wushu Club"));
        osd.add(new NameTag("Iron Works Club"));
        osd.add(new NameTag("DLSU Taekwondo Club"));
        osd.add(new NameTag("DLSU Judo Club"));
        osd.add(new NameTag("Animo Squad Varsity"));
        osd.add(new NameTag("Badminton Varsity"));
        osd.add(new NameTag("Baseball Varsity"));
        osd.add(new NameTag("Basketball Varsity"));
        osd.add(new NameTag("Chess Varsity"));
        osd.add(new NameTag("Fencing Varsity"));
        osd.add(new NameTag("Softball Varsity"));
        osd.add(new NameTag("Football Varsity"));
        osd.add(new NameTag("Judo Varsity"));
        osd.add(new NameTag("Lawn Tennis Varsity"));
        osd.add(new NameTag("Swimming Varsity"));
        osd.add(new NameTag("Table Tennis Varsity"));
        osd.add(new NameTag("Taekwondo Varsity"));
        osd.add(new NameTag("Track & Field"));
        osd.add(new NameTag("Volleyball Varsity"));
    }

    public ArrayList<NameTag> getOsd() {
        return osd;
    }

    private void insertSlife(){
        slife = new ArrayList<>();

        slife.add(new NameTag("Alyansang Tapat sa Lasalista (TAPAT)"));
        slife.add(new NameTag("Iisang Tugon sa Tawag ng Panahon (Santugon)"));
        slife.add(new NameTag("Commission on Elections (COMELEC)"));
        slife.add(new NameTag("Lasallian Ambassadors (LAmbs)"));
        slife.add(new NameTag("Student Co-Operatives (SCOOP)"));
    }

    public ArrayList<NameTag> getSlife() {
        return slife;
    }

    private void insertSmo(){
        smo = new ArrayList<>();

        smo.add(new NameTag("Student Media Council"));
        smo.add(new NameTag("Ang Pahayagang Plaridel"));
        smo.add(new NameTag("Archers Network"));
        smo.add(new NameTag("Green Giant FM"));
        smo.add(new NameTag("Green & White"));
        smo.add(new NameTag("Malate Literary Folio"));
        smo.add(new NameTag("The LaSallian"));
    }

    public ArrayList<NameTag> getSmo() {
        return smo;
    }
}
