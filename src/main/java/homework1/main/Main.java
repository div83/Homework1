package homework1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



import homework1.allsweets.*;
import homework1.secondary.SortByWeightComparator;
import org.apache.log4j.Logger;


/**
 * @author Irina Goncharova
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("-----------------------------------------");
        LOGGER.info("Entering an application");

        List<Sweets> listOfSweets = createSweetPresent();
        LOGGER.info("Creating a present");

        System.out.print("==============The content of the present==============");
        printContentOfPresent(listOfSweets);

        System.out.println("==============The weight of the present===============");
        double w = calculateWeightOfPresent(listOfSweets);
        System.out.println(w);
        LOGGER.info("The weight of present is calculated successfully");

        System.out.println("============Sorting by weight of one piece============");
        List<Sweets> newlist1 = sortByWeight(listOfSweets);
        printContentOfPresent(newlist1);
        LOGGER.info("Sorting by weight of one piece is ended successfully");

        System.out.println("==============Searching by sugar content==============");
        double[] pair = rangeBorders();
        LOGGER.info("Range numbers were inputed correctly");
        List<Sweets> newlist2 = findBySugarCont(listOfSweets, pair[0], pair[1]);
        printContentOfPresent(newlist2);
        LOGGER.info("Searching by sugar content is ended successfully");
    }

    public static ArrayList<Sweets> createSweetPresent() {
        ArrayList<Sweets> listOfSweets = new ArrayList<Sweets>();
        listOfSweets.add(new Candies("Bim-bom", 5.3, 3, "orange", "candy", 5));
        listOfSweets.add(new Chocolate("Alpen Gold", 90, 48, "milky", "chocolate", 1));
        listOfSweets.add(new Marmalade("Jellies", 46, 5, "pink", "marmelad", 10));
        listOfSweets.add(new Cookies("Krecker", 5.2, 4, true, "cookies", 10));
        listOfSweets.add(new Candies("Fruittella", 40, 30, "multy", "candy", 1));
        listOfSweets.add(new Candies("Snickers", 50, 32, "chokolate, hazelnuts", "candy", 3));
        listOfSweets.add(new Chocolate("Schogetten", 100, 49, "milky", "chocolate", 1));
        return listOfSweets;
    }

    public static void printContentOfPresent(List<Sweets> listOfSweets) {
        for (Sweets i : listOfSweets) {
            StringBuilder b = new StringBuilder();
            System.out.println(b.append(i.getGroupOfSweets()).append(" ").append(i.getName()).append(", weight: ").append(i.getWeight()).
                    append(", sugar: ").append(i.getSugarCont()).append(" - ").append(i.getQuantity()).append(" pcs"));
        }
    }

    public static double calculateWeightOfPresent(List<Sweets> listOfSweets) {
        double weightOfPresent = 0.0;
        for (Sweets i : listOfSweets) {
            weightOfPresent += i.getWeight() * i.getQuantity();
        }
        return weightOfPresent;
    }

    public static List <Sweets> sortByWeight(List<Sweets> listOfSweets) {
        Comparator weightComparator = new SortByWeightComparator();
        Collections.sort(listOfSweets, weightComparator);
        return listOfSweets;
    }

    public static double[] rangeBorders () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] pair = new double[] {-1,-1};
        System.out.print("Enter a range of sugar content: ");
        while (pair[0] < 0){
            try {
                LOGGER.warn("An attempt to read the first number");
                pair[0] = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                LOGGER.error("Invalid input format: not a number");
                System.out.println("Invalid input format. Enter a number");
            } catch (IOException e) {
                LOGGER.error("Data input error");
                System.out.println("Data input error");
            }
            if (pair[0] < 0 ) {
                LOGGER.info("The value is negative");
                System.out.println("A border value cannot be a negative number, enter a non-negative number");
            }
        }
        while (pair[1] < 0){
            try {
                LOGGER.warn("An attempt to read the second number");
                pair[1] = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                LOGGER.error("Invalid input format: not a number");
                System.out.println("Invalid input format. Enter a number");
            } catch (IOException e) {
                LOGGER.error("Data input error");
                System.out.println("Data input error");
            }
            if (pair[1] < 0) {
                LOGGER.info("The value is negative");
                System.out.println("A border value cannot be a negative number, enter a non-negative number");
            }
        }
        return pair;
    }

    public static List<Sweets> findBySugarCont(List<Sweets> listOfSweets, double x, double y) {
        List<Sweets> newList = new ArrayList<Sweets>();
        for (Sweets i : listOfSweets) {
            if ((i.getSugarCont() >= x && i.getSugarCont() <= y) || (i.getSugarCont() >= y && i.getSugarCont() <= x)) {
                newList.add(i);
            }
        }
        return newList;
    }
}
