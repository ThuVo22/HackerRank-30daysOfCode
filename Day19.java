 class Calculator implements AdvancedArithmetic{
     public int divisorSum(int n){
         int b =0;
         for (int i=n; i>0; i--){
             if (n%i == 0){
              
                 b+=i;
                
             }
         }
  
     return b;
     }
     
 }
