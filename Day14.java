public Difference(int[] a){
    elements =a;
}

	
int max = 0;
 void computeDifference(){
       for(int i=0; i< elements.length-1; i++){
           for(int j = i+1; j< elements.length; j++){
           int dif= Math.abs(elements[j]-elements[i]);
           if (max< dif){
               max=dif;
           }   
           }
       }
        maximumDifference = max;
 }

