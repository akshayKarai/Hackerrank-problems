import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    public static int power(int x, int y) throws Exception{
    int result = 0;
    if(x < 0 || y < 0){
        throw new Exception("n and p should be non-negative");
    }
    else{
        result = (int)Math.pow(x,y);
    }

    return result;
}
}

class Solution{
