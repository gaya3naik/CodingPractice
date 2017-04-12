/**
 * Created by gnaik on 12/04/17.
 */

//Problem Statement:
// Given an array A[] of n numbers and another number x,
// determines whether or not there exist two elements in S whose sum is exactly x.
public class CheckForPairsInArray {

    static final int MAX_ARRAY_SIZE = 100000;



    private void printPairs(int array[], int firstNum){
        boolean binaryMap[] = new boolean[MAX_ARRAY_SIZE];
        for( int i=0; i<array.length;i++){
            int secondNum = array[i]-firstNum;
            if(secondNum >=0 && binaryMap[secondNum]){
                System.out.println("Pairs are ( " + array[i] + " , "+secondNum+")");
            }
            binaryMap[array[i]-firstNum] = true;
        }
    }

    public static void main(String args){
        int array[] = {12, 13, 4, 5, 2, 32};
        int sum = 17;
        CheckForPairsInArray checkForPairsInArray = new CheckForPairsInArray();
        checkForPairsInArray.printPairs(array, sum);
    }
}
