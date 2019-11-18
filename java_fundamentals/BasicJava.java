import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    int[] arr = {1,2,3,4};
    public void printNum() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        int sum = 0;
        for(int i=1; i<=255; i++) {
            System.out.println("Number is "+i);
            sum = sum + i;
            System.out.println("Sum is "+ sum);
            if(i%2 != 0) {
                System.out.println("Odd num is "+ i);
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public void arrIterate() {
        int max = 0;
        int min = arr[0];
        double sum = 0;
        double avg;
        for(int i=0; i<arr.length; i++) {
            System.out.println("Array element is "+ arr[i]);
            sum += arr[i];
            if(arr[i]>max) {
                max = arr[i];        
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is "+ min);
        System.out.println("Max is "+ max);
        System.out.println("Sum is "+ sum);
        System.out.println("Length is "+arr.length); 
        avg = sum/arr.length;
        System.out.println("Avg is "+ avg);
    }
    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > y) {
                count++;
            }
        }
        System.out.printf("Count of greater than y is "
        + count);

    }
    public void squareValues(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void eliminateNeg(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void shift(int[] arr) {
        for(int i = 1; i<arr.length; i++) {
            arr[i-1] = arr[i];
            if(i==arr.length-1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}