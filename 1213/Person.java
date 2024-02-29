/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancelab;

/**
 *
 * @author kevenleon
 */
public class Person {
    private String firstName;
    private String lastName;
    private int id;
    
    public Person(String fn, String ln, int iD){
        firstName = fn;
        lastName = ln;
        id = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
    
    public void display(){
        System.out.println("Name: " + firstName + " " + lastName + "\n" + "ID: " + id);
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        
        if (this.getClass() != other.getClass()){
            return false;
        }
        
        return this.getId() == ((Person) other).getId();
    }
    
    
    
}
