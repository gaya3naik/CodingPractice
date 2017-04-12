import java.util.HashSet;

/**
 * Created by gnaik on 12/04/17.
 */
//Problem Statement: Given two unsorted arrays, find all pairs whose sum is x
public class CheckForPairsInTwoArrays {


    public static void main(String args[]){

        int array1[]= {-1, -2, 4, -6, 5, 7};
        int array2[]= {6, 3, 4, 0};
        int x = 8;
        checkForPairsInTwoArrays(array1, array2, x);
        int array11[] = {1, 2, 4, 5, 7};
        int array22[] = {5, 6, 3, 4, 8};
        x = 9;
        checkForPairsInTwoArrays(array11, array22, x);
    }

    static void checkForPairsInTwoArrays(int array1[], int array2[], int sum){
        HashSet<Integer> firstArraySet = new HashSet<Integer>();
        for(int i=0; i<array1.length; i++){
            firstArraySet.add(array1[i]);
        }
        for(int i =0; i<array2.length; i++){
            if(firstArraySet.contains(sum-array2[i])){
                System.out.println("Pairs are  ( "+ (sum-array2[i]) +" , "+ array2[i] +" )s");
            }
        }
    }
}
