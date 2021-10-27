package slr;

public class Betas {
    
    //Beta 1
    public double beta1(int n,double xpory,double x1,double y1,double x2){
        double b1=0;
        b1 = ((n * xpory) - (x1 * y1)) / ((n * x2) - (x1 * x1));
        return b1;
    }  
    
    //Beta 0
     public double beta0 (double y,double b1,double x){
      double b0=0;
      b0 = y - (b1 * x);
      return b0;
     }
    
         
}
