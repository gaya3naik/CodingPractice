/**
 * Created by gnaik on 14/04/17.
 */
public class MergeSort {

    private int array[];
    private int tempArray[];

    private void sort(int array[], int left, int right){
        this.array = array;
        this.tempArray = new int[array.length];
        if(right > left){
            int middle = left+(right-left)/2;
            sort(array, left, middle);
            sort(array, middle+1, right);
            merge(left, middle, right);
        }
    }

    //Merge two sub arrays of array[]
    private void merge(int left, int middle, int right){
        for(int i = 0; i <= right; i++){
            tempArray[i] = array[i];
        }
        int i=left;
        int j=middle+1;
        int k =left;

        while(i <= middle && j <= right){
            if(tempArray[i] <= tempArray[j]){
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            array[k]= tempArray[i];
            i++;
            k++;
        }

    }

    public static void main(String args[])
    {
        MergeSort mergeSort = new MergeSort();
        int array[] = new int[]{12, 11, 13, 5, 6, 7};

        System.out.println("Array initially is");
        printArray(array);
        mergeSort.sort(array, 0 ,array.length-1);
        System.out.println("After applying merge sort array is");
        printArray(array);
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
