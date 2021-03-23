package marks;

public class Student {
    private int id;
    private String name;
    private int level;
    private Marks marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", level=" + level + ", marks=" + marks.toString() + '}';
    }
    
    
    
}
