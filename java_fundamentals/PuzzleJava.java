import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public ArrayList<Integer> printSum(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0 ;
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            sum = sum+arr[i];
            if(arr[i]>10) {
                arrlist.add(arr[i]);
            }
        }
        return arrlist;
    }
    public ArrayList<String> shuffleNames() {
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa");
        Collections.shuffle(arr);
        System.out.println("Array is "+ arr);
        for(String name: arr) {
            if(name.length()>5) {
                names.add(name);
            }
        }
        System.out.println("Array Names of chars > 5 " + names);
        return names;
    }
    public void shuffle26() {
        String[] ch = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
        "o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> strArray = new ArrayList<String>();
        for(String chars: ch) {
            strArray.add(chars);
        }
        System.out.println("Before"+ strArray);
        Collections.shuffle(strArray);
        System.out.println("after"+ strArray); 
        if(strArray.get(0) == "a" || strArray.get(0) =="e" || strArray.get(0) =="i" || strArray.get(0) =="o" || strArray.get(0) =="u") {
            System.out.println("First letter is vowel");
        }     
    }
    public int[] random() {
        Random r = new Random();
        int[] arr = new int[10];
        int low = 55;
        int high = 100;
        for(int i=0 ; i<10; i++){
            int result = r.nextInt(high-low) + low;
            System.out.println("result"+ result);
            arr[i] = result;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public void sort() {
        Integer[] arr = {4,2,9,6,7};
        ArrayList<Integer> arrlist = new ArrayList<>();
        Collections.addAll(arrlist, arr);
        Collections.sort(arrlist);
        System.out.println("Sort"+ arrlist);
        System.out.println("Min value "+ arrlist.get(0));
        System.out.println("Max value "+ arrlist.get(arrlist.size()-1));
    }
    public void randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        String[] str = new String[10];
        String generatedString = " ";
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for(int j=0; j<10; j++) {
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + 
                                (random.nextInt((rightLimit - leftLimit ))) ;
                buffer.append((char) randomLimitedInt);
                generatedString = buffer.toString();
                // System.out.println(generatedString);
                
            }
            str[j] = generatedString;
            buffer.setLength(0);
        }
        // String generatedString = buffer.toString();
        System.out.println(Arrays.toString(str));
        // System.out.println(generatedString);
        
    }
}