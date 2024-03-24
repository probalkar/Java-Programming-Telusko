class Student{
    int rollno;
    String name;
}

public class Enhanced_for_loop{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for(int i : nums){
            System.out.println(i);
        }

        System.out.println();
        
        Student s1 = new Student();
        s1.rollno = 49;
        s1.name = "Probal";

        Student s2 = new Student();
        s2.rollno = 56;
        s2.name = "Smita";

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        System.out.println("  Roll no  |    Name    ");
        for(Student student : students){
            System.out.printf("    %d    |    %s    \n",student.rollno,student.name);
        }
    }
}