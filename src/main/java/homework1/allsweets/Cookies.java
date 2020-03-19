package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public class Cookies extends Sweets {
    boolean isSalty;

    public Cookies(String name, double weight, double sugarCont, boolean isSalty, String groupOfSweets, int quantity) {
        super(name, weight, sugarCont, groupOfSweets, quantity);
        this.isSalty = isSalty;
    }

    public boolean getIsSalty() { return isSalty; }

    public void setIsSalty (boolean isSalty) {
        this.isSalty = isSalty;
    }
}

