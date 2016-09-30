package kata2;

public class CalculatorHistogram {
    
    public static <T> Histograma<T> computeHistagram(T [] vector){
        Histograma<T> histo = new Histograma<>();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
