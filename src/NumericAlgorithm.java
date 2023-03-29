import java.util.*;

public class NumericAlgorithm {

    public static void MinimumBusRequired(){
        System.out.println("Algorithm for Minimum Bus Required");
        System.out.println("Input sample test: ");
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
            System.out.println("Input must be equal with count of family");
        } else {
            System.out.println("Minimum bus required is : " + (int) Math.ceil(passenger / 4.0));
        }
    }

    public static void findUniqueNumbers(List<Integer> numbers) {
        System.out.println("Algorithm for find unique numbers");
        Map<Integer, Integer> temporaryTable = new HashMap<>();
        for (int element : numbers) {
            if (temporaryTable.containsKey(element)) {
                temporaryTable.put(element, temporaryTable.get(element) + 1);
            } else {
                temporaryTable.put(element, 1);
            }
        }
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : temporaryTable.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }
        System.out.println("the unique numbers:" + uniqueNumbers);;
    }

    public static void findMaxSum(int[] numbers) {
        System.out.println("Algorithm for find max sum");
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int currentTotal = numbers[i] + numbers[j];
                if (currentTotal > total) {
                    total = currentTotal;
                }
            }
        }
        System.out.println("The sum of the elements: " + total);
    }
}
