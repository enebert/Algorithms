import java.lang.Math;

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
        int last = seq.length-1;
        if (last <= 1) return;

        q = Math.floor((last/2));

        merge(merge_sort(firsHalf), merge_sort(lastHalf));
    }

    public static void merge_sort_mod(int[] seq){

    }

    private static int[] merge(int[] s, int[] n){

    }
}
