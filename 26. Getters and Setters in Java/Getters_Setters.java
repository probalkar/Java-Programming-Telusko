class Human{
    private int age;
    private String name;
    
    // getters and setters generated using vs code
    public int getAge() {   // getter for age
        return age;
    }
    public void setAge(int age) {   // setter for age
        this.age = age;
    }
    public String getName() {   // getter for name
        return name;
    }
    public void setName(String name) {  // setter for name
        this.name = name;
    }

    // getters and setters coded manually
    // public int getAge(){
    //     return age;
    // }

    // public void setAge(int a){
    //     age = a;
    // }

    // public String getName(){
    //     return name;
    // }

    // public void setName(String n){
    //     name = n;
    // }

    
}

public class Getters_Setters {
    public static void main(String[] args) {
        Human human = new Human();

        // human.age = 20; // private instance variable cannot be accessed outside the class
        // human.name = "Probal";  // private instace variable cannot be accessed outside the class

        human.setAge(20);
        human.setName("Probal");

        System.out.println(human.getName() + " : " + human.getAge());
    }
}
