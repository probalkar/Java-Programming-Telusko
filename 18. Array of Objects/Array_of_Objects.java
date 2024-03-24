class Student{
    int rollno;
    String name;
}

public class Array_of_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 49;
        s1.name = "Probal";

        Student s2 = new Student();
        s2.rollno = 56;
        s2.name = "Smita";

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;

        // System.out.println(s1); // returns the address of the object

        System.out.println("    Roll no    |    Name    ");

        for(Student s : students){
            System.out.printf("    %d    |    %s    \n",s.rollno, s.name);
        }

    }
}
