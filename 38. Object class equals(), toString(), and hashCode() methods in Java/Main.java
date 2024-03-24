class Laptop{
    String model;
    int price;
    
    @Override   // Overriding hashCode method of Object class
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    
    @Override   // Overriding equals method of Object class
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override   // Overriding toString() method of Object class
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    
}

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.model = "Asus Tuf Gaming A15";
        lap1.price = 1_08_000;

        Laptop lap2 = new Laptop();
        lap2.model = "Macbook Air 15 M3";
        lap2.price = 1_40_000;

        System.out.println(lap1.equals(lap2));
        System.out.println(lap1.toString());
        System.out.println(lap2.toString());
    }
}
