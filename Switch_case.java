import java.util.Scanner;

public class Arithmetic_operator_Switch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("========");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter Two Number :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option In Words :");
        String option=sc.nextLine();


        switch (option){

            case "ADD":
                System.out.println("Sum is "+ (x+y));
                break;
            case "SUB":
                System.out.println("Sub is "+(x-y));
                break;
            case "MUL":
                System.out.println("Mul is "+(x*y));
                break;
            case "DIV":
                System.out.println("Div is "+(x/y));
                break;

            default:
                System.out.println("   INVALID INPUT   ");
        }
    }
}
