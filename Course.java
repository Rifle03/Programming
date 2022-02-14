/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FourthTask;

/**
 *
 * @author cynthia
 */
public class Course {
    private String name;
    private String ID;
    private int duration;
    private String teacher;
    
    
    public void setName(String name) {
        if (compName(name)) {
            this.name=name;
        } else {
            System.err.println("ERROR. Name needs more letters");
        }
    }
    
    private boolean compName(String name) {
        if (name.length()<4) {
            return false;
        }
        
        return true;
    }
    
    public void setTeacher(String name, String surname, String surname2) {
        teacher = name + ", " + surname + ", " + surname2;
    }
    
    public void setTeacher2(String teacher) {
        if (teacher.contains(" ")) {
            this.teacher = teacher.replace(" ", ",");
        } else {
            this.teacher = teacher;
        }
    }
    
    public void setID(String ID) {
        char course = name.charAt(0);
        String flteacher = teacher.substring(teacher.length() - 1);
        
        this.ID = course + ID + flteacher;
    }
    
    public void setDurationLetters(String duration) {
        int converter = Integer.parseInt(duration);
        if (converter<30) {
            System.err.println("ERROR. Each course lasts for at least 30 hours");
        } else {
            this.duration = converter;
        }
        
    }
    
    public void setDurationNumbers(int duration) {
        if (duration<30) {
            System.err.println("ERROR. Each course lasts for at least 30 hours");
        } else {
            this.duration = duration;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getID() {
        return ID;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String getTeacher() {
        return teacher;
    }
    
    public String toString() {
        return "The name of the course is " + this.name + ", with ID " + this.ID + ". The duration of the course is " + duration + ", and the teacher's name is " + teacher;
    }
    
    public Course clone() {
        Course clon;
        clon = new Course();
        clon.name=this.name;
        clon.ID=this.ID;
        clon.duration=this.duration;
        clon.teacher=this.teacher;
        
        return clon;
    }
    

    
    public boolean equals(Course comparation) {
        if (this.name.equals(comparation.name) && this.ID.equals(comparation.ID) && this.teacher.equals(comparation.teacher)) {
            if (duration==comparation.duration) {
                return true;
            }
        }
        return false;
    }
}
