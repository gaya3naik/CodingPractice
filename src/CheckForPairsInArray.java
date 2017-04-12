/**
 * Created by gnaik on 12/04/17.
 */

//Problem Statement:
// Given an array A[] of n numbers and another number x,
// determines whether or not there exist two elements in S whose sum is exactly x.
public class CheckForPairsInArray {

    static final int MAX_ARRAY_SIZE = 100000;

    static void printPairs(int array[], int firstNum){
        boolean binaryMap[] = new boolean[MAX_ARRAY_SIZE];
        for( int i=0; i<array.length;i++){
            int secondNum = array[i]-firstNum;
            if(secondNum >=0 && binaryMap[secondNum]){
                System.out.println("Pairs are ( " + array[i] + " , "+secondNum+")");
            }
            binaryMap[array[i]] = true;
        }
    }

    public static void main (String[] args)
    {
        int array[] = {1, 4, 45, 6, 10, 8};
        int firstNum = 16;
        printPairs(array,  firstNum);
    }
}
