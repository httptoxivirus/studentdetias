import java.lang.*;
import java.util.*;
class Student
{
  int roll;
  String name;
  String course;
  String branch;
  
  // Parameterised constructor
  Student(int roll, String name, String course, String branch)
  {
    this.roll = roll;
    this.name = name;
    this.course = course;
    this.branch = branch;
  }
  
  void getDetails()
  {
    System.out.println("Roll no. is "+ roll);
    System.out.println("Name is " + name);
    System.out.println("Course is" + course);
    System.out.println("Branch is" + branch);
  }
}

class Demo
{
  public static void main(string[] args)
  {
     Scanner sc = new Scanner(System.in);
     Student list[] = new Student[5];
     int roll = 0;
     String name = "";
     String course = "";
     String branch = "";
     for(int i=0; i<5; i++)
     {
        System.out.println("Enter the roll no.");
        roll = sc.nextInt();
        System.out.println("Enter the name ");
        name = sc.next();
        System.out.println("Enter the course ");
        course = sc.next();
        System.out.println("Enter the branch ");
        branch = sc.next();
        list[i] = new Student(roll, name, course, branch);
     }
     
     for(int j=0; j<5; j++)
     {
       list[i].getDetails();
     }
  }
}
