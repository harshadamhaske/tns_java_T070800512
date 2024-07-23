package ass1;

import java.util.Scanner;


abstract class Process{
 int data;

 void showData() {
     System.out.println("Data: " + data);
 }

 abstract void process();
}

class Factorial extends Process {
 @Override
 void process() {
     long factorial = 1;
     for (int i = 1; i <= data; i++) {
         factorial *= i;
     }
     System.out.println("Factorial of " + data + " is: " + factorial);
 }
}


class Circle extends Process {
 @Override
 void process() {
     double area = Math.PI * data * data;
     System.out.println("Area of the circle with radius " + data + " is: " + area);
 }
}


public class Ass_1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter your choice (1/2): ");
     String choice = scanner.nextLine().toLowerCase();

     Process process;
     switch (choice) {
         case "1":
             process = new Factorial();
             System.out.println("Enter a number to calculate its factorial: ");
             process.data = scanner.nextInt();
             break;
         case "2":
             process = new Circle();
             System.out.println("Enter the radius of the circle: ");
             process.data = scanner.nextInt();
             break;
         default:
             System.out.println("Invalid choice!");
             return;
     }

     process.showData();
     process.process();
 }
}

