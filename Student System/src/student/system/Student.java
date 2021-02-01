package student.system;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Student {
    private String name;
    private int id;
    private Contact contact;
    private int age;
    private double GPA;
    private static HashMap<Integer, Student> query = new HashMap();
    static Scanner sc = new Scanner(System.in);

    public Student(String name, int id, Contact contact, int age, double GPA) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.age = age;
        this.GPA = GPA;
    }

    public static HashMap<Integer, Student> getQuery() {
        return query;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static Contact getContactFromUser(){
        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Enter your mobileNumber");
        String mobileNumber = sc.next();
        System.out.println("Enter your Email");
        String email = sc.next();
        Contact contact = new Contact(city, mobileNumber, email);
        return contact;
    }
    
    public static void add(){
        String name;
        int id;
        int age;
        double GPA;
        
        System.out.println("Enetr the name");
        name = sc.next();
        
        System.out.println("Enter the id");
        id = sc.nextInt();
        
        System.out.println("Enter the Contact info");
        Contact contact = getContactFromUser();
        
        System.out.println("Enter your age");
        age = sc.nextInt();
        
        System.out.println("Enter GPA");
        GPA = sc.nextDouble();
        
        Student newStudent = new Student(name, id, contact, age, GPA);
        
        query.put(id, newStudent);
    }
    
    public static void search(){
        int id;
        System.out.println("Enter id");
        id = sc.nextInt();
        
        if(query.containsKey(id))
            System.out.println(query.get(id).toString());
        else
            System.out.println("id not found!");
    }
    
    public static void delete(){
        int id;
        System.out.println("Enter id");
        id = sc.nextInt();
        
        if(query.containsKey(id))
            query.remove(id);
        else
            System.out.println("id not found!");
    }
    
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", " + contact.toString() + ", age=" + age + ", GPA=" + GPA + '}';
    }
    
    
    
}
