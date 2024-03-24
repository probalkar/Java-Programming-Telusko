class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();

        // human.age = 20; // private instance variable cannot be accessed outside the class
        // human.name = "Probal";  // private instace variable cannot be accessed outside the class

        human.setAge(20);
        human.setName("Probal");

        System.out.println(human.getName() + " : " + human.getAge());
    }
}
