
import java.util.Scanner;

public class SearchElement {
    public static boolean  SearchElement(int arr[],int target){
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your target");

        int targ = sc.nextInt();

        System.out.print("Enter the number of elements you want to store: ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) 
            {
            System.out.print("Element " + (i + 1) + ": ");

            arr[i] = sc.nextInt(); 
        }
    
        if(SearchElement(arr, targ)){

            System.out.println("the number is found ");

        }
        if(!SearchElement(arr, targ)){

            System.out.println("the number is not found ");
            
        }

    }
}
