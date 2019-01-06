import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
     public Student(String firstName,String lastName,int id,int[] testScores){
     super(firstName,lastName, id);
     this.testScores=testScores;
     }


    
    public char calculate(){
        
        int sum=0;
        int total=0;
        int n = testScores.length;
        char g = 0;
        for(int i=0;i<testScores.length;i++){
            total=total+ testScores[i];
        }
        sum = total/n;

        
        if(sum>=90 && sum <=100){
            g= 'O';
        }else if(sum>=80 && sum<90){
            g= 'E';
        }else if(sum>=70 && sum<80){
            g = 'A';
        }else if(sum>=55 && sum<70){
            g = 'P';
        }else if(sum>=40 && sum<55){
            g = 'D';
        }else if(sum < 40) {
            g = 'T';}
        
        return g; 
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class Solution {