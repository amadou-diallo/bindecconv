 
package business;

import java.util.ArrayList;

/**
 *
 * @author kadiatou
 */
public class Bin2Dec {
    public static final String INVALUE = "Binary";
    public static final String RESULT = "Decimal";  
     
        private String startval; 
        private String result;
        private String errmsg ;
        private ArrayList<String> steps;
        
        //Constructor
    public Bin2Dec(String bv) {
        this.startval = bv;
        this.errmsg = "";
        if(isValid()) {
                convert();
            } else {
               this.errmsg = "Starting value is not binary (0's and 1's only)";
            }
            
            
            
        }// end of Constructor
        
    private boolean isValid() {
            //check that startVal is all 1s and 0s
        for (int i=0; i < this.startval.length(); i++) {
              if (this.startval.charAt(i) != '0' &&
                  this.startval.charAt(i) != '1') {
                 return false;
               }
           }//end of for
           return true;
        }
        
    private void convert() {
        long res = 0;
        int pos = 0;
        this.steps = new ArrayList<>();
             
             //example :1101
             //      1= 2^0
             //      4= 2^2
             //      8= 2^3
             // value =13
             
        for (int i= this.startval.length()-1; i>=0; i--) {
              if(this.startval.charAt(i) == '1') {
                 res += (long) Math.pow(2, pos);
                  this.steps.add("There is a(n) " + (long) Math.pow(2, pos) +
                                   " in the value (2^" + pos + ")");
                  
                  
                     
                 }//nd of it
              pos++;
             }//end of for
        this.result = String.valueOf(res);
             
             
        }// End of Constructor
    
    public String getErrorMsg(){
        return this.errmsg;
    }
    
    public String getResult() {
        return this.result;
    }
    
    public ArrayList<String> getSteps() {
        return this.steps;
    }
    
        
         
        
   
        
      
    
    
}
    

        