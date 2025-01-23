package datastructures.classes;

/**
 * @author nnkipkorir
 * created 17/01/2025
 */

public class Test {
    public static void main(String[] args) {
        int[] arr = {6, 7, 2,8, 5, 10};
       // bubbleSort(arr);

        selectionSort(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }

   public static void bubbleSort(int[] arr) {
        int size = arr.length;
        //we are doing comparisons in a decreasing manner
       //if length is 5 we start with 4 comparison
        for (int i = size -1 ; i > 0; i--) {
            for(int j= 0 ; j < i ; j ++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
   }

   public static void selectionSort(int[] arr) {

       int size = arr.length;
       for (int i = 0; i < size; i++) {
           int minIndex = i;
           for (int j = i + 1; j < size; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           //After completing comparing all the inner values check if min index remains the same
           //if yes swap the values
           if (i != minIndex) {
               int temp = arr[i];
               arr[i] = arr[minIndex];
               arr[minIndex] = temp;
           }

       }

   }

   public static void insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {

        }
   }
}
