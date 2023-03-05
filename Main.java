import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputElements = sc.nextLine();

        // extracting values
        String []elements = inputElements.split(",");

        // creating an array of list size
        int []arr = new int[elements.length];

        for(int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }

        // pritning the sum of array elements 
        System.out.println(SumArrayElements.sumArrayElements(arr));

        // closing resource
        sc.close();
    }
}