package homework1.secondary;

import homework1.allsweets.Sweets;
import java.util.Comparator;

/**
 * @author Irina Goncharova
 */
public  class SortByWeightComparator implements Comparator<Sweets> {
    @Override
    public int compare(Sweets o1, Sweets o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else return 0;
    }
}
