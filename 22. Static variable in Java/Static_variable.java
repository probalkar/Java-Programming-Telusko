class Mobile{
    String brand;
    int price;
    static String name;

    void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_variable{
    public static void main(String[] args) {
        Mobile.name = "Smartphone";
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1000;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 700;

        // m2.name = "Phone";  // Changes the variable value for all the instances of that class
                            // Not a good practice

        m1.show();
        m2.show();
    }
}