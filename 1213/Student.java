/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancelab;
import java.util.*;
/**
 *
 * @author kevenleon
 */
public class Student extends Person{
    //FIELDS
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;
    
    //CONSTRUCTOR
    public Student(String fn, String ln, int iD, String maj, double ga, int cred){
        super (fn,ln, iD);
        major = maj;
        gpa = ga;
        credits = cred;
        balance = 0;
        enrolledCourses = new ArrayList();
                
    }

    //GETTERS
    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }
    
    //Setters

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addCourse(String course) {
        enrolledCourses.add(course);
    }
    
    public boolean dropCourse(String course){
        return enrolledCourses.remove(course);
    }
    
    //METHODS
    @Override
    public void display(){
        super.display();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa + "\tCredits Applied: " + credits);
        System.out.println("Enrolled Courses:");
        
        for (String course: enrolledCourses){
            System.out.println("\t" + course);
        }
    }
    
    @Override
    public String toString(){
        return "Student - " + this.getFirstName() + " " + this.getLastName();
    }
    
    
}
