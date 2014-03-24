int division(int denom, int numer){
 int cycle=1;
 int count=0;
 int result=0;
 if (denom==numer){
     return 1;
 }else if(denom<numer){
     return 0;
 }else if(denom>numer){
     
     //if numer >= denom
     //denom = denom *10;
     while (numer>=denom){
         denom=denom<<1;
         cycle<<1;
     }
     denom=denom>>1;
     cycle>>1;
     
     while (numer>denom){
         numer=numer-denom;
         count++;
         result+=cycle;
     }
     
     result+=division(denom,result);
     return result;
     
 }   
    
}