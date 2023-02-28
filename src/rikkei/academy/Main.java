package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float witdh;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter witdh: ");
        witdh =scanner.nextFloat();
        System.out.println("enter height: ");
        height =scanner.nextFloat();
        float area =witdh*height;
        System.out.println("area is: "+area);
    }
}
