public class Search{
    public static int linear_search(int[] seq, int value){
        int length = seq.length;

        for(int i = 0; i < length; i++){
            if(value == seq[i]) return i;
        }

        return -1;
    }

    public static int binary_search(int[] seq, int value){
        int mid;
        int first = 0;
        int last = seq.length-1;

        while(last >= first){
            mid = (last+first)/2;
            if(seq[mid] == value) return mid;
            if(value < seq[mid]){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1;
    }
}
