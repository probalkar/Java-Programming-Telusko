enum Laptop{
    Macbook(2500), Zephyrus, Legion(1700), Razer(2300);

    private int price;

    private Laptop(){
        price = 1500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Enum {
    public static void main(String[] args) {
        Laptop mac = Laptop.Macbook;
        System.out.println(mac.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
