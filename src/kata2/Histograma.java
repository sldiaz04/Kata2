package kata2;

import java.util.HashMap;

public class Histograma <T>{
    private final T [] vector;

    public Histograma(T[] vector) {
        this.vector = vector;
    }

    public T[] getVector() {
        return vector;
    }

    public HashMap<T,Integer> getHistogram(){
    
    HashMap<T,Integer> histo = new HashMap<>();
    
        for (T key : vector) {
            if(!histo.containsKey(key)){
                histo.put(key, 0);
            }
            histo.put(key, histo.get(key)+1);
        }
        return histo;
    }
}
