//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        int n = in.nextInt();
        String[] array = new String[n];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
                map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           list.add(s);
           if(list.size() == n)
               break;
            
        }
        in.close();
        for(int j=0;j<list.size();j++) {
            String key = list.get(j);
             if(map.containsKey(key)) {
                 System.out.println(key+"="+map.get(key));
             }else {
                 System.out.println("Not found");
             }
        }

    }
}

