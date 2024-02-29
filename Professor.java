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
public class Professor extends Person{
    //FIELDS
    private String department;
    private double salary;
    private ArrayList<Student> advisees;
    
    //CONSTRUCTOR
    public Professor(String fn, String ln, int iD, String dept, double sal){
        super (fn,ln, iD);
        department = dept;
        salary = sal;
        advisees = new ArrayList();
    }
    
    //GETTERS
    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<Student> getAdvisees() {
        return advisees;
    }
    
    //SETTERS
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void addAdvisee(Student p) {
        advisees.add(p);
    }
    //METHODS
    public boolean removeAdvisee(int iD){
        for (Student through: advisees){
            Student currentAdvisee = through;
            if (through.getId() == iD){
                return advisees.remove(through);
            }
        }
        return false;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Advisees:");
        
        for (Student advisee: advisees){
            System.out.println("\t" + advisee.getFirstName() + " " + advisee.getLastName());
        }
    }
    
    @Override
    public String toString(){
        return "Professor - " + this.getFirstName() + " " + this.getLastName();
    }
    
}//end class
