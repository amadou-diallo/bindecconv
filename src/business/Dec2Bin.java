
package business;

import java.util.ArrayList;

/**
 *
 * @author kadiatou
 */
public class Dec2Bin {
    public static final String INVALUE = "Decimal";
    public static final String RESULT = "Binary";
    
    private String startval;
    private String result;
    private String errmsg ;
    private ArrayList<String> steps;
    
    public Dec2Bin(String sval) {
        this.startval = sval;
        this.errmsg = "";
        this.result = "";
        try {
            long n = Long.parseLong(this.startval);
            if (n < 0) {
                this.errmsg = "Decimal to convert must be >= 0";
                
            } else {
                this.steps = new ArrayList<>();
                convert(n);
            }
            
        } catch (NumberFormatException e) {
            this.errmsg = "Illegal starting value for Decimal-to-Binary.";
        }
    }
    
    public String getStartValue(){
        return this.startval;
    }
    
    public String getErrorMsg() {
        return this.errmsg;
    }
    
    public String getResult() {
        return this.result;
    }
    //n (Users input)
    private void convert(long n) {
        int r;
        this.result = "";
        
        while (n > 0) {
            r = (int) (n % 2);
            
            String s = n + " divided by 2 = " + (n/2) +
                           " with a remainder of: " + r;
            this.steps.add(s);
            
            
            this.result = String.valueOf(r) + this.result;
            n = n/ 2;
              
        }
    }//end of Convert
    
    public ArrayList<String> getSteps() {
        return this.steps;
    }
    
}
