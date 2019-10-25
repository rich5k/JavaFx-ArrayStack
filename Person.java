/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richard_anatsui
 */
public class Person {
     public static enum Gender{MALE, FEMALE};
    private String name;
    private Gender gender;
    private int age;
    
    //default constructor that sets the name instance variable to "No name yet" and the age variable to zero
    public Person(){
        this.name= "No name yet";
        this.age = 0;
        this.gender= Gender.FEMALE;
    }
    
    public Person(String name, Gender gender, int age){
        this.name= name;
        this.age= age;
        this.gender=gender;
    }
    
    public String getName(){
        return this.name;
    }
    
     public int getAge(){
        return this.age;
    }
    
      public Gender getGender(){
        return this.gender;
    }
      
      public void setName(String n){
          this.name=n;
      }
      
      public void setName(String first, String last){
          name=first+" "+ last;
      }
      
      public void incrementAge(){
          this.age++;
      }
}
