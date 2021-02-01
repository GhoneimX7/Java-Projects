package student.system;

import java.util.Scanner;

public class Process {
    boolean again = false;
    static Scanner sc = new Scanner(System.in);
    int op = 0;


    public Process() {
        
        do {
            System.out.println("choose the process number");
            System.out.println("1- add student");
            System.out.println("2- search a student");
            System.out.println("3- Delete a student");
            System.out.println("4- print the list of student");
            System.out.println("5- show statistics");
            System.out.println("6- update GPA for a student");
            
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Student.add();
                    break;
                case 2:
                    Student.search();
                    break;
                case 3:
                    Student.delete();
                    break;
                case 4:
                    
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            
            
            
            
            
            
            
            System.out.println("enter y to exit or any other letter for another operation!");
            String keep = "" + sc.next().charAt(0);
            if(keep.equalsIgnoreCase("y"))
                again = false;
            else
                again = true;
        }while(again);
    }
    
}
