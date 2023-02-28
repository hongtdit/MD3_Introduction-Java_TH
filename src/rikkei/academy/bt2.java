package rikkei.academy;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        final int rate =23000;
        int n;
        System.out.println("Nhập vào số tiền usd:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Số tiền việt tương ứng là:"+n*rate);
    }
}
