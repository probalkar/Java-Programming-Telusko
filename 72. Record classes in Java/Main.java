// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
// }

// better alternative
// by default instance variables in a record class are private and final
// a record class cannot extend any other class but can implement any number of interfaces
// you can create a static instance variable inside a record class but cannot create a normal instance variable
// you can define your own methods in the record class
record Alien(int id, String name){
    public Alien{
        if(id==0) throw new IllegalArgumentException("id cannot be zero");
    }
}

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Probal Kar");
        Alien a2 = new Alien(1, "Probal Kar");
        Alien a3 = new Alien(2, "Awantika Ankushe");
        // Alien a4 = new Alien(0, "Smita Jagdale");    // throws error

        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        System.out.println(a1.id());    // instance variables can be accessed by calling them as a method
        System.out.println(a3.name());
    }
}
