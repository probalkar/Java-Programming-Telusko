class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("Inside constructor");
        age = 20;
        name = "Probal";
    }
    
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
}

public class Constructor {
    public static void main(String[] args) {
        Human human = new Human();

        // human.setAge(20);
        // human.setName("Probal");

        System.out.println(human.getName() + " : " + human.getAge());
    }
}
