package MinimumBusRequired;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] familySizes = new int[n];
        int passenger = 0;
        int count = 0; int i = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if(count < familySizes.length) {
                familySizes[count] = num;
                passenger += num;
            }
            count++;
        }

        if(count > familySizes.length){
            System.out.print("Input must be equal with count of family");
        } else {
            System.out.println("Minimum bus required is : " + (int) Math.ceil(passenger / 4.0));
        }

    }
}