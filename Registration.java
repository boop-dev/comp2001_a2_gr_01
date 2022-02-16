
/**
 * Write a description of class Enrollment here.
 *
 * @author (Keagan Crane)
 * @version (16th of February, 2022)
 */
public class Registration
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private int section;
    private int timeSlot;
    private String student;
    private String professor;

    /**
     * Constructor for objects of class Registration
     */
    public Registration(String courseNumber, int section, int slot, 
                      String student,String professor)
    {
        // initialise instance variables
        courseNumber = courseNumber;
        section = section;
        timeSlot = slot;
        student = student;
        professor = professor;
        
    }
    
    /**
     * verifyCourseNumber will check the inputted course number to see if it is
     * one of the accepted course numbers
     */
    private boolean verifyCourseNumber(String courseNumber)
    {
        if (courseNumber == "COMP 1501") {
            return true;
        }
        else if(courseNumber == "ENGL 2201") {
            return true;
        }
        else if(courseNumber == "CHEM 3060") {
            return true;
        }
        else if(courseNumber == "PHYS 2344") {
            return true;
        }
        else if(courseNumber == "ENGL 2005") {
            return true;
        }
        else if(courseNumber == "COMP 2704") {
            return true;
        }
        else if(courseNumber == "PHYS 2377") {
            return true;
        }
        else if(courseNumber == "CHEM 4927") {
            return true;
        }
        else if(courseNumber == "COMP 3444") {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * verifySection will check to see if the inputted section is between 0 and 2
     */
    private boolean verifySection(int section)
    {
        if (section >= 0 && section <= 2 ) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    /**
     * verifySlot will check to see if the inputted slot is between 12 and 25
     */
    private boolean verifySlot (int slot)
    {
        if (timeSlot >= 12 && timeSlot <= 25) {
            return true;
        }
        
        else {
            return false;
        }
    }

   public void printInfo()
   {
       // print all the information about the enrollment record
       // each field on a new line
       
   }
    
}
