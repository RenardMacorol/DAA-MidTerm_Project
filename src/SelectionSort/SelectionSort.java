package src.SelectionSort;
import java.util.*;

public class SelectionSort{
    public void selectionSortByWV (List<Double> wv){
        int a = wv.size();
        for (int n=0; n<a-1;n++) {
        int minIndex = n;
            for (int j = n + 1; j < wv.size(); j++) {
                 if (wv.get(j) < wv.get(minIndex)) {
                    minIndex = j;
                }
            }
        double temp = wv.get(minIndex);
        wv.set(minIndex, wv.get(n));
        wv.set(n, temp);
        }
    }
}
