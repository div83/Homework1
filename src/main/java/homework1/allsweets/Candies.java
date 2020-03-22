package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public class Candies extends Sweets {
    private String withTasteOf;

    public Candies(String name, double weight, double sugarCont, String withTasteOf, String groupOfSweets, int quantity) {
        super(name, weight, sugarCont, groupOfSweets, quantity);
        this.withTasteOf = withTasteOf;
    }

    public Candies(){

    }

    public String getWithTasteOf() { return getWithTasteOf(); }

    public void setWithTasteOf (String withTasteOf) {
        this.withTasteOf = withTasteOf;
    }
}
