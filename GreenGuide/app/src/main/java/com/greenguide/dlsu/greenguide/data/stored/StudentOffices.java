package com.greenguide.dlsu.greenguide.data.stored;

import com.greenguide.dlsu.greenguide.data.model.NameTag;
import com.greenguide.dlsu.greenguide.data.model.OfficeType;
import com.greenguide.dlsu.greenguide.data.model.Officers;

import java.util.ArrayList;

public class StudentOffices {

    private static StudentOffices instance = null;

    private ArrayList<Officers> usgEB;
    private ArrayList<Officers> collegeGov;
    private ArrayList<NameTag> programs;

    private StudentOffices(){
        insertUsgEb(); insertCollegeGov(); insertPrograms();
    }

    public static StudentOffices getInstance(){
        if( instance == null ){
            instance = new StudentOffices();
        }
        return instance;
    }

    private void insertUsgEb(){
        usgEB = new ArrayList<>();

        usgEB.add(new Officers("Zedrick Laqui", "USG President"));
        usgEB.add(new Officers("Karl Ong", "Vice President for Internal Affairs"));
        usgEB.add(new Officers("Reigner Sanchez", "Vice President for External Affairs"));
        usgEB.add(new Officers("Monica Otayza", "Executive Secretary"));
        usgEB.add(new Officers("Brian Chen", "Executive Treasurer"));
    }

    public ArrayList<Officers> getUsgEB(){
        return usgEB;
    }

    private void insertCollegeGov(){
        collegeGov = new ArrayList<>();

        collegeGov.add(new Officers("Jorge Francisco", "Computer Studies Government (CSG)", OfficeType.CCS.getType()));
        collegeGov.add(new Officers("Celina Cruz", "College Government of Education (CGE)", OfficeType.CED.getType()));
        collegeGov.add(new Officers("Gabrielle Perez", "Arts College Government (ACG)", OfficeType.CLA.getType()));
        collegeGov.add(new Officers("Rizza Tan", "Business College Government (BCG)", OfficeType.COB.getType()));
        collegeGov.add(new Officers("Justine Basco", "College of Engineering Government (ECG)", OfficeType.COE.getType()));
        collegeGov.add(new Officers("Kyle Junsay", "Science College Government (SCG)", OfficeType.COS.getType()));
        collegeGov.add(new Officers("Chloe Cheng", "School of Economics Government (SEG)", OfficeType.SOE.getType()));
        collegeGov.add(new Officers("Kristian Sisayan", "Science and Technology Complex Government (STCG)", OfficeType.STC.getType()));

    }

    public ArrayList<Officers> getCollegeGov(){
        return collegeGov;
    }

    private void insertPrograms(){
        programs = new ArrayList<>();

        programs.add(new NameTag("Student Sectors Townhall Meetings", "Townhall meetings by the Office of the President shall invite all student sectors to communicate their plans to the student body. Moreover, as an initiative to promote transparency, the USG will also provide reports on performance milestones, operational difficulties, and plan adjustments that are relevant to the student body."));
        programs.add(new NameTag("One in Service, One La Salle", "Service should always be part of our Lasallian identity. OPRES will be lobbying for socio-civic activities through volunteering for NGOs and other beneficiaries to encourage Lasallians to continue contributing to different communities."));
        programs.add(new NameTag("Student Services Central", "This project aims to raise awareness on the various on-campus student services offered, both by the USG and the University. This will be a one-stop online platform, which will feature information and instructions, as well as feedback and query systems on the different services."));
        programs.add(new NameTag("Pahiram Payong and Pahiram Libro", "A program that allows students to borrow an umbrella, free of charge from North Gate, Agno Gate, and Br. Andrew Gonzalez FSC Hall in the Taft Campus and East Wing Canopy in the Science and Technology Complex, and borrow textbooks for one whole term, free of charge. Book reservation is done via www.dlsu-usg.com during specified dates announced by the USG."));
        programs.add(new NameTag("Study Tour", "Once we finish our undergraduate degree in the University, pursuing further studies could be an option. By maximizing the partnerships of DLSU with other universities, a study tour abroad will be made available for the students. This is to see for themselves different opportunities abroad where they can pursue graduate studies."));
        programs.add(new NameTag("Social Conversations", "The goal of this program is to give the greater population an opportunity to speak out their hearts and minds about specific issues and advocacies in an environment that respects different points of view. All the outputs from these conversations will be the guide of the USG in being at the forefront of service for the nation."));
        programs.add(new NameTag("USG Student’s Hub", "The utilization of the USG website (www.dlsu-usg.com) as a go-to portal wherein students are able to find all announcements, list of initiatives, schedules, and other important information from different sectors in the university, as well as a USG documents and resolutions database for easier access of the students."));
        programs.add(new NameTag("USG Text Messaging System", "An SMS-based announcement system that will allow you to receive text messages about important information such as suspension of classes and schedule of enrollment."));
        programs.add(new NameTag("Online Payment of Tuition Fees", "The Office of the Executive Treasurer will push to make this method of payment available in DLSU, to bring more convenience to the students during enrolment season."));
        programs.add(new NameTag("Student Financial Assistance Program", "There are students in DLSU who are in need of assistance with regards to their food and school requirements, and the Office of the Executive Treasurer will be providing assistance to students who need them."));
    }

    public ArrayList<NameTag> getPrograms() {
        return programs;
    }
}
