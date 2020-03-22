package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public class Chocolate extends Sweets {
    private String type;

    public Chocolate(String name, double weight, double sugarCont, String type, String groupOfSweets, int quantity) {
        super(name, weight, sugarCont, groupOfSweets, quantity);
        this.type = type;
    }

    public Chocolate(){

    }

    public String getType() { return type; }

    public void setType (String type) {
        this.type = type;
    }
}
