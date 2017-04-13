/**
 * Created by gnaik on 13/04/17.
 */
// O(n2)
public class InsertionSort {

    private void insertionSort(int array[]){

        for(int i = 1; i<array.length;i++){

            int element = array[i];
            int j = i;
            while( j > 0 && array[j-1] > element) {
                array[j] = array[j - 1];
                j = j - 1;
            }
                array[j] = element;
        }
        for(int i =0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }

    public static void main(String args[]){
        int array[]= {23, 42, 4, 16, 8 , 15};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
    }
}
