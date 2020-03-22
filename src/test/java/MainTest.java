import homework1.allsweets.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static homework1.main.Main.*;

/**
 * @author Irina Goncharova
 */
public class MainTest {

    public List <Sweets> listTest1;
    public List <Sweets> listTest2;
    public final double e = 10e-9;

    @Before
    public void initPresent1() {
        listTest1 = new ArrayList<Sweets>();
        listTest1.add(new Candies("c1", 45, 25, "c2", "candy", 25));
        listTest1.add(new Chocolate("ch1", 158, 89, "ch2", "ch3", 6));
        listTest1.add(new Cookies("co1", 18, 9, true, "co3", 46));
        listTest1.add(new Marmalade("m1", 28, 20, "m2", "m3", 7));
    }

    @Before
    public void initPresent2() {
        listTest2 = new ArrayList<Sweets>();
        listTest2.add(new Candies("c1", 45, 25, "c2", "candy", 25));
        listTest2.add(new Chocolate("ch1", -5, 89, "ch2", "ch3", 6));
        listTest2.add(new Cookies("co1", 18, 9, true, "co3", 46));
        listTest2.add(new Marmalade("m1", 28, 20, "m2", "m3", 7));
    }

    @Test
    public void shoudReturnTheWeightOfPresent(){
        double expected = 3097.0;
        double actual = calculateWeightOfPresent(listTest1);
        Assert.assertEquals(expected, actual, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateWeightOfPresent_whenWeightIsNullOrNegative(){
        calculateWeightOfPresent(listTest2);
    }

    @Test
    public void findBySugarContTest_whenRangeFrom0To20() {
        double[] expected = new  double[] {9,20};
        List<Sweets> list = findBySugarCont(listTest1, 0, 20);
        double[] actual = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            actual[i] = list.get(i).getSugarCont();
        }
        Assert.assertArrayEquals(expected, actual, e);
    }

    @Test
    public void sortByWeightTest () {
        double[] expected = new  double[] {18,28,45,158};
        List<Sweets> list = sortByWeight(listTest1);
        double[] actual = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            actual[i] = list.get(i).getWeight();
        }
        Assert.assertArrayEquals(expected, actual, e);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByWeightTest_whenWeightIsNegative () {
        //double[] expected = new  double[] {-5,18,28,45};
        List<Sweets> list = sortByWeight(listTest2);
//        double[] actual = new double[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            actual[i] = list.get(i).getWeight();
//        }
//        Assert.assertArrayEquals(expected, actual, e);
    }
}
