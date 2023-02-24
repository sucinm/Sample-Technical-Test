package MinimumBusRequired;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int passenger = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            passenger += num;
            count++;
        }

        if(count != n){
            System.out.print("Input must be equal with count of family");
        } else {
            System.out.println("Minimum bus required is : " + (int) Math.ceil(passenger / 4.0));
        }

    }
}