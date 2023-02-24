package SortCharFromString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input sample test: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase().replace(" ", "");
        String vowel = "";
        String consonant = "";

        for(int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (isVowel(c)) {
                vowel = vowel + c;
            } else {
                consonant = consonant + c;
            }
        }

        System.out.println("Vowel Characters :");
        System.out.println(sortCharsByPosition(vowel));
        System.out.println("Consonant Characters :");
        System.out.println(sortCharsByPosition(consonant));
    }

    public static boolean isVowel(Character c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }

    public static String sortAscByNumericalOrder(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return sortedString;
    }

    public static String sortCharsByPosition(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; ++i) {
            char c = charArray[i];
            if (str.contains(String.valueOf(c)) && !sb.toString().contains(String.valueOf(c))) {
                for(int j = i + 1; j < charArray.length; ++j) {
                    if (charArray[j] == c) {
                        sb.append(charArray[j]);
                    }
                }

                sb.append(c);
            }
        }

        return sb.toString();
    }
}
