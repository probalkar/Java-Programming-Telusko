// Using Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "String [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Probal Kar", 20));
        studs.add(new Student("Smita Jagdale", 22));
        studs.add(new Student("Awantika Ankushe", 20));

        for(Student s : studs){
            System.out.println(s);
        }

        Collections.sort(studs);
        
        for(Student s : studs){
            System.out.println(s);
        }
    }
}
