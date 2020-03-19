package homework1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import homework1.allsweets.*;
import homework1.secondary.SortByWeightComparator;

/**
 * @author Irina Goncharova
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Sweets> listOfSweets = createSweetPresent();

        System.out.print("==============The content of the present==============");
        System.out.println("");
        printContentOfPresent(listOfSweets);
        System.out.println("");

        double w = findWeightOfPresent(listOfSweets);
        System.out.println("==============The weight of the present===============");
        System.out.println(w);
        System.out.println("");

        System.out.println("============Sorting by weight of one piece============");
        ArrayList<Sweets> newlist1 = sortByWeight(listOfSweets);
        printContentOfPresent(newlist1);
        System.out.println("");

        System.out.println("==============Searching by sugar content==============");
        ArrayList<Sweets> newlist2 = findBySugarCont(listOfSweets);
        printContentOfPresent(newlist2);

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

    public static void printContentOfPresent(ArrayList<Sweets> listOfSweets) {
        for (Sweets i : listOfSweets) {
            StringBuilder b = new StringBuilder();
            System.out.println(b.append(i.getGroupOfSweets()).append(" ").append(i.getName()).append(", weight: ").append(i.getWeight()).
                    append(", sugar: ").append(i.getSugarCont()).append(" - ").append(i.getQuantity()).append(" pcs"));
        }
    }

    public static double findWeightOfPresent(ArrayList<Sweets> listOfSweets) {
        double weightOfPresent = 0.0;
        for (Sweets i : listOfSweets) {
            weightOfPresent += i.getWeight() * i.getQuantity();
        }
        return weightOfPresent;
    }

    public static ArrayList<Sweets> sortByWeight(ArrayList<Sweets> listOfSweets) {
        Comparator weightComparator = new SortByWeightComparator();
        Collections.sort(listOfSweets, weightComparator);
        return listOfSweets;
    }

    public static ArrayList<Sweets> findBySugarCont(ArrayList<Sweets> listOfSweets) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Sweets> newList = new ArrayList<Sweets>();
        double x = -1;
        double y = -1;
        System.out.print("Enter a range of sugar content, lower border: ");
        while (x < 0) {
            try {
                x = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Enter a number");
            } catch (IOException e) {
                System.out.println("Data input error");
            }
            if (x < 0) {
                System.out.println("The border value cannot be a negative number, enter a non-negative number");
            }
        }
        System.out.print("upper border: ");
        while (y < 0) {
            try {
                y = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Enter a number");
            } catch (IOException e) {
                System.out.println("Data input error");
            }
            if (y < 0) {
                System.out.println("The border value cannot be a negative number, enter a non-negative number");
            }
        }
        for (Sweets i : listOfSweets) {
            if (x > y) {
                System.out.println("Data input error: the lower bound should be less than the upper one. Impossible to sort");
                break;
            } else if (i.getSugarCont() >= x && i.getSugarCont() <= y) {
                newList.add(i);
            }
        }
        return newList;
    }
}
