/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FourthTask;

/**
 *
 * @author Cynthia
 */
public class BusinessCourse extends Course{
    private String internshipDuration;
    
    public BusinessCourse() {
       this.setName("");
       this.setID("");
       this.setTeacher2("");
       this.setDurationLetters("");
       this.internshipDuration="";
    }
    
    public BusinessCourse(String name, String ID, String teacher, String duration, String internshipduration) {
        this.setName(name);
        this.setID(ID);
        this.setTeacher2(teacher);
        this.setDurationLetters(duration);
        this.internshipDuration=internshipDuration;
    }
    
    public BusinessCourse(BusinessCourse copy) {
        this.setName(copy.getName());
        this.setID(copy.getID());
        this.setDurationNumbers(copy.getDuration());
        this.setTeacher2(copy.getTeacher());
    }
    
    public boolean compInternship(String internshipDuration) {
        int converter = Integer.parseInt(internshipDuration);
        if (converter>=15) {
            return true;
        }
        return false;
    }
    
    public BusinessCourse clone() {
        BusinessCourse clon;
        clon = new BusinessCourse();
        this.setName(clon.getName());
        this.setDurationNumbers(clon.getDuration());
        this.setID(clon.getID());
        this.setTeacher2(clon.getTeacher());
        return clon;
    }
    
    public String toString() {
        return "The student with name's " + this.getName() + ", has " + this.internshipDuration + " of internships";
    }
    
    public boolean equals(BusinessCourse comparation) {
        if (this.getName().equals(comparation.getName()) && this.getID().equals(comparation.getID()) && this.getTeacher().equals(comparation.getTeacher())) {
            if (this.getDuration()==comparation.getDuration()) {
                return true;
            }
        }
        return false;
    }
}

