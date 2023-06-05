import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class paintProblem {
    // paint all homes to same color
    public static void main(String[] args) {

        int paints[] = { 3, 2, 2, 3, 1, 2, 1, 3, 2 };
        Arrays.sort(paints);
        // int ele = paints[0];
        Dictionary<Integer, Integer> dict = new Hashtable<>();

        for (int sm : paints) {
            dict.put(sm, dict.get(sm) + 1);
            // System.out.println(sm);
        }
        // for (int sm: ){
            // System.out.println(dict.elements());
        // }
    }
}