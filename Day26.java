import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int fine = 0;
        
            int actualDay = sc.nextInt();
            int actualMonth  =sc.nextInt();
            int actualYear = sc.nextInt();
            int expectedDay = sc.nextInt();
            int expectedMonth  =sc.nextInt();
            int expectedYear = sc.nextInt();
            int diff = 0;
        if ( actualDay != expectedDay && actualMonth == expectedMonth && actualYear == expectedYear){
             diff= actualDay - expectedDay;
             fine = 15 * diff;
        }
        if (actualMonth != expectedMonth && actualYear == expectedYear){
            diff = actualMonth - expectedMonth;
            fine = 500* diff;
        }
        if(actualYear > expectedYear ){
            fine = 10000;
        }
        if((actualDay<expectedDay && actualMonth< expectedMonth && actualYear <expectedYear) 
    || (actualDay<expectedDay && actualMonth< expectedMonth && actualYear ==expectedYear)){
            fine =0;
        }
    System.out.println(fine);
    }
}
