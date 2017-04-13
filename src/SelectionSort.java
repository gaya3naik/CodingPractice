/**
 * Created by gnaik on 13/04/17.
 */
// Takes O(n2) time for sorting and is not an efficient algorithm
public class SelectionSort {

    private void selectionSort(int array[]){
        int i,j, minIndex;
        for(i=0; i<array.length; i++){
            minIndex = i;
            for(j=i+1; j<array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex]= temp;
        }
        for(i =0; i<array.length;i++){
            System.out.print(" "+array[i]);
        }

    }

    public static void main(String args[]){

        int array[] = {2,7,4,1,5,3};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
    }
}
