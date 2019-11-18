public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava bj = new BasicJava();
        // bj.printNum();
        // bj.arrIterate();
        int[] arr = {1,-2,-3,0,5};
        // bj.greaterThanY(arr, 3);
        // bj.squareValues(arr);
        int[] arr1 = arr;
        bj.eliminateNeg(arr1);
        bj.shift(arr1);
    }
}