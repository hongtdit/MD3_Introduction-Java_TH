package rikkei.academy;

import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Given a equation'a*x+b=c', please enter constants:");
        Scanner scanner =new Scanner(System.in);
        System.out.printf("Enter a: ");
        double a=scanner.nextDouble();
        System.out.printf("Enter b: ");
        double b=scanner.nextDouble();
        System.out.printf("Enter c: ");
        double c=scanner.nextDouble();
        if(a!=0){
            double x=(c-b)/a;
            System.out.println("Equation pass with x= "+x);
        }else {
            if(b==c){
                System.out.println(" The SOLUTION IS ALL X");
            } else {
                System.out.println("No Solution");
            }
        }

    }
}
