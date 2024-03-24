class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Inside the constructor");
    }

    static{
        name = "Phone"; // static block in executed only once when the class is loaded in the JVM
                        // class is also loaded in the JVM only once and before the creation of objects
                        // class is loaded first that's why static block is executed first even before the constructor is called
                        // if class object is not declared in the main function then class is also not loaded in the JVM
        System.out.println("Inside static block");
    }

    void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_block{
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile.name = "Smartphone";
        
        // Mobile m1 = new Mobile();
        // m1.brand = "Apple";
        // m1.price = 1000;

        // m1.show();

        Class.forName("Mobile");    // can be used to load class in the JVM without creating a class object
                                            // throws ClassNotFoundException error
    }
}