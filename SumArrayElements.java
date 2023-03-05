public class SumArrayElements {
    public static int sumArrayElements(int[] arr) {
        // declaring variables
        int sum = 0;

        for(int element : arr) {
            sum += element;
        }

        // returning sum
        return sum;
    }
}