import java.util.ArrayList;
import java.util.Arrays;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum = pj.printSum();
        System.out.println(sum);
        ArrayList<String> names = new ArrayList<String>();
        names = pj.shuffleNames();
        System.out.println(names);
        pj.shuffle26();
        int[] arr = new int[10];
        arr = pj.random();
        System.out.println(Arrays.toString(arr));
        pj.sort();
        pj.randomString();
    }      
}