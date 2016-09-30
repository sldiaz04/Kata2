package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        
        //Integer [] vector = {1,2,3,4,5,1,2,3,4,5};
        //Double [] vector = {2.1,1.1,3.1,1.1,4.1,6.1,100.1,100.1,2.1,100.1};
        String [] vector = {"Ana","elena","Pedro","Juan","Ana","elena","Pedro","Juan"};
        
        Histograma<String> histogram = CalculatorHistogram.computeHistagram(vector);
        
        for (Object key : histogram.keySet()){
            System.out.println(key + " --> " + histogram.get(key));
        }
        
    }
}
