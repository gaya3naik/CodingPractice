import java.util.HashMap;

/**
 * Created by gnaik on 12/04/17.
 */

//Problem Statement: Check if two arrays are equal or not
public class AreTwoArraysEqual {

    public static void main(String args[]){
        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {2, 4, 5, 0, 1};
        int arr11[] = {1, 2, 5, 4, 0, 2, 1};
        int arr22[] = {2, 4, 5, 0, 1, 1, 2};
        System.out.println(areTheseTwoArraysEqual(arr1, arr2));
        System.out.println(areTheseTwoArraysEqual(arr11, arr22));
    }

    private static boolean areTheseTwoArraysEqual(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            return false;
        }
        HashMap<Integer, Integer> firstArrayMap = new HashMap<Integer, Integer>();
         for(int i =0; i<arr1.length; i++){
              if(firstArrayMap.containsKey(arr1[i])){
                        firstArrayMap.put(arr1[i], firstArrayMap.get(arr1[1])+1);
              } else {
                    firstArrayMap.put(arr1[i], 1);
              }
         }
         for (int i =0; i<arr2.length; i++){
             if(!firstArrayMap.containsKey(arr2[i])){
                 return false;
             } else {
                 int count = firstArrayMap.get(arr2[i]);
                 count--;
                 firstArrayMap.put(arr2[i], count);
             }
         }

        for(int i =0; i<arr1.length; i++){
            if(firstArrayMap.get(arr1[i]) >0){
                return false;
            }
        }
         return true;
    }
}
