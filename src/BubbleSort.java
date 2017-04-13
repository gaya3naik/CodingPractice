/**
 * Created by gnaik on 13/04/17.
 * Best Case O(n)
 * Worst Case O (n2)
 */
public class BubbleSort {

    private void bubbleSort(int array[]){

        for(int i=0; i<array.length; i++){
            for(int j=array.length-1; j>i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1]= temp;
                }
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String args[]){
        int array[] = {2,7,4,1,5,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
    }

}
