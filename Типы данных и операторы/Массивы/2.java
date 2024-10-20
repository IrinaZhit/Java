import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // 1.toString
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1: " + Arrays.toString(arr1));

        // 2. binarySearch
        int[] sortedArr = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(sortedArr, 5);
        System.out.println("Index of 5 in sortedArr: " + index);

        // 3.equals
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr2, arr3);
        System.out.println("Are arr2 and arr3 equal? " + isEqual);

        // 4.compare
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {1, 2, 4};
        int comparisonResult = Arrays.compare(arr4, arr5);
        System.out.println("Comparison result between arr4 and arr5: " + comparisonResult);

        // 5.sort
        int[] unsortedArr = {5, 3, 8, 1, 2};
        Arrays.sort(unsortedArr);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArr));
    }
}
