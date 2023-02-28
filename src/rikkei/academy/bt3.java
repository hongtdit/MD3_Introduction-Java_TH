package rikkei.academy;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào số:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a= n % 10;
        int b=(n/10)%10;
        int c=(n/100);

//        public static  String ConvertNumber( int number ) {
//            String words ="";
//            switch (number) {
//                case 1:
//                    words+= "one";
//                    break;
//                case 2:
//                    words+= "two";
//                    break;
//                case 3:
//                    words +="three";
//                    break;
//                case 4:
//                    words+= "four";
//                    break;
//                case 5:
//                    words+= "five";
//                    break;
//                case 6:
//                    words+="six";
//                    break;
//                case 7:
//                    words+="seven";
//                    break;
//                case 8:
//                    words+="eight";
//                    break;
//                case 9:
//                    words+="nine";
//                    break;
//            }
//            return words.trim();
//        }
//
//        public static  String ConvertTen (int number) {
//            String words="";
//            switch (number) {
//                case 0:
//                    words+= "ten";
//                    break;
//                case 1:
//                    words+= "eleven";
//                    break;
//                case 2:
//                    words+= "twelve";
//                    break;
//                case 3:
//                    words +="thirteen";
//                    break;
//                case 4:
//                    words+= "fourteen";
//                    break;
//                case 5:
//                    words+= "fifteen";
//                    break;
//                case 6:
//                    words+="sixteen";
//                    break;
//                case 7:
//                    words+="seventeen";
//                    break;
//                case 8:
//                    words+="eighteen";
//                    break;
//                case 9:
//                    words+="nineteen";
//                    break;
//            }
//            return words.trim();
//
//
//        }
//        String word ="";
//         if (n<999) {
//             if (c>0) {
//                 word += +c+ "hundred";
//                 if (a!=0) {
//                     switch (b) {
//                         case 5:
//                             word+= "fifty" + ConvertNumber(c);
//                             break;
//                         case 1:
//                             word+= ConvertTen(c);
//                             break;
//                         default:
//                     }
//                 }
//             }
//
//         }

        if(n<100 || n > 999){
            switch(b){
                case 1: System.out.println("ten ");break;
                case 2: System.out.println("twenty ");break;
                case 3: System.out.println("thirty ");break;
                case 4: System.out.println("forty ");break;
                case 5: System.out.println("fifty ");break;
                case 6: System.out.println("sixty ");break;
                case 7: System.out.println("seventy  ");break;
                case 8: System.out.println("eighty  ");break;
                case 9: System.out.println("ninety ");break;
            }
            //in ra hàn đơn vị
            switch(a){
                case 1: System.out.println("one ");break;
                case 2: System.out.println("two  ");break;
                case 3: System.out.println("three ");break;
                case 4: System.out.println("four ");break;
                case 5: System.out.println("five ");break;
                case 6: System.out.println("six ");break;
                case 7: System.out.println("seven ");break;
                case 8: System.out.println("eight ");break;
                case 9: System.out.println("nine ");break;
            }
//            if(c == 0 && b>= 1&&b<2){
//                switch(b){
//                    case 1: System.out.println("ten ");break;
//                    case 2: System.out.println("eleven ");break;
//                    case 3: System.out.println("Twelve ");break;
//                    case 4: System.out.println("Thirteen ");break;
//                    case 5: System.out.println("Fourteen ");break;
//                    case 6: System.out.println("Fifteen ");break;
//                    case 7: System.out.println("Sixteen  ");break;
//                    case 8: System.out.println("Seventeen  ");break;
//                    case 9: System.out.println("Eightteen ");break;
//                }
//            }

        }
        else{
            //in ra hàng trăm
            switch(c){
                case 1: System.out.println("Onehundred ");break;
                case 2: System.out.println("Twohundred  ");break;
                case 3: System.out.println("Threehundred  ");break;
                case 4: System.out.println("Fourhundred  ");break;
                case 5: System.out.println("Fivehundred  ");break;
                case 6: System.out.println("Sixhundred  ");break;
                case 7: System.out.println("Sevenhundred  ");break;
                case 8: System.out.println("Eighthundred ");break;
                case 9: System.out.println("Nighthundred ");break;
            }
            // in ra chử "lẻ" nếu hàng chục bằng không
            if(b % 10 == 0 && a != 0){
                System.out.println("and ");
            }
            //in ra hàng chục
            switch(b){
                case 1: System.out.println("ten ");break;
                case 2: System.out.println("twenty ");break;
                case 3: System.out.println("thirty ");break;
                case 4: System.out.println("forty ");break;
                case 5: System.out.println("fifty ");break;
                case 6: System.out.println("sixty ");break;
                case 7: System.out.println("seventy  ");break;
                case 8: System.out.println("eighty  ");break;
                case 9: System.out.println("ninety ");break;
            }
            //in ra hàn đơn vị
            switch(a){
                case 1: System.out.println("one ");break;
                case 2: System.out.println("two  ");break;
                case 3: System.out.println("three ");break;
                case 4: System.out.println("four ");break;
                case 5: System.out.println("five ");break;
                case 6: System.out.println("six ");break;
                case 7: System.out.println("seven ");break;
                case 8: System.out.println("eight ");break;
                case 9: System.out.println("nine ");break;
            }
        }

    }


}
