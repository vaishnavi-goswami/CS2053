import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class Lab9 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", 85));
        studentList.add(new Student("Bob", 92));
        studentList.add(new Student("Charlie", 78));

        System.out.println("Initial Student List:");
        displayStudents(studentList);

        studentList.get(2).setMarks(88);  
        System.out.println("\nAfter Updating Charlie's Marks:");
        displayStudents(studentList);

        studentList.remove(1); 
        System.out.println("\nAfter Removing Bob:");
        displayStudents(studentList);

        System.out.println("\nTraversing Using Iterator:");
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
    }

    public static void displayStudents(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
