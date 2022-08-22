import java.util.Scanner;

public class Roman_Numerals {

    public static int start_number;
    public static int end_number;

    public static void Place (int j, String small, String big, String massive) {
        if (j == 1 || j == 2 || j == 3) {
            for (int k = 1; k <= j % 10; k++) {
                System.out.print(small);
            }
        } else if (j == 4){
            System.out.print(small + big);
        } else if (j == 5 || j == 6 || j == 7 || j == 8) {
            System.out.print(big);
            for (int k = 5; k < j; k++) {
                System.out.print(small);
            }
        } else if (j == 9) {
            System.out.print(small + massive);
        }
    }
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("enter two positive integers, smaller followed by larger: ");
        start_number = console.nextInt();
        end_number = console.nextInt();
        for (int i = start_number; i <= end_number; i++) {
            if (i >= 1000) {
                for (int l = 1; l<= Math.floorDiv(i, 1000) % 10; l++) {
                    System.out.print("M");
                }
            }
            if (i >= 100) {
                Place(Math.floorDiv(i, 100) % 10, "C", "D", "M");
            }
            if (i >= 10) {
                Place(Math.floorDiv(i, 10) % 10, "X", "L", "C");
            }
            Place(i % 10, "I", "V", "X");
            System.out.println();
        }
    }
}
