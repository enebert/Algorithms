import java.util.*;

public class Heap{

    private int[] heap;
    private int heapSize;

    public Heap(){
        heap = new int[]{0,0,0,0,0,0,0,0,0,0};
        heapSize = heap.length;
    }

    public Heap(int[] array){
        heap = array;
        heapSize = heap.length;
        buildMaxHeap();
    }

    public void heapsort(){
        int size = heapSize -1;
        while(size > 0){
            int temp = heap[size];
            heap[size] = heap[0];
            heap[0] = temp;

            maxHeapify(0, size);

            size--;
        }
    }

    public int[] getHeap(){
        return heap;
    }

    public int getSize(){
        return heapSize;
    }

    public String toString(){
        return Arrays.toString(this.heap);
    }

    private void maxHeapify(int index, int size){
        int left = 2*index +1;
        int right = 2*index + 2;
        int largest = index;

        if (left < size && heap[left] > heap[index]){
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]){
            largest = right;
        }

        if (largest != index){
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            maxHeapify(largest, size);
        }
    }

    private void buildMaxHeap(){
        int testIndex = (heapSize-1) / 2;

        while ( testIndex > -1 ){
            maxHeapify(testIndex, heapSize);
            testIndex--;

        }
    }

}
