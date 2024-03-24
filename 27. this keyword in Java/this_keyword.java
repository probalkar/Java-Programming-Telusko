class Human{
    private int age;
    private String name;
    
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

public class this_keyword {
    public static void main(String[] args) {
        Human human = new Human();

        human.setAge(20);
        human.setName("Probal");

        System.out.println(human.getName() + " : " + human.getAge());
    }
}