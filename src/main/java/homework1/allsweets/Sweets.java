package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public abstract class Sweets {
    private String name;
    private double weight;
    private double sugarCont;
    private String groupOfSweets;
    private int quantity;

    public Sweets (String name, double weight, double sugarCont, String groupOfSweets, int quantity) {
        this.name = name;
        this.weight = weight;
        this.sugarCont = sugarCont;
        this.groupOfSweets = groupOfSweets;
        this.quantity = quantity;
    }

    public Sweets(){

    }

    public String getName() {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The field \"name\" can not be empty");
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The field \"name\" can not be empty");
        }
        this.name = name;
    }

    public double getWeight() {
        if (weight <= 0) {
            throw new IllegalArgumentException("The weight can not be negative");
        }
        return weight; }

    public void setWeight (double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("The weight can not be negative");
        } else {
            this.weight = weight;
        }
    }

    public double getSugarCont () {
        if (sugarCont <= 0) {
            throw new IllegalArgumentException("The weight can not be negative");
        }
        return sugarCont; }

    public void setSugarCont (double sugarCont) {
        if (sugarCont <= 0) {
            throw new IllegalArgumentException("The weight can not be negative");
        } else {
            this.sugarCont = sugarCont;
        }
    }

    public String getGroupOfSweets() { return groupOfSweets;}

    public void setGroupOfSweets(String groupOfSweets) {
        this.groupOfSweets = groupOfSweets;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
