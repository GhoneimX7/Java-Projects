package marks;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Student[] students = new Student[6];
        for(int i=0; i<6; i++){
            students[i] = new Student();
            System.out.println("Enter your ID, Level and Name respectively!");
            students[i].setId(sc.nextInt());
            students[i].setLevel(sc.nextInt());
            students[i].setName(sc.next());
            System.out.println("Enter your Marks of OOP, DB, Arc, Net, Stat and Sa respectively!");
            Marks marks = new Marks(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            students[i].setMarks(marks);
        }
        
        for (int i=0; i<6; i++){
            System.out.println("Student No." + i);
            System.out.println("ID: " + students[i].getId());
            System.out.println("Level: " + students[i].getLevel());
            System.out.println("Name: "  + students[i].getName());
            System.out.println("Marks:");
            System.out.println(students[i].toString());
        }
    }

}
