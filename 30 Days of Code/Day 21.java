import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    public void printArray(T[] a){
         for(T i : a) {
            System.out.println(i);
        }
    }
    
   

}
