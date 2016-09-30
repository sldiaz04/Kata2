package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        
        int [] vector = {2,1,3,1,4,6,100,100,2,100};
        HashMap <Integer,Integer> histograma = new HashMap<>();
        
        for(int key : vector){
            if(histograma.containsKey(key)){
                histograma.put(key, histograma.get(key) + 1);
            }else{
                histograma.put(key,1);
            }
        }
        for (int key : histograma.keySet()){
            System.out.println(key + " --> " + histograma.get(key));
        }
    }
}
