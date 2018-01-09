import java.io.*;
import java.util.*;
import java.util.Scanner;
public class RunningTimeAndComplexity {

 
        public static boolean isPrime(int n) {
           if (n%2==0 && n!=2) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i<count; i++){
            int num = sc.nextInt();
       
        if (num>=2 && isPrime(num))
            System.out.println("Prime");
        else
            System.out.println("Not prime");
                
        }
        }
    }
   
 
