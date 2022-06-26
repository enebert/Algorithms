import java.util.*;

public class Sort{

    public static void bubble_sort(int[] seq){
        int n = seq.length;
        int j = n-1;
        for(int i=0; i < n-1; i++){
            while(j > i){
                if (seq[j] < seq[j-1]) {
                    int temp = seq[j];
                    seq[j] = seq[j-1];
                    seq[j-1] = temp;
                }
                j--;
            }
            j=n-1;
        }
    }

    public static void insertion_sort(int[] seq){
        int n = seq.length;
        for(int i=1; i<n; i++){
            int key = seq[i];
            int j = i-1;
            while(j>=0 && seq[j]>key){
                seq[j+1] = seq[j];
                j--;
            }
            seq[j+1] = key;
        }
    }

    public static void merge_sort(int[] seq){
        merge_sort_rec(seq, 0, seq.length-1);
    }

    private static void merge_sort_rec(int[] seq, int start, int last){
        if(last - start <= 0){
            return;
        }

        int mid = (start + last) / 2;

        merge_sort_rec(seq, start, mid);
        merge_sort_rec(seq, mid+1, last);
        merge(seq, start, mid, last);
    }

    private static void merge(int[] seq, int start, int mid, int stop){
        int leftLength;
        int rightLength;

        int[] tempLeft = Arrays.copyOfRange(seq, start, mid+1);
        int[] tempRight = Arrays.copyOfRange(seq, mid+1, stop+1);

        leftLength = tempLeft.length;
        rightLength = tempRight.length;

        int index = 0;
        int leftCounter = 0;
        int rightCounter = 0;

        while( (leftCounter < leftLength) && (rightCounter < rightLength)){
            if(tempLeft[leftCounter] < tempRight[rightCounter]){
                seq[start+index] = tempLeft[leftCounter];
                leftCounter++;
                index++;
            } else{
                seq[start+index] = tempRight[rightCounter];
                rightCounter++;
                index++;
            }
        }

        while(leftCounter < leftLength){
            seq[start+index] = tempLeft[leftCounter];
            leftCounter++;
            index++;
        }

        while(rightCounter < rightLength){
            seq[start+index] = tempRight[rightCounter];
            rightCounter++;
            index++;
        }
    }

    public static void quicksort(int[] array){
        quicksort(array, 0, array.length-1);
    }

    private static void quicksort(int[] array, int start, int last){
        if (start >= last) return;

        int index = partition(array, start, last);

        quicksort(array, start, index-1);
        quicksort(array, index+1, last);

    }

    private static int partition(int[] array, int start, int last){
        int pivot = array[last];
        int index = start-1;

        for (int j = start; j < last; j++){
            if( array[j] <= pivot){
                index++;

                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[last];
        array[last] = array[index+1];
        array[index+1] = temp;

        return ++index;
    }
}
