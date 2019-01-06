import java.util.ArrayList;
import java.util.Scanner;

public class arrayList{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        String[] array = new String[T];
        for(int i=0;i<T;i++){
            array[i] = s.next();
        }

        for(int temp=0;temp<T;temp++) {
            
            for(int i=0;i<array[temp].length();i=i+2) {
                System.out.print(array[temp].charAt(i));
            }
            System.out.print(" ");
            for(int j=1;j<array[temp].length();j=j+2) {
                System.out.print(array[temp].charAt(j));
            }
             System.out.println();
        }
        s.close();
       
    }
}









