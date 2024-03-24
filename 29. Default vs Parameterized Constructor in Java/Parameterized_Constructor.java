class Human{
    private int age;
    private String name;

    public Human(){     // Default Constructor
        age = 20;
        name = "Probal";
    }    

    public Human(int age, String name){     // Parameterized Constructor
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {   
        this.age = age;
    }
    public String getName() {   
        return name;
    }
    public void setName(String name) {  
        this.name = name;
    }
    
}

public class Parameterized_Constructor {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(22,"Smita");

        // human.setAge(20);
        // human.setName("Probal");

        System.out.println(human1.getName() + " : " + human1.getAge());
        System.out.println(human2.getName() + " : " + human2.getAge());
    }
}