// lab12
public class Student {
    private String name;
    private String id;
    private String course;
    private double gpa;

    public Student(String name, String id, String course, double gpa) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setCourse(String course) { this.course = course; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
