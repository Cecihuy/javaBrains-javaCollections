import java.util.ArrayList;

class Hello{
    public static void main(String[] args) {
        Student student1 = new Student("foo", "bar", 2, "science");
        Student student2 = new Student("bar", "baz", 1, "comerce");
        Student student3 = new Student("blah", "bar", 3, "arts");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student3);
        students.add(student1);
        students.add(student2);
        students.sort(null);

        System.out.println(students);
    }    
}