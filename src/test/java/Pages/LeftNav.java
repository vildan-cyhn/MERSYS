package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

   public LeftNav(){PageFactory.initElements(WD.getDriver(),this);}

   @FindBy(xpath = "//span[text()='Dashboard ']")
   public WebElement dashboard;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "education"      : return this.education;
            case "eduSetup"       : return this.eduSetup;
            case "subjCat"        : return this.subjCat;
            case "setup"          : return this.setup;
            case "schoolSetup"    : return this.schoolSetup;
            case "locations"      : return this.locations;
            case "setupParameters": return this.setupParameters;
            case "nationalities"  : return this.nationalities;
            case "humanResources" : return this.humanResources;
            case "hrSetup"        : return this.hrSetup;
            case "attestations"   : return this.attestations;



        }return null;}

   //setup baslığı altındakiler*******************************************************************
   @FindBy(xpath = "(//span[text()='Setup'])[1]")
   public WebElement setup;

   @FindBy(xpath = "//span[text()='Parameters']")
   public WebElement setupParameters;

            @FindBy(xpath = "//span[text()='Countries']")
            public WebElement countries;

            @FindBy(xpath = "//span[text()='States']")
            public WebElement states;

            @FindBy(xpath = "//span[text()='Cities']")
            public WebElement cities;

            @FindBy(xpath = "//span[text()='Citizenships']")
            public WebElement citizenship;

            @FindBy(xpath = "//span[text()='Reasons for leaving']")
            public WebElement reasonLeaving;

            @FindBy(xpath = "//span[text()='Nationalities']")
            public WebElement nationalities;

            @FindBy(xpath = "//span[text()='Fees']")
            public WebElement fees;

            @FindBy(xpath = "//span[text()='Discounts']")
            public WebElement discounts;

            @FindBy(xpath = "//span[text()='Grade Levels']")
            public WebElement gradeLevels;

            @FindBy(xpath = "//span[text()='Document Types']")
            public WebElement documentTypes;

            @FindBy(xpath = "//span[text()='Bank Accounts']")
            public WebElement BankAccounts;

            @FindBy(xpath = "//span[text()='Fields']")
            public WebElement fields;

            @FindBy(xpath = "//span[text()='Field Settings']")
            public WebElement fieldSettings;

   @FindBy(xpath = "//span[text()='School Setup']")
   public WebElement schoolSetup;

            @FindBy(xpath = "//span[text()='Academic Calendar']")
            public WebElement academicCalendar;

            @FindBy(xpath = "//span[text()='Locations']")
            public WebElement locations;

            @FindBy(xpath = "//span[text()='Departments']")
            public WebElement departments;



   //messaging baslığı altındakiler****************************************************************
   @FindBy(xpath = "//span[text()='Messaging']")
   public WebElement messaging;

   @FindBy(xpath = "(//span[text()='Announcements'])[1]")
   public WebElement announcements;

   @FindBy(xpath = "//span[text()='Notifications']")
   public WebElement notifications;



   //entranceExams baslığı altındakiler************************************************************
   @FindBy(xpath ="(//span[text()='Entrance Exams'])[1]")
   public WebElement entranceExams;

   @FindBy(xpath ="(//span[text()='Setup'])[2]")
   public WebElement entSetup;

            @FindBy(xpath ="(//span[text()='Entrance Exams'])[2]")
            public WebElement entranceExamsSetUp;

            @FindBy(xpath ="//span[text()='Custom Field Group']")
            public WebElement customField;

   @FindBy(xpath ="//span[text()='Registration Approve']")
   public WebElement registerApprove;

   @FindBy(xpath ="//span[text()='Registration Complete']")
   public WebElement registerComplete;

   @FindBy(xpath ="//span[text()='Examination Result']")
   public WebElement examResult;



   //student baslığı altındakiler*******************************************************************
   @FindBy(xpath = "//span[text()='Student']")
   public WebElement student;

   @FindBy(xpath = "//span[text()='Student Groups']")
   public WebElement studentGroups;




   //humanResources baslığı altındakiler*********************************************************
   @FindBy(xpath = "//span[text()='Human Resources']")
   public WebElement humanResources;

   @FindBy(xpath = "(//span[text()='Setup'])[3]")
   public WebElement hrSetup;

           @FindBy(xpath = "//span[text()='Positions']")
           public WebElement positions;

           @FindBy(xpath = "//span[text()='Work Calendar']")
           public WebElement workCalender;

           @FindBy(xpath = "//span[text()='Attestations']")
           public WebElement attestations;

           @FindBy(xpath = "//span[text()='Position Categories']")
           public WebElement positionCat;

   @FindBy(xpath = "//span[text()='Employees']")
   public WebElement employees;

   @FindBy(xpath = "(//span[text()='Salary'])[1]")
   public WebElement salary;

           @FindBy(xpath = "//span[text()='Position Salary']")
           public WebElement positionsSalary;

           @FindBy(xpath = "//span[text()='Salary Modifiers']")
           public WebElement salaryModifiers;

           @FindBy(xpath = "(//span[text()='Salary Parameters'])[1]")
           public WebElement salaryParameters;

           @FindBy(xpath = "//span[text()='Salary Types']")
           public WebElement salaryTypes;

           @FindBy(xpath = "//span[text()='Notation Keys']")
           public WebElement notationKeys;

           @FindBy(xpath = "(//span[text()='Salary Parameters'])[2]")
           public WebElement salaryParameters2;

           @FindBy(xpath = "(//span[text()='Salary'])[2]")
           public WebElement salary2;




    //inventory baslığı altındakiler*************************************************************
   @FindBy(xpath ="(//span[text()='Inventory'])[1]")
   public WebElement inventory;

   @FindBy(xpath ="(//span[text()='Setup'])[4]")
   public WebElement inviSetup;

           @FindBy(xpath = "//span[text()='Item Categories']")
           public WebElement itemCategory;

           @FindBy(xpath = "//span[text()='Item Types']")
           public WebElement itemTypes;

           @FindBy(xpath = "(//span[text()='Inventory'])[2]")
           public WebElement inventory2;

   @FindBy(xpath ="//span[text()='Item Management']")
   public WebElement itemManage;




   //education baslığı altındakiler***************************************************************
   @FindBy(xpath = "//span[text()='Education']")
   public WebElement education;

   @FindBy(xpath = "(//span[text()='Setup'])[5]")
   public WebElement eduSetup;

           @FindBy(xpath = "//span[text()='Subject Categories']")
           public WebElement subjCat;

           @FindBy(xpath = "//span[text()='Grade Categories']")
           public WebElement gradeCat;

           @FindBy(xpath = "//span[text()='Grading Scheme']")
           public WebElement gradeScheme;

           @FindBy(xpath = "//span[text()='Grade Excuse Types']")
           public WebElement gradeExcuseTypes;

           @FindBy(xpath = "//span[text()='Education Standard']")
           public WebElement educationStnd;

   @FindBy(xpath = "//span[text()='Attendance']")
   public WebElement attendance;

           @FindBy(xpath = "//span[text()='Attendance By Class(Manager)']")
           public WebElement attByManager;

           @FindBy(xpath = "//span[text()='Attendance By Course(Teacher)']")
           public WebElement attByTeacher;

           @FindBy(xpath = "//span[text()='Class Attendance']")
           public WebElement classAtt;

           @FindBy(xpath = "//span[text()='Courses Attendance']")
           public WebElement CourseAtt;

           @FindBy(xpath = "//span[text()='Teacher Course Attendance']")
           public WebElement teacherCourseAtt;

           @FindBy(xpath = "//span[text()='Attendance Excuses (Teacher)']")
           public WebElement attExcuseTeacher;

    @FindBy(xpath = "//span[text()='Grading']")
   public WebElement grading;

           @FindBy(xpath = "//span[text()='Gradebook']")
           public WebElement gradeBook;

           @FindBy(xpath = "//span[text()='Transcript']")
           public WebElement transcript;

           @FindBy(xpath = "//span[text()='Course Term Grades']")
           public WebElement courseTermGrad;

           @FindBy(xpath = "//span[text()='Student Transcript']")
           public WebElement StudentTranscript;




   //incidents baslığı altındakiler*****************************************************************
   @FindBy(xpath ="//span[text()='Incidents']")
   public WebElement incidents;

   @FindBy(xpath ="(//span[text()='Setup'])[6]")
   public WebElement inciSetup;

           @FindBy(xpath = "//span[text()='Incident Location']")
           public WebElement inciLoc;

           @FindBy(xpath = "//span[text()='Involved Items']")
           public WebElement involvItems;

           @FindBy(xpath = "//span[text()='Incident Type']")
           public WebElement inciTypes;

   @FindBy(xpath ="//span[text()='Student Points']")
   public WebElement studentsPoint;

}
