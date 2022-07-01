import java.util.Scanner;

class Employee{
     int salary;
     String name;
     public int getSalary(){
         return salary;
     }
     public String getName(){
         return name;
     }
     public void setName(String n){
         name=n;
     }
}
class Square{
    int side;
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}
public class Custom_Class {
    public static void main(String[] args) {
//                Employee harry=new Employee();
//               harry.setName("Mohsin");
//               harry.salary=4567;
//        System.out.println(harry.getSalary());
//                System.out.println(harry.getName());
        Square sq=new Square();
        int side;
        System.out.println("Enter the side");
        Scanner sc=new Scanner(System.in);
        side= sc.nextInt();
        sq.side=side;
        System.out.println("Perimeter= " + sq.getPerimeter());
        System.out.println("Area= " + sq.getArea());
    }
}
