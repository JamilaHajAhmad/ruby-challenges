import java.util.*;

public class missingNumbersGame {
    void findMissingNumbers(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
        System.out.println("The Missing Number(s):");
        for (int i = min; i <= max; i++) {
            if (!numbers.contains(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        missingNumbersGame obj = new missingNumbersGame();
        int[] array = {2,1,5,4,6,9,7,8,10};
        obj.findMissingNumbers(array);
    }
}

/*
    1. findMissingNumbers method takes array of type int as a parameter, then
    it takes the minimum and the maximum values from that array by:
    First step is to convert the array into an IntStream, which is a stream of primitive int values,
    to let us perform stream operations on the array,
    Second step by the min() or max() method which are a terminal operation that finds the required value in the stream.
    It returns an OptionalInt.
    Last step by the last method which extracts the integer value from the OptionalInt.

    2. An ArrayList was created and filled with the values from the primary array
    so that we can benefit from the ArrayList methods

    3. From the minimum value to the maximum value the if statement in the for loop
    will search for the missing number(s).

    4. An object was created to test the code
 */