import java.util.Scanner;
class seventhscannerprogram
{
    public static void main (String[] args)
    {
       
        //scanner class program
        byte age;
        float average;
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age:-");
        age = scan.nextByte();
        System.out.println("Age is:- " + age);

        
        System.out.println("Enter the average:-");
        average = scan.nextFloat();
        System.out.println("Age is:- " + average);

        
        System.out.println("Enter the name:-");
        name = scan.next();
        System.out.println("Age is:- " + name);

//print Vs println program

        // Print Vs println
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println();
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
    }
}