import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

      public Difference(int[] a){
          this.elements = a;
      }
    
	// Add your code here
    void computeDifference(){
        int n = elements.length;
       int max=1;
       int min =100;
       for(int i=0;i < n ;i++){
           if(elements[i]<min){
               min = elements[i];
           }if(elements[i]>max){
               max=elements[i];
           }
       }
       maximumDifference = max - min;
    }

} // End of Difference class