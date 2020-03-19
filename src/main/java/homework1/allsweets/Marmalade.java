package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public class Marmalade extends Sweets {
    String color;

    public Marmalade(String name, double weight, double sugarCont, String color, String groupOfSweets, int quantity) {
        super(name, weight, sugarCont, groupOfSweets, quantity);
        this.color = color;
    }

    public String getColor() { return color;}

    public void setColor(String color) {
        this.color = color;
    }
}
