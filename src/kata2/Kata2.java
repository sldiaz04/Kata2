package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        
        //Double [] vector = {2.1,1.1,3.1,1.1,4.1,6.1,100.1,100.1,2.1,100.1};
        String [] vector = {"Ana","elena","Pedro","Juan","Ana","elena","Pedro","Juan"};
        
        Histograma histo = new Histograma(vector);
        HashMap <Object,Integer> histogram = histo.getHistogram();
        
        for (Object key : histogram.keySet()){
            System.out.println(key + " --> " + histogram.get(key));
        }
        
    }
}
