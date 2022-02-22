import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class CollegeRegistrar here.
 *
 * @author (Chiaha Christopher Izuchukwu)
 * @version (21st of February 2022)
 */
public class CollegeRegistrar
{
    private ArrayList<Registration> courseRegistrations;
    private Registration newRegistration;
    /**
     * Constructor for objects of class CollegeRegistrar
     */
    public CollegeRegistrar()
    {
        // initialise instance variables
        courseRegistrations = new ArrayList<Registration>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public void addRegistration(Registration newRegistration)
    {
        // put your code here
        courseRegistrations.add(newRegistration);
    }

    
    public void printAllRegistrations()
    {
        // prints for all registrations the corresponding info
        // registration records are separated by an empty line
            courseRegistrations.forEach((newRegistration) -> {
                newRegistration.printInfo();
            }
        );
    
    }
    
    
    public void printClassesForStudent(String student)
    {
        // prints all classes (course number and professor) in which the 
        // student is enrolled
        // one class per line
        courseRegistrations.stream().filter(s -> student.equals(s.getStudent())).forEach(s ->
            System.out.println("Course Number: " + s.getCourseNumber() + "Professor: " + s.getProfessor()));
        
    }
    
    public int getClassCountForStudent(String student)
    {
        // number of classes in which the student is enrolled
        long count = courseRegistrations.stream().filter(s -> student.equals(s.getStudent())).count();
            int integer = Math.toIntExact(count);
            return integer;
        
        
    }
    
    public void printClassesForStudentByProfessor(String student, String professor)
    {
        // prints all classes (course number and section) 
        // tought by professor and taken by student
        // one class per line
        courseRegistrations.stream().filter(s ->
        student.equals(s.getStudent()) && professor.equals(s.getProfessor())).forEach(s ->
        System.out.println("Course Number: "+s.getCourseNumber()+"\nSection: "+s.getSection())); 
        
    }
    
    public void printClassesForStudentInSlot(String student, int timeSlot)
    {
        // prints all classes (course number and section)
        // taken by student in timeSlot
        // one class per line
        courseRegistrations.stream().filter(s -> student.equals(s.getStudent()) &&
        timeSlot == s.getTimeSlot()).forEach(s -> System.out.println("Course Number: "+s.getCourseNumber()+"\nSection: "+s.getSection()));
    }
    
    public int getRegistrationsInClass(String classNumber)
    {
        // get the number of students registered in classNumber
        long count = courseRegistrations.stream().filter(s -> classNumber.equals(s.getCourseNumber())).count();
            int i = Math.toIntExact(count);
            return i;
    }
    
    public int getRegistrationsInClass(String classNumber, int timeSlot)
    {
        // get the number of students enrolled in classNumber and slot
         long counts = courseRegistrations.stream().filter(s->classNumber.equals(s.getCourseNumber())&&timeSlot==s.getTimeSlot()).count();
            int i = Math.toIntExact(counts);
            return i;
    }
    
    public int studentsTakingClassesInSlot(int timeSlot)
    {
        // get the number of students taking classes in timeSlot
        long count = courseRegistrations.stream().filter(s -> timeSlot == s.getTimeSlot()).count();
            int i = Math.toIntExact(count);
            return i;
    }
    
    public void dropClassForStudent(String classNumber, String student)
    {
        // drops class classNumber for student
        courseRegistrations.removeIf(s ->
        student.equals(s.getStudent()) && classNumber.equals(s.getCourseNumber()));
    }
    
    public void dropAllClassesForStudent(String student)
    {
        // drops all classes for student
        courseRegistrations.removeIf(s ->
        student.equals(s.getStudent()));
    }
    
    
    /**
    @author (Joshua Kattapuram)
    @version (16th of February, 2022)
    */
    
    public void populateRegistrations(String courseNumber, int section, int slot,
    String student,String professor)
    {
        addRegistration(new Registration("COMP 1501", 0, 12, "Richard J.", "Karteek P."));
        addRegistration(new Registration("COMP 2704", 1, 12, "Richard J.", "Olivia S."));
        addRegistration(new Registration("PHYS 2377", 2, 12, "Richard J.", "Robert G."));
        addRegistration(new Registration("CHEM 4927", 0, 12, "Richard J.", "Gloriatine J."));
        addRegistration(new Registration("COMP 3444", 1, 12, "Richard J.", "Samuel F."));
        
        addRegistration(new Registration("COMP 1501", 0, 12, "Gordon R.", "Karteek P."));
        addRegistration(new Registration("COMP 2704", 0, 12, "Gordon R.", "Randolph Q."));
        addRegistration(new Registration("PHYS 2377", 1, 12, "Gordon R.", "Robert D."));
        addRegistration(new Registration("CHEM 4927", 2, 12, "Gordon R.", "Mary J."));
        addRegistration(new Registration("COMP 3444", 2, 12, "Gordon R.", "Peter P."));
        
        addRegistration(new Registration("COMP 1501", 1, 12, "Sasuke U.", "Vinicius E."));
        addRegistration(new Registration("COMP 2704", 0, 12, "Sasuke U.", "Randolph Q."));
        addRegistration(new Registration("PHYS 2377", 1, 12, "Sasuke U.", "Robert D."));
        addRegistration(new Registration("CHEM 4927", 0, 12, "Sasuke U.", "Gloriatine J."));
        addRegistration(new Registration("COMP 3444", 0, 12, "Sasuke U.", "Chad B."));
        
        addRegistration(new Registration("COMP 1501", 1, 12, "Sasuke U.", "Vinicius E."));
        addRegistration(new Registration("COMP 2704", 0, 12, "Sasuke U.", "Randolph Q."));
        addRegistration(new Registration("PHYS 2377", 1, 12, "Sasuke U.", "Robert D."));
        addRegistration(new Registration("CHEM 4927", 2, 12, "Gordon R.", "Mary J."));
        addRegistration(new Registration("COMP 3444", 2, 12, "Gordon R.", "Peter P.")); 
        
        addRegistration(new Registration("ENGL 2201", 2, 12, "Vidhi T.", "Adam S."));
        addRegistration(new Registration("CHEM 3060", 1, 12, "Vidhi T.", "Tom C."));
        addRegistration(new Registration("PHYS 2344", 2, 12, "Vidhi T.", "Tony S."));
        addRegistration(new Registration("ENGL 2005", 0, 12, "Vidhi T.", "Samantha W."));
        addRegistration(new Registration("CHEM 4927", 2, 12, "Vidhi T.", "Mary J."));
        
        addRegistration(new Registration("COMP 3444", 1, 12, "Sarah E.", "Samuel F."));
        addRegistration(new Registration("COMP 2704", 1, 12, "Sarah E.", "Olivia S."));
        addRegistration(new Registration("CHEM 3060", 1, 12, "Sarah E.", "Tom C."));
        addRegistration(new Registration("PHYS 2344", 2, 12, "Sarah E.", "Tony S."));
        addRegistration(new Registration("ENGL 2005", 0, 12, "Sarah E.", "Samantha W."));
        
    }
    
    public void authorInfo()
    {
        System.out.println("Method Author Info:");
        System.out.println("");
        System.out.println("populateRegistrations: Joshua Kattapuram.");
        //you guys can add your stuff here too.
        System.out.println("");
        System.out.println("verifyCourseNumber, verifySection, verifySlot, printInfo: Keagan Crane");
        System.out.println("");
        System.out.println("All methods in collegeRegistrar except from populateRegistrations: Chiaha Christopher Izuchukwu");
       

    }
}
