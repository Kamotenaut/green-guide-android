package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.NameTag;

import java.util.ArrayList;

public class CSOOrganizations {

    private static CSOOrganizations instance = null;

    private ArrayList<NameTag> probe;
    private ArrayList<NameTag> cap;
    private ArrayList<NameTag> engage;
    private ArrayList<NameTag> aso;
    private ArrayList<NameTag> aspire;
    private ArrayList<NameTag> gso;

    private CSOOrganizations(){
        insertProbe();
        insertCap();
        insertEngage();
        insertAso();
        insertAspire();
    }

    public static CSOOrganizations getInstance(){
        if(instance == null){
            instance = new CSOOrganizations();
        }
        return instance;
    }

    private void insertProbe(){
        probe = new ArrayList<>();

        probe.add(new NameTag("AdCreate Society"));
        probe.add(new NameTag("Business Management Society (BMS)"));
        probe.add(new NameTag("Economics NameTag (EconOrg)"));
        probe.add(new NameTag("Junior Entrepreneurs Marketing Association (JEMA)"));
        probe.add(new NameTag("Junior Philippine Institute of Accountants (JPIA)"));
        probe.add(new NameTag("Ley La Salle (LSS)"));
        probe.add(new NameTag("Management of Financial Institution Association (MaFIA)"));
        probe.add(new NameTag("Young Entrepreneurs Society (YES)"));
    }

    public ArrayList<NameTag> getProbe() {
        return probe;
    }

    private void insertCap(){
        cap = new ArrayList<>();

        cap.add(new NameTag("The NameTag for American Studies Students (AMSTUD)"));
        cap.add(new NameTag("Behavioral Sciences Society (BSS)"));
        cap.add(new NameTag("Dalubhasaan ng mga Umuusbong na Mag-aaral ng Araling Filipino (DANUM)"));
        cap.add(new NameTag("European Studies Association (ESA)"));
        cap.add(new NameTag("Sociedad de Historia (SDH)"));
        cap.add(new NameTag("Samahan ng Lasalyanong Pilosopo (DLSU Pilosopo)"));
        cap.add(new NameTag("Nihon Kenkyuu Kai (NKK)"));
        cap.add(new NameTag("Political Science Society (POLISCY)"));
        cap.add(new NameTag("Samahan ng mga Mag-aaral sa Sikolohiya (SMS)"));
        cap.add(new NameTag("Team Communications (TEAMCOMM)"));
        cap.add(new NameTag("Kapatiran ng Kabataan para sa Kaunlaran (KKK)"));
        cap.add(new NameTag("Cultura"));
    }

    public ArrayList<NameTag> getCap() {
        return cap;
    }

    private void insertEngage(){
        engage = new ArrayList<>();

        engage.add(new NameTag("Association of Computer Engineering Students (ACCESS)"));
        engage.add(new NameTag("Chemical Engineering Society (ChEn)"));
        engage.add(new NameTag("Civil Engineering Society (CES)"));
        engage.add(new NameTag("Electronics and Communications Engineering Society (ECES)"));
        engage.add(new NameTag("Industrial Management Engineering Society (IMES)"));
        engage.add(new NameTag("Mechanical Engineering Society (MES)"));
        engage.add(new NameTag("Society of Manufacturing Engineering (SME)"));
    }

    public ArrayList<NameTag> getEngage() {
        return engage;
    }

    private void insertAso(){
        aso = new ArrayList<>();

        aso.add(new NameTag("Chemistry Society (ChemSoc)"));
        aso.add(new NameTag("Mathematics Circle (Math Circle)"));
        aso.add(new NameTag("Physics Society (PhySoc)"));
        aso.add(new NameTag("Societas Vitae (SV)"));
    }

    public ArrayList<NameTag> getAso() {
        return aso;
    }

    private void insertAspire(){
        aspire = new ArrayList<>();

        aspire.add(new NameTag("La Salle Computer Society (LSCS)"));
        aspire.add(new NameTag("Union of Students Inspired Towards Education (UNITED)"));
        aspire.add(new NameTag("DLSU Filipino & Chinese NameTag (ENGLICOM)"));
        aspire.add(new NameTag("Rotaract Club of DLSU (ROTARACT)"));
        aspire.add(new NameTag("United International Student NameTag (UNISTO)"));
        aspire.add(new NameTag("AISEC-DLSU"));
        aspire.add(new NameTag("Moomedia"));
        aspire.add(new NameTag("Outdoor Club (OC)"));
        aspire.add(new NameTag("Writers’ Guild (WG)"));
        aspire.add(new NameTag("De La Salle University – Environmental Conservation NameTag (ECO)"));
        aspire.add(new NameTag("Gakuen Anime Soshiki (GAS – School of Anime NameTag)"));
    }

    public ArrayList<NameTag> getAspire() {
        return aspire;
    }
}
