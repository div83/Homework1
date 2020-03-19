package homework1.allsweets;

/**
 * @author Irina Goncharova
 */
public class Sweets {
    private String name;
    public double weight;
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

    public Sweets () {

    }

    @Override
    public String toString() {
        return name + " " + quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null || name.equals("")) {
            System.out.println("Поле \"имя\" не может быть пустым");
        } else {
            this.name = name;
        }
    }

    public double getWeight() { return weight; }

    public void setWeight () {
        if (weight <= 0) {
            System.out.println("Вес не может быть отрицательным");
        } else {
            this.weight = weight;
        }
    }

    public double getSugarCont () { return sugarCont; }

    public void setSugarCont () {
        if (sugarCont <= 0) {
            System.out.println("Содержание сахара не может быть отрицательным");
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
